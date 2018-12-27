package com.example.qianfei.mybaseandroid.strategy;

import android.util.Log;

/**
 * Created by qf on 2018/12/6
 * 描述: MOtoCar
 */
public class MOtoCar implements CarFunction {

    private static final String TAG= "MOtoCar";

    @Override
    public void run() {
        Log.i(TAG, "-------this is motocar");
    }
}
