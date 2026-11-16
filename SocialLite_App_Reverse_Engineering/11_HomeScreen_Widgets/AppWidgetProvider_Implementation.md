# AppWidgetProvider कोड व अंमलबजावणी (Widget Implementation)

## १. XML विजेट इन्फो (`res/xml/widget_info_instagram.xml`)

```xml
<appwidget-provider xmlns:android="http://schemas.android.com/apk/res/android"
    android:minWidth="60dp"
    android:minHeight="60dp"
    android:targetCellWidth="1"
    android:targetCellHeight="1"
    android:updatePeriodMillis="1800000"
    android:initialLayout="@layout/widget_platform_layout"
    android:resizeMode="none"
    android:widgetCategory="home_screen" />
```

---

## २. विजेट प्रोव्हायडर कोड (`InstagramWidgetProvider.java`)

```java
package com.sociallite.android.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import com.sociallite.android.MainActivity;
import com.sociallite.android.R;
import ge.d2;
import ge.i3;

public class InstagramWidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int widgetId : appWidgetIds) {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_platform_layout);

            // १. आयकॉन व नाव सेट करणे:
            views.setImageViewResource(R.id.widget_icon, R.drawable.ic_widget_instagram);
            views.setTextViewText(R.id.widget_name, "Instagram");

            // २. आजचा शिल्लक वेळ दाखवणे:
            i3 prefs = d2.B(context);
            int dailyLimit = prefs.getInt("ig_daily_limit_minutes", 30);
            int usedMinutes = prefs.getInt("ig_used_today_minutes", 12);
            int remaining = Math.max(0, dailyLimit - usedMinutes);
            
            views.setTextViewText(R.id.widget_remaining_time, remaining + "m left");

            // ३. क्लिक केल्यावर SocialLite मध्ये Instagram उघडणे:
            Intent intent = new Intent(context, MainActivity.class);
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("sociallite://open?platform=instagram"));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

            PendingIntent pendingIntent = PendingIntent.getActivity(
                context, widgetId, intent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
            );
            views.setOnClickPendingIntent(R.id.widget_root, pendingIntent);

            appWidgetManager.updateAppWidget(widgetId, views);
        }
    }
}
```

---

## ३. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `AppWidgetProvider` सबक्लास करा.
2. `RemoteViews` द्वारे सोपे लेआउट तयार करा.
3. टॅप केल्यावर डीप लिंक इंटेंटद्वारे ॲप लाँच करा.
