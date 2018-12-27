package com.example.qianfei.mybaseandroid.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;
import android.view.View;

import com.example.qianfei.mybaseandroid.bean.CommBean;

/**
 * Created by qf on 2018/12/12
 * 描述: EventActivityVM
 */
public class EventActivityVM extends AndroidViewModel {

    public MutableLiveData<CommBean> mCommBean = new MutableLiveData<>();

    public ObservableField<String> activityName = new ObservableField<>();

    public MutableLiveData<String> activityNameMu = new MutableLiveData<>();


    public EventActivityVM(@NonNull Application application) {
        super(application);
    }

    public void clickToast(View view) {
        activityNameMu.postValue("这是postValue");
    }
}
