package com.example.elior.baseactivity.worlds.base;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public abstract class BaseWorldViewModel<T> extends BaseViewModel {


    private   MutableLiveData<T> initMutableLiveData = new MutableLiveData<>();


    public MutableLiveData<T> getInitMutableLiveData() {
        return initMutableLiveData;
    }

}
