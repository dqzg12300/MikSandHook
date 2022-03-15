package com.swift.sandhook;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;

import com.swift.sandhook.lib.BuildConfig;

public class SandHookConfig {

    public volatile static int SDK_INT = Build.VERSION.SDK_INT;
    //Debug status of hook target process
    public volatile static boolean DEBUG = true;
    //Enable compile with jit
    public volatile static boolean compiler = SDK_INT < 29;
    public volatile static ClassLoader initClassLoader;
    public volatile static int curUser = 0;
    public volatile static boolean delayHook = true;

    public volatile static String libSandHookPath;
    public volatile static LibLoader libLoader = new LibLoader() {
        @SuppressLint("UnsafeDynamicallyLoadedCode")
        @Override
        public void loadLib() {
            if (SandHookConfig.libSandHookPath == null) {
                Log.i("mikrom","load libsandhook.so");
                System.loadLibrary("sandhook");
            } else {
                Log.i("mikrom","load SandHook path:"+SandHookConfig.libSandHookPath);
                System.load(SandHookConfig.libSandHookPath);
            }
        }
    };

    public interface LibLoader {
        void loadLib();
    }
}
