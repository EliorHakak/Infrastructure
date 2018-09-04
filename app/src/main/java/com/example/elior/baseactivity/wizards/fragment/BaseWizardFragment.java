package com.example.elior.baseactivity.wizards.fragment;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.example.elior.baseactivity.base.BaseFragment;
import com.example.elior.baseactivity.wizards.PopulatorProvider;

import com.example.elior.baseactivity.wizards.view.BottomConfig;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class BaseWizardFragment<T> extends BaseFragment{

    private String TAG = this.getClass().getSimpleName();

    public PopulatorProvider<T> provider;

    public abstract BottomConfig getBottomConfig();

    public abstract void collectData(T t);

    public abstract boolean conditionSatisfied();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            provider = (PopulatorProvider<T>) context;
        } catch (ClassCastException e) {
            Log.d(TAG, "Containing activity must implement PopulatorProvider");
        }
    }

    @Override
    protected void initView(View view) {
        provider.getPopulator().observe(this, this::populate);
    }

    @Override
    public void onDetach() {
        provider = null;
        super.onDetach();
    }

    public abstract void populate(T t);
}

