package com.ladestack.socialpurifier.receiver;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.ladestack.socialpurifier.R;
import com.ladestack.socialpurifier.data.PurifierPreferences;
import com.ladestack.socialpurifier.ui.MainActivity;

/**
 * SocialPurifier Home Screen Widget
 * Brand: LadeStack | Owner: Girish Lade
 * Copyright (c) 2026 LadeStack. All rights reserved.
 */
public class PurifierWidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        PurifierPreferences prefs = new PurifierPreferences(context);
        boolean isActive = prefs.isFocusModeActive();

        for (int appWidgetId : appWidgetIds) {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_purifier_layout);
            views.setTextViewText(R.id.widget_status, isActive ? "Focus: ACTIVE" : "Focus: OFF");

            Intent intent = new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(
                context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
            );
            views.setOnClickPendingIntent(R.id.widget_btn_toggle, pendingIntent);

            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}
