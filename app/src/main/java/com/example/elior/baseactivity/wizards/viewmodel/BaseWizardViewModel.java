package com.example.elior.baseactivity.wizards.viewmodel;

import android.arch.lifecycle.MutableLiveData;

import com.example.elior.baseactivity.base.BaseViewModel;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class BaseWizardViewModel<T> extends BaseViewModel {

    private MutableLiveData<T> populator;

    public MutableLiveData<T> getPopulator() {
        return populator;
    }

    public <T> T applyUpdates(T t) {
        return t;
    }
}
