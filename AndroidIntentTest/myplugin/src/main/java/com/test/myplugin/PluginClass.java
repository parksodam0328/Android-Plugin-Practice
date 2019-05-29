package com.test.myplugin;

import android.util.Log;

public class PluginClass {
    public static String UnityCall(String _param){
        Log.d("TAG", "=========[AndroidIntentTest]UnityCall:"+ _param);
        return "Test";
    }
}
