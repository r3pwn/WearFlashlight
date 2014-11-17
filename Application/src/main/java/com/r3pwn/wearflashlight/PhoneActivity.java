package com.r3pwn.wearflashlight;

import android.app.*;
import android.os.*;

public class PhoneActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

		Notification notif = new Notification.Builder(this)
			.setContentTitle(getResources().getString(R.string.app_name))
			.setContentText(getResources().getString(R.string.notify_message))
			.setSmallIcon(android.R.drawable.stat_notify_more)
			.build();
		NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		nm.notify(0, notif);
    }
}
