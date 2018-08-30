package com.example.elior.baseactivity.base;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class BaseSmartActivity<VM extends BaseViewModel> extends BaseActivity {

    private VM mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(getViewModelClass());
        mViewModel.init();
        subscribeToViewModel();
    }

    public VM getViewModel() {
        return mViewModel;
    }

    public abstract Class<VM> getViewModelClass();

    public abstract void subscribeToViewModel();
}
