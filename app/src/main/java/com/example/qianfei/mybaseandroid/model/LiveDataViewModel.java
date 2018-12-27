package com.example.qianfei.mybaseandroid.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.example.qianfei.mybaseandroid.bean.CommBean;

/**
 * Created by qf on 2018/12/17
 * 描述: LiveDataViewModel
 */
public class LiveDataViewModel extends AndroidViewModel {

    public MutableLiveData<CommBean> mCommBean = new MutableLiveData<>();

    public LiveDataViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

    public MutableLiveData<CommBean> getmCommBean() {
        return mCommBean;
    }
}
