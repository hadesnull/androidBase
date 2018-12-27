package com.example.qianfei.mybaseandroid.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

/**
 * Created by qf on 2018/12/12
 * 描述: BaseActivityViewModel
 */
public class BaseActivityViewModel extends AndroidViewModel {

    public ObservableField<String> baseName = new ObservableField<>("测试");

    public BaseActivityViewModel(@NonNull Application application) {
        super(application);
    }
}
