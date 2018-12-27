package com.example.mylibrary.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;

import com.example.mylibrary.bus.event.SingleLiveEvent;
import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * Created by qf on 2018/12/19
 * 描述: BaseViewModel
 */
public class BaseViewModel extends AndroidViewModel implements IBaseViewModel{

    private UIChangeLiveData ui;

    private LifecycleProvider lifecycle;


    public BaseViewModel(@NonNull Application application) {
        super(application);
        ui = new UIChangeLiveData();
    }

    public UIChangeLiveData getUi() {
        if (null == ui) {
            ui = new UIChangeLiveData();
        }
        return ui;
    }
    /**
     * 注入RxLifecycle生命周期
     *
     * @param lifecycle
     */
    public void injectLifecycleProvider(LifecycleProvider lifecycle) {
        this.lifecycle = lifecycle;
    }

    public LifecycleProvider getLifecycleProvider() {
        return lifecycle;
    }

    public void showToast(String text) {
        ui.showToastEvent.postValue(text);
    }

    @Override
    public void onAny(LifecycleOwner owner, Lifecycle.Event event) {

    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void registerRxBus() {

    }

    @Override
    public void removeRxBus() {

    }

    public static class UIChangeLiveData extends SingleLiveEvent{

        private SingleLiveEvent<String> showDialogEvent;

        private SingleLiveEvent<String> showToastEvent;

        public SingleLiveEvent<String> getShowDialogEvent() {
             return showDialogEvent = createLiveData(showDialogEvent);
        }

        public SingleLiveEvent<String> getShowToastEvent() {
            return showToastEvent = createLiveData(showToastEvent);
        }

        private SingleLiveEvent createLiveData(SingleLiveEvent liveData) {
            if (liveData == null) {
                liveData = new SingleLiveEvent();
            }
            return liveData;
        }

        @Override
        public void observe(LifecycleOwner owner, Observer observer) {
            super.observe(owner, observer);
        }
    }
}
