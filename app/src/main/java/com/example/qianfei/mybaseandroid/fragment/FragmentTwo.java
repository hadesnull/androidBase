package com.example.qianfei.mybaseandroid.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qianfei.mybaseandroid.R;

/**
 * Created by qf on 2018/11/30
 * 描述: FragmentTwo
 */
public class FragmentTwo extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_two, container, false);

        return inflate;
    }
}
