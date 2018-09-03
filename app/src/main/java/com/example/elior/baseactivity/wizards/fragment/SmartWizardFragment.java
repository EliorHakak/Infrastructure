package com.example.elior.baseactivity.wizards.fragment;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elior.baseactivity.base.BaseViewModel;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class SmartWizardFragment<T, VM extends BaseViewModel> extends BaseWizardFragment<T>{

    private VM mViewModel;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(getViewModelClass());
        observe();
        mViewModel.init();
        return view;
    }

    public VM getViewModel() {
        return mViewModel;
    }

    public abstract Class<VM> getViewModelClass();

    public abstract void observe();

}
