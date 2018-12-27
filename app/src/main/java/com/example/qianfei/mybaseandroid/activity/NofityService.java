package com.example.qianfei.mybaseandroid.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;

import com.example.qianfei.mybaseandroid.util.CommonUtil;

/**
 * Created by qf on 2018/11/29
 * 描述: NofityService
 */
public class NofityService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        CommonUtil.setNotify(this, NotifyShowActivity.class, this);

        return super.onStartCommand(intent, flags, startId);
    }
}
