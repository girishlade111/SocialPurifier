package com.ladestack.socialpurifier.ui;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import com.ladestack.socialpurifier.R;
import com.ladestack.socialpurifier.data.PurifierPreferences;
import com.ladestack.socialpurifier.service.PurifierAccessibilityService;
import java.io.InputStream;

/**
 * SocialPurifier Main Controller
 * Brand: LadeStack | Owner: Girish Lade
 * Copyright (c) 2026 LadeStack. All rights reserved.
 */
public class MainActivity extends Activity {

    private WebView webView;
    private ScrollView settingsPanel;
    private PurifierPreferences preferences;
    private String currentPlatformUrl = "https://m.youtube.com";
    private String purifierScript = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = new PurifierPreferences(this);
        loadPurifierScript();

        initViews();
        setupWebView();
        loadPlatform(currentPlatformUrl);
    }

    @Override
    protected void onResume() {
        super.onResume();
        updatePermissionIndicators();
        updateSettingsUI();
    }

    private void initViews() {
        webView = findViewById(R.id.purifier_webview);
        settingsPanel = findViewById(R.id.settings_scroll_panel);

        // Platform Switcher
        findViewById(R.id.btn_tab_youtube).setOnClickListener(v -> loadPlatform("https://m.youtube.com"));
        findViewById(R.id.btn_tab_instagram).setOnClickListener(v -> loadPlatform("https://www.instagram.com"));
        findViewById(R.id.btn_tab_facebook).setOnClickListener(v -> loadPlatform("https://m.facebook.com"));
        findViewById(R.id.btn_tab_reddit).setOnClickListener(v -> loadPlatform("https://www.reddit.com"));
        findViewById(R.id.btn_tab_twitter).setOnClickListener(v -> loadPlatform("https://mobile.twitter.com"));

        // Bottom Navigation
        Button btnNavPurifier = findViewById(R.id.nav_btn_purifier);
        Button btnNavSettings = findViewById(R.id.nav_btn_settings);

        btnNavPurifier.setOnClickListener(v -> {
            settingsPanel.setVisibility(View.GONE);
            webView.setVisibility(View.VISIBLE);
            findViewById(R.id.platform_scroll_bar).setVisibility(View.VISIBLE);
        });

        btnNavSettings.setOnClickListener(v -> {
            webView.setVisibility(View.GONE);
            findViewById(R.id.platform_scroll_bar).setVisibility(View.GONE);
            settingsPanel.setVisibility(View.VISIBLE);
            updatePermissionIndicators();
            updateSettingsUI();
        });

        // Permission Grant Buttons
        findViewById(R.id.btn_grant_accessibility).setOnClickListener(v -> {
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            startActivity(intent);
        });

        findViewById(R.id.btn_grant_overlay).setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                        Uri.parse("package:" + getPackageName()));
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_grant_usage).setOnClickListener(v -> {
            Intent intent = new Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS);
            startActivity(intent);
        });

        // Focus Mode Toggle
        Button btnToggleFocus = findViewById(R.id.btn_toggle_focus);
        btnToggleFocus.setOnClickListener(v -> {
            boolean active = !preferences.isFocusModeActive();
            preferences.setFocusMode(active, 30 * 60 * 1000);
            updateSettingsUI();
        });

        // Hard Mode Switch
        Switch switchHard = findViewById(R.id.switch_hard_mode);
        switchHard.setChecked(preferences.isHardMode());
        switchHard.setOnCheckedChangeListener((bv, isChecked) -> preferences.setHardMode(isChecked));

        // YouTube Switches
        setupSwitch(R.id.switch_yt_shorts, preferences.isYtShortsBlocked(), (bv, isChecked) -> {
            preferences.setYtShortsBlocked(isChecked);
            refreshPurifierConfig();
        });
        setupSwitch(R.id.switch_yt_feed, preferences.isYtFeedBlocked(), (bv, isChecked) -> {
            preferences.setYtFeedBlocked(isChecked);
            refreshPurifierConfig();
        });
        setupSwitch(R.id.switch_yt_comments, preferences.isYtCommentsBlocked(), (bv, isChecked) -> {
            preferences.setYtCommentsBlocked(isChecked);
            refreshPurifierConfig();
        });

        // Instagram Switches
        setupSwitch(R.id.switch_ig_reels, preferences.isIgReelsBlocked(), (bv, isChecked) -> {
            preferences.setIgReelsBlocked(isChecked);
            refreshPurifierConfig();
        });
        setupSwitch(R.id.switch_ig_explore, preferences.isIgExploreBlocked(), (bv, isChecked) -> {
            preferences.setIgExploreBlocked(isChecked);
            refreshPurifierConfig();
        });
        setupSwitch(R.id.switch_ig_feed, preferences.isIgFeedBlocked(), (bv, isChecked) -> {
            preferences.setIgFeedBlocked(isChecked);
            refreshPurifierConfig();
        });
        setupSwitch(R.id.switch_ig_dm, preferences.isIgDmBlocked(), (bv, isChecked) -> {
            preferences.setIgDmBlocked(isChecked);
            refreshPurifierConfig();
        });

        // Other Switches
        setupSwitch(R.id.switch_fb_reels, preferences.isFbReelsBlocked(), (bv, isChecked) -> {
            preferences.setFbReelsBlocked(isChecked);
            refreshPurifierConfig();
        });
        setupSwitch(R.id.switch_twitter_trends, preferences.isTwitterTrendsBlocked(), (bv, isChecked) -> {
            preferences.setTwitterTrendsBlocked(isChecked);
            refreshPurifierConfig();
        });
    }

    private void setupSwitch(int id, boolean initial, Switch.OnCheckedChangeListener listener) {
        Switch sw = findViewById(id);
        sw.setChecked(initial);
        sw.setOnCheckedChangeListener(listener);
    }

    private void updatePermissionIndicators() {
        TextView tvAcc = findViewById(R.id.tv_perm_accessibility);
        Button btnAcc = findViewById(R.id.btn_grant_accessibility);
        boolean isAccGranted = isAccessibilityServiceEnabled();
        tvAcc.setText("1. Accessibility Blocker: " + (isAccGranted ? "GRANTED" : "NOT GRANTED"));
        btnAcc.setEnabled(!isAccGranted);

        TextView tvOverlay = findViewById(R.id.tv_perm_overlay);
        Button btnOverlay = findViewById(R.id.btn_grant_overlay);
        boolean isOverlayGranted = Build.VERSION.SDK_INT < Build.VERSION_CODES.M || Settings.canDrawOverlays(this);
        tvOverlay.setText("2. Display Over Apps: " + (isOverlayGranted ? "GRANTED" : "NOT GRANTED"));
        btnOverlay.setEnabled(!isOverlayGranted);

        TextView tvUsage = findViewById(R.id.tv_perm_usage);
        Button btnUsage = findViewById(R.id.btn_grant_usage);
        boolean isUsageGranted = isUsageAccessGranted();
        tvUsage.setText("3. Usage Stats Access: " + (isUsageGranted ? "GRANTED" : "NOT GRANTED"));
        btnUsage.setEnabled(!isUsageGranted);
    }

    private boolean isAccessibilityServiceEnabled() {
        int accessibilityEnabled = 0;
        final String service = getPackageName() + "/" + PurifierAccessibilityService.class.getCanonicalName();
        try {
            accessibilityEnabled = Settings.Secure.getInt(
                getContentResolver(),
                android.provider.Settings.Secure.ACCESSIBILITY_ENABLED
            );
        } catch (Settings.SettingNotFoundException ignored) {}

        TextUtils.SimpleStringSplitter colonSplitter = new TextUtils.SimpleStringSplitter(':');
        if (accessibilityEnabled == 1) {
            String settingValue = Settings.Secure.getString(
                getContentResolver(),
                Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES
            );
            if (settingValue != null) {
                colonSplitter.setString(settingValue);
                while (colonSplitter.hasNext()) {
                    String accessibilityService = colonSplitter.next();
                    if (accessibilityService.equalsIgnoreCase(service)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isUsageAccessGranted() {
        AppOpsManager appOps = (AppOpsManager) getSystemService(Context.APP_OPS_SERVICE);
        if (appOps == null) return false;
        int mode = appOps.checkOpNoThrow(AppOpsManager.OPSTR_GET_USAGE_STATS, Process.myUid(), getPackageName());
        return mode == AppOpsManager.MODE_ALLOWED;
    }

    private void updateSettingsUI() {
        TextView tvFocus = findViewById(R.id.tv_focus_status);
        Button btnFocus = findViewById(R.id.btn_toggle_focus);
        if (preferences.isFocusModeActive()) {
            tvFocus.setText("Focus Mode is ACTIVE (Distractions Restricted)");
            btnFocus.setText("End Focus Session");
        } else {
            tvFocus.setText("Focus Mode is Inactive");
            btnFocus.setText(R.string.focus_start);
        }

        TextView tvTimeSaved = findViewById(R.id.tv_stats_time_saved);
        tvTimeSaved.setText("Time Purified Today: " + preferences.getMinutesSaved() + " mins");

        TextView tvStreak = findViewById(R.id.tv_stats_streak);
        tvStreak.setText("Focus Streak: " + preferences.getDayStreak() + " Days");
    }

    private void setupWebView() {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUserAgentString("Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36 SocialPurifier/1.0");

        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                refreshPurifierConfig();
                if (purifierScript != null && !purifierScript.isEmpty()) {
                    view.evaluateJavascript(purifierScript, null);
                }
            }
        });
    }

    private void refreshPurifierConfig() {
        if (webView == null) return;
        String jsConfig = String.format(
            "window.__PURIFIER_CONFIG__ = { ytShorts: %b, ytFeed: %b, ytComments: %b, igReels: %b, igExplore: %b, igFeed: %b, igDm: %b, fbReels: %b, fbFeed: %b, twitterTrends: %b };",
            preferences.isYtShortsBlocked(),
            preferences.isYtFeedBlocked(),
            preferences.isYtCommentsBlocked(),
            preferences.isIgReelsBlocked(),
            preferences.isIgExploreBlocked(),
            preferences.isIgFeedBlocked(),
            preferences.isIgDmBlocked(),
            preferences.isFbReelsBlocked(),
            preferences.isFbFeedBlocked(),
            preferences.isTwitterTrendsBlocked()
        );
        webView.evaluateJavascript(jsConfig, null);
    }

    private void loadPlatform(String url) {
        this.currentPlatformUrl = url;
        settingsPanel.setVisibility(View.GONE);
        webView.setVisibility(View.VISIBLE);
        findViewById(R.id.platform_scroll_bar).setVisibility(View.VISIBLE);
        webView.loadUrl(url);
    }

    private void loadPurifierScript() {
        try {
            InputStream is = getAssets().open("purifier.js");
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            is.close();
            purifierScript = new String(buffer, "UTF-8");
        } catch (Exception e) {
            purifierScript = "";
        }
    }

    @Override
    public void onBackPressed() {
        if (settingsPanel.getVisibility() == View.VISIBLE) {
            settingsPanel.setVisibility(View.GONE);
            webView.setVisibility(View.VISIBLE);
            findViewById(R.id.platform_scroll_bar).setVisibility(View.VISIBLE);
        } else if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
