package com.example.qianfei.mybaseandroid.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by qf on 2018/12/12
 * 描述: BaseBindActivity
 */
public abstract class BaseBindActivity<T extends BaseActivityViewModel, B extends ViewDataBinding> extends BaseActivity {

    private T viewModel;
    private B binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected void setContextViewModel(T viewModel, int layoutRes) {
        this.viewModel = viewModel;
        binding = DataBindingUtil.setContentView(this, layoutRes);
        binding.setVariable(getVmBRid(), viewModel);
    }

    public abstract int getVmBRid();

    public T getViewModel() {
        if (null == viewModel) {
            throw new NullPointerException("VM is null");
        }
        return viewModel;
    }

    public void getBinding() {

    }
}
