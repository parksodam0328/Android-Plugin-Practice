package com.test.unityplugin;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

public class OpenApp {

    public static boolean openApp(Context mContext, String packageName) {
        PackageManager manager = mContext.getPackageManager();
        Intent goToEncyclopedia = manager.getLaunchIntentForPackage(packageName);
        if (goToEncyclopedia == null) {
            return false;
        }
        goToEncyclopedia.addCategory(Intent.CATEGORY_LAUNCHER);
        goToEncyclopedia.putExtra("NAME" , "Ehsan");
        mContext.startActivity(goToEncyclopedia);

        return true;
    }
}
