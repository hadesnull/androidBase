package com.example.qianfei.mybaseandroid.model;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.example.mylibrary.base.BaseViewModel;
import com.example.mylibrary.binding.command.BindingAction;
import com.example.mylibrary.binding.command.BindingCommand;
import com.example.mylibrary.binding.command.BindingConsumer;

/**
 * Created by qf on 2018/12/24
 * 描述: NewBaseViewModel
 */
public class NewBaseViewModel extends BaseViewModel {

    public BindingCommand<String> click = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            showToast("这是测试3");
        }
    });

    public BindingCommand<Boolean> checkBtn = new BindingCommand<Boolean>(new BindingConsumer<Boolean>() {
        @Override
        public void call(Boolean aBoolean) {
            showToast(aBoolean+"");
        }
    });


    public NewBaseViewModel(@NonNull Application application) {
        super(application);
    }

}
