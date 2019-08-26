package com.common.errorutils;

import android.util.Log;

public class ErrorDebug {
    public static final String TAG = "Super_Awesome_App";

    public static void e(String message) {
        Log.e(TAG, message);
    }


}
