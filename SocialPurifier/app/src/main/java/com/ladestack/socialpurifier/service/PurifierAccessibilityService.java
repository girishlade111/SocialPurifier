package com.ladestack.socialpurifier.service;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ladestack.socialpurifier.data.PurifierPreferences;
import com.ladestack.socialpurifier.ui.BlockerActivity;
import java.util.List;

/**
 * SocialPurifier Accessibility Engine
 * Brand: LadeStack | Owner: Girish Lade
 * Copyright (c) 2026 LadeStack. All rights reserved.
 *
 * Dedicated strictly to Digital Wellbeing & Distraction Removal.
 * Strictly adheres to Google Play Accessibility Services Policy.
 */
public class PurifierAccessibilityService extends AccessibilityService {

    private PurifierPreferences preferences;
    private long lastActionTime = 0;

    // Target View IDs for Reels / Shorts
    private static final String[] IG_REELS_IDS = {
        "com.instagram.android:id/clips_viewer_view_pager",
        "com.instagram.android:id/clips_viewer_container",
        "com.instagram.android:id/reel_viewer_container",
        "com.instagram.android:id/clips_video_container"
    };

    private static final String[] IG_DM_IDS = {
        "com.instagram.android:id/direct_message_list",
        "com.instagram.android:id/direct_thread_layout",
        "com.instagram.android:id/direct_thread_feed_recycler_view"
    };

    private static final String[] YT_SHORTS_IDS = {
        "com.google.android.youtube:id/shorts_player_container",
        "com.google.android.youtube:id/reel_recycler",
        "com.google.android.youtube:id/shorts_player",
        "com.google.android.youtube:id/reel_watch_fragment_root"
    };

    private static final String[] FB_REELS_IDS = {
        "com.facebook.katana:id/watch_feed_fragment",
        "com.facebook.katana:id/fb_shorts_container"
    };

    @Override
    public void onCreate() {
        super.onCreate();
        this.preferences = new PurifierPreferences(this);
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        AccessibilityServiceInfo info = new AccessibilityServiceInfo();
        info.eventTypes = AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED | AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED;
        info.feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC;
        info.flags = AccessibilityServiceInfo.FLAG_RETRIEVE_INTERACTIVE_WINDOWS | AccessibilityServiceInfo.FLAG_REPORT_VIEW_IDS;
        info.notificationTimeout = 100;
        setServiceInfo(info);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        if (event == null || event.getPackageName() == null) {
            return;
        }

        String packageName = event.getPackageName().toString();

        // Never self-block
        if (packageName.equals(getPackageName())) {
            return;
        }

        // 1. Full Native App Blocker
        if (preferences.isPackageBlocked(packageName) || preferences.isFocusModeActive()) {
            if (preferences.getBlockedPackages().contains(packageName)) {
                launchBlockerOverlay(packageName, "App is restricted by SocialPurifier");
                return;
            }
        }

        // 2. In-App Specific Distraction Filter
        inspectInAppDistractions(packageName);
    }

    private void inspectInAppDistractions(String packageName) {
        long now = System.currentTimeMillis();
        if (now - lastActionTime < 1200) {
            return; // Debounce
        }

        AccessibilityNodeInfo rootNode = getRootInActiveWindow();
        if (rootNode == null) {
            return;
        }

        try {
            // Instagram Checks
            if ("com.instagram.android".equals(packageName)) {
                if (preferences.isIgReelsBlocked() && matchAnyId(rootNode, IG_REELS_IDS)) {
                    dismissDistraction("Instagram Reels Dismissed");
                    return;
                }
                if (preferences.isIgDmBlocked() && matchAnyId(rootNode, IG_DM_IDS)) {
                    dismissDistraction("Instagram Direct Messages Dismissed");
                    return;
                }
            }

            // YouTube Shorts Check
            if ("com.google.android.youtube".equals(packageName)) {
                if (preferences.isYtShortsBlocked() && matchAnyId(rootNode, YT_SHORTS_IDS)) {
                    dismissDistraction("YouTube Shorts Dismissed");
                    return;
                }
            }

            // Facebook Reels Check
            if ("com.facebook.katana".equals(packageName)) {
                if (preferences.isFbReelsBlocked() && matchAnyId(rootNode, FB_REELS_IDS)) {
                    dismissDistraction("Facebook Reels Dismissed");
                    return;
                }
            }
        } finally {
            rootNode.recycle();
        }
    }

    private boolean matchAnyId(AccessibilityNodeInfo root, String[] ids) {
        for (String id : ids) {
            List<AccessibilityNodeInfo> nodes = root.findAccessibilityNodeInfosByViewId(id);
            if (nodes != null && !nodes.isEmpty()) {
                for (AccessibilityNodeInfo n : nodes) {
                    if (n.isVisibleToUser()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void dismissDistraction(String logMsg) {
        lastActionTime = System.currentTimeMillis();
        performGlobalAction(GLOBAL_ACTION_BACK);
        preferences.addMinutesSaved(2);
    }

    private void launchBlockerOverlay(String targetPackage, String reason) {
        Intent intent = new Intent(this, BlockerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("target_package", targetPackage);
        intent.putExtra("reason", reason);
        startActivity(intent);
    }

    @Override
    public void onInterrupt() {}
}
