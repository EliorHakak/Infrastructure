package com.example.elior.baseactivity.worlds.checksWorld.viewModel;

import android.arch.lifecycle.MutableLiveData;

import com.example.elior.baseactivity.worlds.base.BaseWorldViewModel;

public class ChecksWorldViewModel extends BaseWorldViewModel<String> {

    private MutableLiveData<String> initStep2 = new MutableLiveData<>();

    public MutableLiveData<String> getInitStep2LiveData() {
        return initStep2;
    }

    public void initStep2(){
        //TODO: call retrofit and setvalue onSucces callbackk
        initStep2.setValue("test");
    }

    @Override
    public void init() {
        //TODO: call retrofit and setvalue onSucces callbackk
        getInitMutableLiveData().setValue("test");
    }
}
