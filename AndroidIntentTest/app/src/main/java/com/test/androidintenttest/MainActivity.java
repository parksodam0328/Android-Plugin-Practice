package com.test.androidintenttest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.unity3d.player.UnityPlayerActivity;

import static com.unity3d.player.UnityPlayer.UnitySendMessage;

public class MainActivity extends UnityPlayerActivity {

    private String userID = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        if(!intent.getAction().equals("com.test.unityplugin.action"))
        {
            Log.d("TAG", "=========[AndroidIntentTest]action:"+ intent.getExtras().getString("data"));
            userID = intent.getExtras().getString("data");
        }
        userID = intent.getExtras().getString("data");
        UnityCall(userID);
    }

    public void UnityCall(String uid){

        UnitySendMessage("PM_Debug_Android", "AndroidToUnity", uid);
    }
}
