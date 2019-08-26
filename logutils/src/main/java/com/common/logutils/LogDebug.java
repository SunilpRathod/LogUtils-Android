package com.common.logutils;

import android.util.Log;

public class LogDebug {

    public static final String TAG = "Super_Awesome_App";

    public static void d(String message) {
        Log.d(TAG, message);
    }

    public static String getName(String userName) {
        return userName;
    }

}
