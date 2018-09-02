package com.example.elior.baseactivity.wizards.activity;

import android.arch.lifecycle.MutableLiveData;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.example.elior.baseactivity.base.BaseSmartActivity;
import com.example.elior.baseactivity.wizards.PopulatorProvider;
import com.example.elior.baseactivity.wizards.fragment.BaseWizardFragment;
import com.example.elior.baseactivity.wizards.view.BottomView;
import com.example.elior.baseactivity.wizards.view.LayoutConfig;
import com.example.elior.baseactivity.wizards.view.WizardAdapter;
import com.example.elior.baseactivity.wizards.viewmodel.BaseWizardViewModel;

import java.util.List;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class BaseWizardActivity<T, VM extends BaseWizardViewModel<T>> extends BaseSmartActivity<VM> implements PopulatorProvider<T> {

    private static final int PAGE_OFFSET_LIMIT = 2;
    private ViewPager mPager;
    private WizardAdapter mAdapter;
    MutableLiveData<T> populator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPager = getViewPager();
        if (mPager == null) {
            throw new IllegalArgumentException("Must provide a view pager when extending BaseWizardActivity !!!");
        }

        mAdapter = new WizardAdapter<T>(getSupportFragmentManager());
        mPager.setAdapter(mAdapter);
        final List<BaseWizardFragment<T>> fragments = getFragments();

        mPager.setOffscreenPageLimit(PAGE_OFFSET_LIMIT);
        mAdapter.setFragmentsList(fragments);
        initConfig(getLayoutConfig());


    }


    private void initConfig(final LayoutConfig layoutConfig) {
        layoutConfig.mBottomView.setListener(new BottomView.BottomClickListener() {
            @Override
            public void onProceedClick() {
                BaseWizardFragment<T> currentItem = mAdapter.getItem(mPager.getCurrentItem());
                boolean conditionSatisfied = currentItem.conditionSatisfied();

                if (conditionSatisfied) {
                    populator = getViewModel().getPopulator();
                    currentItem.collectData(populator.getValue());
                    populator.setValue(populator.getValue());

                    layoutConfig.mBottomView.applyConfig(currentItem.getBottomConfig());

                    proceed();
                }
            }

            @Override
            public void onBackClick() {

            }
        });

    }

    private void proceed() {
        if (mPager.getCurrentItem() == mAdapter.getCount() - 1) {
            Toast.makeText(this, "Last item", Toast.LENGTH_SHORT).show();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem() + 1);
        }
    }

    public abstract ViewPager getViewPager();

    public abstract LayoutConfig getLayoutConfig();

    public abstract List<BaseWizardFragment<T>> getFragments();

    @Override
    public MutableLiveData<T> getPopulator() {
        return populator;
    }

}
