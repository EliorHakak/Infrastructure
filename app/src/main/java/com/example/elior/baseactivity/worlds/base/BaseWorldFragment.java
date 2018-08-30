package com.example.elior.baseactivity.worlds.base;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseWorldFragment<VM extends BaseWorldViewModel> extends BaseFragment {

    private VM mViewModel;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(getViewModelClass());
        mViewModel.init();
        subscribeToViewModel();
        return view;
    }

    public VM getViewModel() {
        return mViewModel;
    }

    public abstract Class<VM> getViewModelClass();

    public abstract void subscribeToViewModel();


}
