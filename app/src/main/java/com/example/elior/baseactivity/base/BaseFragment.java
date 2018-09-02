package com.example.elior.baseactivity.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {

    private ViewGroup v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = (ViewGroup) inflater.inflate(getLayout(), container, false);
        initView(v);
        return v;
    }


    /**
     * @return The layout id that's gonna be the fragment view.
     */
    protected abstract int getLayout();


    protected abstract void initView(View view);

}
