package com.leo.corelibrary.main;

import android.app.Application;
import android.content.Context;

/**
 * Application的父类
 */
public class BaseApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        init();
    }

    public static Context getContext() {
        return context;
    }

    protected void init() {

    }

    public void close() {

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        close();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        close();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        close();
    }
}
