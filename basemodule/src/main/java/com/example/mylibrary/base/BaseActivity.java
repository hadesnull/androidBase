package com.example.mylibrary.base;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.mylibrary.util.MaterialDialogUtils;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by qf on 2018/12/19
 * 描述: BaseActivity
 */
public abstract class BaseActivity<VM extends BaseViewModel, bind extends ViewDataBinding> extends RxAppCompatActivity {

    private bind dataBinding;

    private VM mViewModel;
    private MaterialDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewDataBinding(savedInstanceState);

        initUICallBack();
    }

    private void initUICallBack() {
        mViewModel.getUi().getShowToastEvent().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(BaseActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        mViewModel.getUi().getShowDialogEvent().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                showDialog(s);
            }
        });

    }

    private void initViewDataBinding(Bundle savedInstanceState) {
        dataBinding = DataBindingUtil.setContentView(this, getLayoutId());
        mViewModel = iniViewModel();
        if (null == mViewModel) {
            Class viewModelClass;
            Type type = getClass().getGenericSuperclass();
            if (type instanceof ParameterizedType) {
                //看父类是否有基础model
                viewModelClass = (Class) ((ParameterizedType) type).getActualTypeArguments()[1];
            } else {
                //如果都没有使用基础vm
                viewModelClass = BaseViewModel.class;
            }
            mViewModel = (VM) ViewModelProviders.of(this).get(viewModelClass);
        }

        dataBinding.setVariable(getVariableId(), mViewModel);

        //让ViewModel拥有View的生命周期感应
        getLifecycle().addObserver(mViewModel);
        //注入RxLifecycle生命周期
        mViewModel.injectLifecycleProvider(this);

    }

    public VM iniViewModel() {
        return null;
    }

    public bind getBinding() {
        if (null == dataBinding) {
            throw new NullPointerException("Binding is null!");
        }
        return dataBinding;
    }

    protected abstract int getLayoutId();

    protected abstract int getVariableId();


    private void showDialog(String title) {
        if (dialog != null) {
            dialog.show();
        } else {
            MaterialDialog.Builder builder = MaterialDialogUtils.showBasicDialogNoCancel(this, "提示", title);
            dialog = builder.show();
        }
    }
}
