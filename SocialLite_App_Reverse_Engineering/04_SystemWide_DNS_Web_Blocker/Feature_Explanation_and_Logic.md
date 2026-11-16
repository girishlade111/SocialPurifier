# 04. सिस्टीम-वाईड वेब आणि DNS ब्लॉकर (System-Wide Web & DNS Blocker)

## १. फिचरचे काम (What It Does)
अनेक हुशार युजर्स जेव्हा ॲप्स ब्लॉक होतात, तेव्हा फोनच्या ब्राऊझरमध्ये (Google Chrome, Samsung Internet, Firefox, Edge) जाऊन सोशल मीडियाच्या वेबसाईट्स (उदा. `instagram.com`, `youtube.com`, `tiktok.com`, `reddit.com`) वापरू लागतात.

SocialLite चे **WebBlockerVpnService** हे संपूर्ण फोनवरील कोणत्याही ब्राऊझरमधील सोशल मीडिया आणि व्यसनाधीन वेबसाईट्स ब्लॉक करते.

विशेष म्हणजे:
- हे कोणत्याही **बाहेरील सर्व्हरवर डेटा पाठवत नाही (100% On-Device, Privacy-First)**.
- हे फोनमध्येच एक **स्थानिक व्हर्च्युअल VPN (Local Virtual TUN Interface)** तयार करते.
- हे फक्त **DNS (Domain Name System) पॅकेट्स (Port 53)** तपासते, ज्यामुळे फोनचा इंटरनेट स्पीड अजिबात कमी होत नाही आणि बॅटरी खर्च होत नाही.

---

## २. ब्लॉक केलेल्या डोमेन्सची यादी (Blocked Domains)

SocialLite खालील सोशल मीडिया डोमेन्स आणि त्यांच्या सर्व सब-डोमेन्सना सिस्टीम-वाईड ब्लॉक करते:
- `*.instagram.com`
- `*.youtube.com`, `*.youtu.be`
- `*.tiktok.com`
- `*.twitter.com`, `*.x.com`
- `*.facebook.com`, `*.fb.com`
- `*.snapchat.com`
- `*.reddit.com`
- युजरने ॲड केलेले कस्टम डोमेन्स (Custom Blocked Websites)

---

## ३. हाय-लेव्हल कार्यप्रणाली (High-Level Architecture)

```mermaid
sequenceDiagram
    autonumber
    actor User as युजर / ब्राऊझर (Chrome)
    participant VPN as WebBlockerVpnService (Local TUN)
    participant Filter as DNS पॅकेट फिल्टर (nc.c)
    participant Upstream as खरा DNS सर्व्हर (Google / Cloudflare)

    User->>VPN: DNS Query: instagram.com विचारली (UDP Port 53)
    VPN->>Filter: पॅकेटमधील डोमेन नाव पार्स केले
    alt डोमेन ब्लॉक लिस्टमध्ये आहे (Blocked Domain)
        Filter->>VPN: डोमेन ब्लॉक आहे!
        VPN-->>User: तात्काळ NXDOMAIN / REFUSED रिस्पॉन्स पाठवला (0ms)
        Note over User: ब्राऊझरमध्ये "Site can't be reached" एरर दिसते!
    else डोमेन सुरक्षित आहे (Allowed Domain)
        Filter->>Upstream: DNS Query पुढे फॉरवर्ड केली
        Upstream-->>VPN: खरा IP ॲड्रेस मिळाला
        VPN-->>User: IP ॲड्रेस ब्राऊझरला दिला
    end
```
