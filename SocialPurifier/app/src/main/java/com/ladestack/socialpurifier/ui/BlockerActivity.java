package com.ladestack.socialpurifier.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ladestack.socialpurifier.R;

/**
 * SocialPurifier Focus Shield Overlay
 * Brand: LadeStack | Owner: Girish Lade
 * Copyright (c) 2026 LadeStack. All rights reserved.
 */
public class BlockerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocker_overlay);

        String reason = getIntent().getStringExtra("reason");
        if (reason != null) {
            TextView tvReason = findViewById(R.id.tv_blocker_message);
            tvReason.setText(reason + "\nTake a deep breath and stay focused.");
        }

        Button btnHome = findViewById(R.id.btn_return_home);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(startMain);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Redirect to device home screen when back is pressed
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
        finish();
    }
}
