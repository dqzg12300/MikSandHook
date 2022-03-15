package com.mik.miksandhook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookConfig;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
//    static {
//        System.loadLibrary("native-lib");
//    }

    public static int getPreviewSDKInt() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            try {
                return Build.VERSION.PREVIEW_SDK_INT;
            } catch (Throwable e) {
                // ignore
            }
        }
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // Example of a call to a native method
//        TextView tv = findViewById(R.id.sample_text);
//        tv.setText(stringFromJNI());
//
//        SandHookConfig.DEBUG = BuildConfig.DEBUG;
//
//        if (Build.VERSION.SDK_INT == 29 && getPreviewSDKInt() > 0) {
//            // Android R preview
//            SandHookConfig.SDK_INT = 30;
//        }
//
//        SandHook.disableVMInline();
//        SandHook.tryDisableProfile(getPackageName());
//        SandHook.disableDex2oatInline(false);
//
//        if (SandHookConfig.SDK_INT >= Build.VERSION_CODES.P) {
//            SandHook.passApiCheck();
//        }

//        XposedHelpers.findAndHookMethod(MainActivity.class, "ceshi", new XC_MethodHook() {
//            @Override
//            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                super.beforeHookedMethod(param);
//                Log.i("ceshi","xposed hook success");
//            }
//        });
//
//        ceshi();

    }

    public void ceshi(){
        Log.i("ceshi","11111");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}