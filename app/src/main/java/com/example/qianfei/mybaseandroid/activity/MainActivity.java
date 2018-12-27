package com.example.qianfei.mybaseandroid.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.qianfei.mybaseandroid.R;
import com.example.qianfei.mybaseandroid.bean.CommBean;
import com.example.qianfei.mybaseandroid.bean.User;
import com.example.qianfei.mybaseandroid.database.UserDatabase;
import com.example.qianfei.mybaseandroid.util.API;
import com.example.qianfei.mybaseandroid.util.NetUtil;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "===========onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "===========onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "===========onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "===========onResume");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "===========onRestoreInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "===========onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "===========onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "===========onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "===========onDestroy");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "===========onConfigurationChanged");
    }

    /**
     * 网络请求
     * @param
     */
    public void netClickTwo() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://gjjv2.youyuwo.com/appapi/")
                .build();
        API mApi = retrofit.create(API.class);
        Call<CommBean> calculator = mApi.getNews("index_calculator");
        calculator.enqueue(new Callback<CommBean>() {
            @Override
            public void onResponse(Call<CommBean> call, Response<CommBean> response) {
                Log.i("netClick", response.body().toString());
            }
            @Override
            public void onFailure(Call<CommBean> call, Throwable t) {
                Log.i("netClick", "onFailure");
            }
        });
    }

    public void netClick(View view) {
        NetUtil netUtil = new NetUtil();
        Retrofit retrofit = netUtil.getCall();
        API mApi = retrofit.create(API.class);
        Call<CommBean> calculator = mApi.getNews("index_calculator");
        calculator.enqueue(new Callback<CommBean>() {
            @Override
            public void onResponse(Call<CommBean> call, Response<CommBean> response) {
                Log.i("netClick", response.body().toString());
            }
            @Override
            public void onFailure(Call<CommBean> call, Throwable t) {
                Log.i("netClick", "onFailure");
            }
        });
    }


    /**
     * 数据库使用
     * @param view
     */
    public void getUser(View view) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                User user=new User();
                user.setName("name1");
                user.setAge(18);
                UserDatabase
                        .getInsttance(MainActivity.this)
                        .getUserDao()
                        .insert(user);

                List<User> allUsers = UserDatabase
                        .getInsttance(MainActivity.this)
                        .getUserDao()
                        .getAllUsers();

                Log.i("=======", allUsers.toString());
            }
        });
    }

    public void setNotify(View view) {
        startService(new Intent(this, NofityService.class));
    }

    public void ToFragment(View view) {
        startActivity(new Intent(this, MyFragmentActivity.class));
    }

    public void ToEvent(View view) {
        startActivity(new Intent(this, EventActivity.class));
    }

    public void ToBlueTooth(View view) {
        startActivity(new Intent(this, BlueToothActivity.class));
    }

    public void ToNewBaseActivity(View view) {
        startActivity(new Intent(this, NewBaseActivity.class));

    }
}
