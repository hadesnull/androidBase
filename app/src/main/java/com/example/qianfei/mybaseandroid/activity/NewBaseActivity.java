package com.example.qianfei.mybaseandroid.activity;


import com.example.mylibrary.base.BaseActivity;
import com.example.qianfei.mybaseandroid.BR;
import com.example.qianfei.mybaseandroid.R;
import com.example.qianfei.mybaseandroid.databinding.ActivityNewBaseBinding;
import com.example.qianfei.mybaseandroid.model.NewBaseViewModel;

/**
 * Created by qf on 2018/12/24
 * 描述: NewBaseActivity
 */
public class NewBaseActivity extends BaseActivity<NewBaseViewModel, ActivityNewBaseBinding> {

    @Override
    public NewBaseViewModel iniViewModel() {
        return new NewBaseViewModel(getApplication());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_new_base;
    }

    @Override
    protected int getVariableId() {
        return BR.baseViewModelOne;
    }
}
