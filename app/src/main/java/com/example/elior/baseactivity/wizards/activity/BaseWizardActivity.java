package com.example.elior.baseactivity.wizards.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.elior.baseactivity.base.BaseSmartActivity;
import com.example.elior.baseactivity.wizards.fragment.BaseWizardFragment;
import com.example.elior.baseactivity.wizards.model.FieldsPopulator;
import com.example.elior.baseactivity.wizards.view.LayoutConfig;
import com.example.elior.baseactivity.wizards.view.WizardAdapter;
import com.example.elior.baseactivity.wizards.viewmodel.BaseWizardViewModel;

import java.util.List;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class BaseWizardActivity
        <T extends FieldsPopulator, VM extends BaseWizardViewModel<T>>
        extends BaseSmartActivity<VM> {

    private ViewPager mPager;
    private WizardAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPager = getViewPager();
        if (mPager == null) {
            throw new IllegalArgumentException("Must provide a view pager when extending BaseWizardActivity !!!");
        }

        mAdapter = new WizardAdapter(getSupportFragmentManager());
        mPager.setAdapter(mAdapter);
        mAdapter.setFragmentsList(getFragments());
        initConfig(getLayoutConfig());
    }

    private void initConfig(LayoutConfig layoutConfig) {

    }

    public abstract ViewPager getViewPager();

    public abstract LayoutConfig getLayoutConfig();

    public abstract List<BaseWizardFragment> getFragments();
}
