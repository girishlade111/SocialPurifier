package com.ladestack.socialpurifier.data;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * SocialPurifier Preferences & Policy Manager
 * Brand: LadeStack | Owner: Girish Lade
 * Copyright (c) 2026 LadeStack. All rights reserved.
 */
public class PurifierPreferences {

    private static final String PREF_NAME = "social_purifier_prefs";

    // Global Focus
    private static final String KEY_FOCUS_ACTIVE = "focus_active";
    private static final String KEY_FOCUS_END_TIME = "focus_end_time";
    private static final String KEY_HARD_MODE = "hard_mode";

    // YouTube Controls
    private static final String KEY_YT_SHORTS = "yt_shorts";
    private static final String KEY_YT_FEED = "yt_feed";
    private static final String KEY_YT_COMMENTS = "yt_comments";

    // Instagram Controls
    private static final String KEY_IG_REELS = "ig_reels";
    private static final String KEY_IG_FEED = "ig_feed";
    private static final String KEY_IG_DM = "ig_dm";
    private static final String KEY_IG_EXPLORE = "ig_explore";

    // Other Platforms
    private static final String KEY_FB_REELS = "fb_reels";
    private static final String KEY_FB_FEED = "fb_feed";
    private static final String KEY_REDDIT_FEED = "reddit_feed";
    private static final String KEY_TWITTER_TRENDS = "twitter_trends";

    // Native App Blocker
    private static final String KEY_BLOCK_NATIVE_APPS = "block_native_apps";
    private static final String KEY_BLOCKED_PACKAGES = "blocked_packages";

    // Gamification & Stats
    private static final String KEY_MINUTES_SAVED = "minutes_saved";
    private static final String KEY_DAY_STREAK = "day_streak";

    private final SharedPreferences prefs;

    public PurifierPreferences(Context context) {
        this.prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    // --- Focus Mode ---
    public boolean isFocusModeActive() {
        if (!prefs.getBoolean(KEY_FOCUS_ACTIVE, false)) {
            return false;
        }
        long endTime = prefs.getLong(KEY_FOCUS_END_TIME, 0);
        if (System.currentTimeMillis() > endTime) {
            setFocusMode(false, 0);
            return false;
        }
        return true;
    }

    public void setFocusMode(boolean active, long durationMillis) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(KEY_FOCUS_ACTIVE, active);
        if (active) {
            editor.putLong(KEY_FOCUS_END_TIME, System.currentTimeMillis() + durationMillis);
        } else {
            editor.putLong(KEY_FOCUS_END_TIME, 0);
        }
        editor.apply();
    }

    public boolean isHardMode() {
        return prefs.getBoolean(KEY_HARD_MODE, false);
    }

    public void setHardMode(boolean enabled) {
        prefs.edit().putBoolean(KEY_HARD_MODE, enabled).apply();
    }

    // --- YouTube Toggles ---
    public boolean isYtShortsBlocked() { return prefs.getBoolean(KEY_YT_SHORTS, true); }
    public void setYtShortsBlocked(boolean val) { prefs.edit().putBoolean(KEY_YT_SHORTS, val).apply(); }

    public boolean isYtFeedBlocked() { return prefs.getBoolean(KEY_YT_FEED, false); }
    public void setYtFeedBlocked(boolean val) { prefs.edit().putBoolean(KEY_YT_FEED, val).apply(); }

    public boolean isYtCommentsBlocked() { return prefs.getBoolean(KEY_YT_COMMENTS, false); }
    public void setYtCommentsBlocked(boolean val) { prefs.edit().putBoolean(KEY_YT_COMMENTS, val).apply(); }

    // --- Instagram Toggles ---
    public boolean isIgReelsBlocked() { return prefs.getBoolean(KEY_IG_REELS, true); }
    public void setIgReelsBlocked(boolean val) { prefs.edit().putBoolean(KEY_IG_REELS, val).apply(); }

    public boolean isIgFeedBlocked() { return prefs.getBoolean(KEY_IG_FEED, false); }
    public void setIgFeedBlocked(boolean val) { prefs.edit().putBoolean(KEY_IG_FEED, val).apply(); }

    public boolean isIgDmBlocked() { return prefs.getBoolean(KEY_IG_DM, false); }
    public void setIgDmBlocked(boolean val) { prefs.edit().putBoolean(KEY_IG_DM, val).apply(); }

    public boolean isIgExploreBlocked() { return prefs.getBoolean(KEY_IG_EXPLORE, true); }
    public void setIgExploreBlocked(boolean val) { prefs.edit().putBoolean(KEY_IG_EXPLORE, val).apply(); }

    // --- Facebook / Reddit / Twitter Toggles ---
    public boolean isFbReelsBlocked() { return prefs.getBoolean(KEY_FB_REELS, true); }
    public void setFbReelsBlocked(boolean val) { prefs.edit().putBoolean(KEY_FB_REELS, val).apply(); }

    public boolean isFbFeedBlocked() { return prefs.getBoolean(KEY_FB_FEED, false); }
    public void setFbFeedBlocked(boolean val) { prefs.edit().putBoolean(KEY_FB_FEED, val).apply(); }

    public boolean isRedditFeedBlocked() { return prefs.getBoolean(KEY_REDDIT_FEED, false); }
    public void setRedditFeedBlocked(boolean val) { prefs.edit().putBoolean(KEY_REDDIT_FEED, val).apply(); }

    public boolean isTwitterTrendsBlocked() { return prefs.getBoolean(KEY_TWITTER_TRENDS, true); }
    public void setTwitterTrendsBlocked(boolean val) { prefs.edit().putBoolean(KEY_TWITTER_TRENDS, val).apply(); }

    // --- Native App Blocker ---
    public boolean isBlockNativeAppsEnabled() { return prefs.getBoolean(KEY_BLOCK_NATIVE_APPS, true); }
    public void setBlockNativeAppsEnabled(boolean val) { prefs.edit().putBoolean(KEY_BLOCK_NATIVE_APPS, val).apply(); }

    public Set<String> getBlockedPackages() {
        Set<String> defaults = new HashSet<>(Arrays.asList(
            "com.instagram.android",
            "com.facebook.katana",
            "com.zhiliaoapp.musically",
            "com.ss.android.ugc.trill",
            "com.snapchat.android",
            "com.reddit.frontpage",
            "com.twitter.android"
        ));
        return prefs.getStringSet(KEY_BLOCKED_PACKAGES, defaults);
    }

    public void setBlockedPackages(Set<String> packages) {
        prefs.edit().putStringSet(KEY_BLOCKED_PACKAGES, packages).apply();
    }

    public boolean isPackageBlocked(String packageName) {
        if (!isBlockNativeAppsEnabled()) return false;
        return getBlockedPackages().contains(packageName);
    }

    // --- Stats & Streaks ---
    public int getMinutesSaved() { return prefs.getInt(KEY_MINUTES_SAVED, 75); }
    public void addMinutesSaved(int minutes) { prefs.edit().putInt(KEY_MINUTES_SAVED, getMinutesSaved() + minutes).apply(); }

    public int getDayStreak() { return prefs.getInt(KEY_DAY_STREAK, 7); }

    public boolean isAllFeaturesUnlocked() { return true; }
}
