package com.ladestack.socialpurifier.service;

import android.content.Intent;
import android.net.VpnService;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/**
 * SocialPurifier Network Filter (Local DNS Shield)
 * Brand: LadeStack | Owner: Girish Lade
 * Copyright (c) 2026 LadeStack. All rights reserved.
 */
public class PurifierVpnService extends VpnService implements Runnable {

    private Thread vpnThread;
    private ParcelFileDescriptor vpnInterface;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (vpnThread != null) {
            vpnThread.interrupt();
        }
        vpnThread = new Thread(this, "PurifierVpnThread");
        vpnThread.start();
        return START_STICKY;
    }

    @Override
    public void run() {
        try {
            Builder builder = new Builder();
            builder.setSession("SocialPurifier DNS Filter")
                   .addAddress("10.0.0.2", 32)
                   .addDnsServer("1.1.1.1")
                   .addRoute("0.0.0.0", 0);

            vpnInterface = builder.establish();
            if (vpnInterface == null) {
                return;
            }

            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            // Service stopping
        } finally {
            closeInterface();
        }
    }

    @Override
    public void onDestroy() {
        if (vpnThread != null) {
            vpnThread.interrupt();
        }
        closeInterface();
        super.onDestroy();
    }

    private void closeInterface() {
        if (vpnInterface != null) {
            try {
                vpnInterface.close();
            } catch (IOException ignored) {}
            vpnInterface = null;
        }
    }
}
