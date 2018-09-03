package com.example.elior.baseactivity.mainBottomNavigation;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.elior.baseactivity.R;
import com.example.elior.baseactivity.base.BaseSmartFragment;
import com.example.elior.baseactivity.worlds.view.CustomTabLayout;
import com.example.elior.baseactivity.worlds.view.FragmentsMapper;
import com.example.elior.baseactivity.worlds.view.adapters.WorldAdapter;

import java.util.ArrayList;
import java.util.List;


public class MyAccountFragment extends BaseSmartFragment<MyAccountViewModel> {

    private CustomTabLayout mTabsLayout;
    private WorldAdapter adapter;
    private ViewPager mViewPager;

    public static MyAccountFragment newInstance(int someInt) {
        MyAccountFragment myFragment = new MyAccountFragment();

        Bundle args = new Bundle();
        args.putInt("someInt", someInt);
        myFragment.setArguments(args);


        return myFragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.my_account_fragment;
    }


    public void listArrivedFromRest() {


    }

    @Override
    protected void initView(View view) {
        mTabsLayout = view.findViewById(R.id.my_account_tab_layout);
        mViewPager = view.findViewById(R.id.my_account_view_pager);
        mViewPager.setRotationY(180);
        listArrivedFromRest();


        mViewPager.addOnPageChangeListener(new CustomTabLayout.TabLayoutOnPageChangeListener(mTabsLayout));

        mTabsLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        //mTabsLayout.setupWithViewPager(mViewPager);

    }


    @Override
    public Class<MyAccountViewModel> getViewModelClass() {
        return MyAccountViewModel.class;
    }

    @Override
    public void observe() {
        getViewModel().getLiveData().observe(this, new Observer<List<Integer>>() {
            @Override
            public void onChanged(@Nullable List<Integer> integers) {
                WorldAdapter adapter = new WorldAdapter(getChildFragmentManager());

                adapter.setFragmentsList(new FragmentsMapper().getFragmentsByIds(integers));
                mViewPager.setAdapter(adapter);
            }
        });

    }
}
