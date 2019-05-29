package com.test.myplugin;

import android.util.Log;

public class PluginClass {

    public static String UnityCall(String _param){
        Log.e("UNITYCALL", _param);
        return "TEST OK";
    }
}
