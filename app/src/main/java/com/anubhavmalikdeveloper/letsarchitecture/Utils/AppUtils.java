package com.anubhavmalikdeveloper.letsarchitecture.Utils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

public class AppUtils {

    public static void showSimpleSnackBar(View view, String message) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show();
    }

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
