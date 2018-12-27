package com.example.qianfei.mybaseandroid;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by qf on 2018/11/16
 * 描述: App
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
