package com.springsoft.unitybluetoothtest_android;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class BLEControl {
    // tag for log message
    public static String TAG= "BLEControl";
    // initialized message
    public static String INIT_MSG= "initialized";
    // current activity
    protected Activity current_activity_;

    // set current activity by unity
    public void setActivity(Activity _activity) {
        current_activity_= _activity;
    }

    // initialize
    public String init() {
        Log.d( TAG, "Call by Unity");
        Toast.makeText( current_activity_, "Call by Unity", Toast.LENGTH_SHORT).show();
        return INIT_MSG;
    }
}
