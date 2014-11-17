package com.r3pwn.flashlight;

import android.app.*;
import android.os.*;
import android.view.*;

public class WearableActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wearable);
		
		WindowManager.LayoutParams lp = getWindow().getAttributes();
		lp.screenBrightness = 100 / 100.0f;
		getWindow().setAttributes(lp);
    }
}
