# Instagram फीड व ॲड फिल्टरिंग लॉजिक (Instagram Feed & Ad Filter Deep-Dive)

## १. पार्श्वभूमी (Background)
Instagram च्या वेब व्हर्जनमध्ये फक्त CSS लपवून चालत नाही, कारण इन्स्टाग्राम बॅकग्राउंडमध्ये `fetch()` द्वारे GraphQL API वरून सतत नवीन सजेस्टेड पोस्ट्स आणि जाहिराती (Sponsored Ads) फेच करत राहते. जर फक्त CSS ने लपवले, तर युजरला रिकाम्या जागा (Blank Spaces) दिसतात आणि अनंत स्क्रोलिंगचा अल्गोरिदम बॅकग्राउंडमध्ये सुरू राहतो.

SocialLite ने हे सोडवण्यासाठी **नेटवर्क रिस्पॉन्स इंटरसेप्शन (Network Response Interception)** तंत्र वापरले आहे.

---

## २. रिस्पॉन्स फिल्टरिंगची कार्यपद्धती (`feed_response_filter.js`)

SocialLite `apktool_out/assets/instagram/feed_response_filter.js` ही फाईल Instagram च्या WebView मध्ये डॉक्युमेंट सुरू होताच इंजेक्ट करते.

### A. GraphQL इंटरसेप्शन (Intercepting GraphQL Requests)
```javascript
function isFeedRequest(input, body) {
  try {
    var url = new URL(typeof input === 'string' ? input : input.url, location.href);
    if (!/^(www\.)?instagram\.com$/.test(url.hostname)) return false;
    
    // इन्स्टाग्राम टाइमलाइन किंवा फीड विनंत्या ओळखणे
    if (/^\/api\/v1\/feed(?:\/|$)/.test(url.pathname)) return true;
    if (!/^\/graphql(?:\/|$)/.test(url.pathname)) return false;
    
    var friendly = url.searchParams.get('fb_api_req_friendly_name');
    return !friendly || /feed|timeline/i.test(friendly);
  } catch (_) { return false; }
}
```

### B. जाहिरात आणि सजेस्टेड पोस्ट्स तपासणी लॉजिक (Reason Filter)
Instagram च्या JSON रिस्पॉन्स मधील प्रत्येक नोडला (Node) तपासले जाते:
```javascript
function reason(node) {
  if (!node || typeof node !== 'object') return '';
  
  // १. जाहिराती (Ads) ओळखणे:
  if (node.ad || node.ad4ad_in_webfeed) {
    return policy.hideAds ? 'ad' : '';
  }
  
  // २. सजेस्टेड पोस्ट्स / एक्स्प्लोर स्टोरीज ओळखणे:
  if (!policy.hideSuggested) return '';
  if (node.explore_story || 
      node.suggested_users || 
      node.stories_netego || 
      node.bloks_netego || 
      node.abra_icebreakers_in_feed_unit || 
      (!node.media && !node.end_of_feed_demarcator)) {
    return 'suggested';
  }
  
  return '';
}
```

### C. JSON ट्री मधील नोड्स काढून टाकणे (Node Stripping & Pagination Fix)
```javascript
var conn = o['xdt_api__v1__feed__timeline__connection'];
if (conn && Array.isArray(conn.edges)) {
  var kept = [];
  for (var j = 0; j < conn.edges.length; j++) {
    var edge = conn.edges[j];
    var why = reason(edge && edge.node);
    
    // जर ॲड किंवा सजेस्टेड असेल, तर ते गाळले जाते:
    if (!why) {
      kept.push(edge);
    }
  }
  conn.edges = kept; // फक्त खऱ्या फॉलो केलेल्या पोस्ट्स ठेवल्या जातात!
  
  // जर पेजवर फक्त सजेस्टेड पोस्ट्स असतील, तर इनफायनाइट लूप टाळण्यासाठी:
  if (!kept.length && conn.page_info && conn.page_info.has_next_page) {
    conn.page_info.has_next_page = false;
    conn.page_info.end_cursor = null;
  }
}
```

---

## ३. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. Android `WebView` तयार करताना `getSettings().setJavaScriptEnabled(true)` करा.
2. `WebViewClient.onPageStarted()` किंवा `onPageFinished()` मध्ये ही जावास्क्रिप्ट फाईल `webView.evaluateJavascript(...)` द्वारे इंजेक्ट करा.
3. युजरच्या सेटिंग्सनुसार `policy.hideAds` आणि `policy.hideSuggested` हे फ्लॅग्ज पास करा.
