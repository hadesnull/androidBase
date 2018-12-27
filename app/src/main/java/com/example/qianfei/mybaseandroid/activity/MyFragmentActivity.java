package com.example.qianfei.mybaseandroid.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;

import com.example.qianfei.mybaseandroid.R;
import com.example.qianfei.mybaseandroid.fragment.FragmentOne;
import com.example.qianfei.mybaseandroid.fragment.FragmentTwo;

/**
 * Created by qf on 2018/11/30
 * 描述: MyFragmentActivity
 */
public class MyFragmentActivity extends FragmentActivity implements FragmentOne.OneClickLinstener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.beginTransaction().add(R.id.activity_context, new FragmentOne(), "One_fragment").commit();
    }

    @Override
    public void changeView() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragment_two = fragmentManager.beginTransaction().replace(R.id.activity_context, new FragmentTwo(), "Fragment_two");
        fragment_two.addToBackStack("Fragment_two_stack");
        fragment_two.commit();

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
