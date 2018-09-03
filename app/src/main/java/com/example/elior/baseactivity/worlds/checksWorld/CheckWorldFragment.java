package com.example.elior.baseactivity.worlds.checksWorld;


import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.elior.baseactivity.R;
import com.example.elior.baseactivity.worlds.checksWorld.viewModel.ChecksWorldViewModel;
import com.example.elior.baseactivity.worlds.base.BaseWorldFragment;

/**
 * A simple {@link Fragment} subclass.
 */
//public class CheckWorldFragment extends BaseWorldFragment<ChecksWorldViewModel> {
public class CheckWorldFragment extends BaseWorldFragment<String,ChecksWorldViewModel>{
    @Override
    public Class<ChecksWorldViewModel> getViewModelClass() {
        return ChecksWorldViewModel.class;
    }

    @Override
    public void observe() {

    }

    @Override
    protected int getLayout() {
        return R.layout.check_world_fragment;
    }

    @Override
    protected void initView(View view) {
        view.setRotationY(180);

    }
}
