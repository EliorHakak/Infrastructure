package com.example.elior.sample;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.elior.baseactivity.R;
import com.example.elior.baseactivity.wizards.activity.BaseWizardActivity;
import com.example.elior.baseactivity.wizards.fragment.BaseWizardFragment;
import com.example.elior.baseactivity.wizards.view.LayoutConfig;
import com.example.elior.sample.model.TestObject;

import java.util.List;


//TODO: AALLL
public class MainActivity extends BaseWizardActivity<TestObject, TestViewModel> {
    @Override
    public ViewPager getViewPager() {
        return null;
    }

    @Override
    public LayoutConfig getLayoutConfig() {
        return null;
    }

    @Override
    public List<BaseWizardFragment<TestObject>> getFragments() {
        return null;
    }

    @Override
    public Class<TestViewModel> getViewModelClass() {
        return TestViewModel.class;
    }

    @Override
    public void observe() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }
}
