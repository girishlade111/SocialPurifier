/**
 * SocialPurifier Multi-Platform Purification Engine
 * Brand: LadeStack | Owner: Girish Lade
 * Copyright (c) 2026 LadeStack. All rights reserved.
 */
(function() {
    'use strict';

    var host = window.location.hostname.toLowerCase();
    var config = window.__PURIFIER_CONFIG__ || {
        ytShorts: true,
        ytFeed: false,
        ytComments: false,
        igReels: true,
        igExplore: true,
        igFeed: false,
        igDm: false,
        fbReels: true,
        fbFeed: false,
        redditFeed: false,
        twitterTrends: true
    };

    function injectCSS(cssText) {
        var style = document.createElement('style');
        style.type = 'text/css';
        style.appendChild(document.createTextNode(cssText));
        (document.head || document.documentElement).appendChild(style);
    }

    // 1. Universal Screen-Off Background Media Engine
    function enableBackgroundPlayback() {
        try {
            Object.defineProperty(document, 'hidden', { get: function() { return false; }, configurable: true });
            Object.defineProperty(document, 'visibilityState', { get: function() { return 'visible'; }, configurable: true });
            Object.defineProperty(document, 'webkitVisibilityState', { get: function() { return 'visible'; }, configurable: true });

            var blockEvents = ['visibilitychange', 'webkitvisibilitychange', 'blur', 'pagehide'];
            for (var i = 0; i < blockEvents.length; i++) {
                window.addEventListener(blockEvents[i], function(e) { e.stopImmediatePropagation(); }, true);
                document.addEventListener(blockEvents[i], function(e) { e.stopImmediatePropagation(); }, true);
            }
        } catch (_) {}
    }

    // 2. YouTube Purification Engine
    function purifyYouTube() {
        var css = '';
        if (config.ytShorts) {
            css += `
                ytd-rich-shelf-renderer[is-shorts],
                ytd-reel-shelf-renderer,
                ytm-reel-shelf-renderer,
                a[href*="/shorts/"],
                ytm-pivot-bar-item-renderer:nth-child(2),
                .pivot-shorts,
                .ytd-shorts,
                ytm-shorts-lockup-view-model { display: none !important; }
            `;
        }
        if (config.ytFeed) {
            css += `
                ytd-rich-grid-renderer,
                ytm-rich-grid-renderer,
                #contents.ytd-rich-grid-renderer { display: none !important; }
            `;
        }
        if (config.ytComments) {
            css += `
                #comments,
                ytd-comments,
                ytm-comments-entry-point-header-renderer { display: none !important; }
            `;
        }
        // Always strip ad banners & autoplay prompts
        css += `
            .ad-container,
            .ytp-ad-overlay-container,
            .ytm-promoted-sparkles-web-renderer,
            ytd-promoted-video-renderer { display: none !important; }
        `;
        injectCSS(css);

        // Auto-skip video advertisements
        setInterval(function() {
            var skip = document.querySelector('.ytp-ad-skip-button, .ytp-ad-skip-button-modern, .ytp-skip-ad-button');
            if (skip) skip.click();
            var adVideo = document.querySelector('.ad-interrupting video');
            if (adVideo && isFinite(adVideo.duration)) {
                adVideo.currentTime = adVideo.duration;
            }
        }, 500);
    }

    // 3. Instagram Purification Engine
    function purifyInstagram() {
        var css = '';
        if (config.igReels) {
            css += `
                a[href*="/reels/"],
                svg[aria-label="Reels"],
                div:has(> a[href*="/reels/"]),
                div[role="dialog"]:has(video) { display: none !important; }
            `;
        }
        if (config.igExplore) {
            css += `
                a[href*="/explore/"],
                svg[aria-label="Search and Explore"],
                svg[aria-label="Explore"] { display: none !important; }
            `;
        }
        if (config.igFeed) {
            css += `
                main[role="main"] > section > div > div > article,
                main[role="main"] > div > div > article { display: none !important; }
            `;
        }
        if (config.igDm) {
            css += `
                a[href*="/direct/inbox/"],
                svg[aria-label="Direct"],
                svg[aria-label="Messenger"],
                svg[aria-label="Share Post"] { display: none !important; }
            `;
        }
        injectCSS(css);
    }

    // 4. Facebook Purification Engine
    function purifyFacebook() {
        var css = '';
        if (config.fbReels) {
            css += `
                div[aria-label*="Reels"],
                a[href*="/reel/"],
                div:has(> a[href*="/reel/"]) { display: none !important; }
            `;
        }
        if (config.fbFeed) {
            css += `
                div[role="feed"],
                #m_newsfeed_stream { display: none !important; }
            `;
        }
        injectCSS(css);
    }

    // 5. Reddit Purification Engine
    function purifyReddit() {
        var css = '';
        if (config.redditFeed) {
            css += `
                shreddit-feed,
                div[data-testid="post-container"] { display: none !important; }
            `;
        }
        injectCSS(css);
    }

    // 6. Twitter / X Purification Engine
    function purifyTwitter() {
        var css = '';
        if (config.twitterTrends) {
            css += `
                div[aria-label="Timeline: Trending now"],
                div[data-testid="trend"],
                div[aria-label="Explore"] { display: none !important; }
            `;
        }
        injectCSS(css);
    }

    // Execute modules
    enableBackgroundPlayback();

    if (host.indexOf('youtube.com') !== -1) {
        purifyYouTube();
    } else if (host.indexOf('instagram.com') !== -1) {
        purifyInstagram();
    } else if (host.indexOf('facebook.com') !== -1) {
        purifyFacebook();
    } else if (host.indexOf('reddit.com') !== -1) {
        purifyReddit();
    } else if (host.indexOf('twitter.com') !== -1 || host.indexOf('x.com') !== -1) {
        purifyTwitter();
    }

    console.log('[SocialPurifier] Active for ' + host);
})();
