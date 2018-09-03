package com.example.elior.baseactivity.worlds.loansWorld;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.example.elior.baseactivity.R;
import com.example.elior.baseactivity.worlds.base.BaseWorldFragment;
import com.example.elior.baseactivity.worlds.loansWorld.viewModel.LoansWorldViewModel;


public class LoanWorldFragment extends BaseWorldFragment<String, LoansWorldViewModel> {

    TextView mainText;


    public static LoanWorldFragment newInstance(int someInt) {
        LoanWorldFragment myFragment = new LoanWorldFragment();

        Bundle args = new Bundle();
        args.putInt("someInt", someInt);
        myFragment.setArguments(args);

        return myFragment;
    }


    @Override
    protected int getLayout() {
        return R.layout.loan_world_fragment;
    }

    @Override
    protected void initView(View view) {
        view.setRotationY(180);
        mainText = (TextView) view.findViewById(R.id.fragmet2_text);
    }


    @Override
    public Class<LoansWorldViewModel> getViewModelClass() {
        return LoansWorldViewModel.class;
    }

    @Override
    public void observe() {
        getViewModel().getLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

    }
}
