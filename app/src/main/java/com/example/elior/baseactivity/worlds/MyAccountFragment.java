package com.example.elior.baseactivity.worlds;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.elior.baseactivity.R;
import com.example.elior.baseactivity.worlds.view.CustomTabLayout;
import com.example.elior.baseactivity.worlds.view.FragmentsMapper;
import com.example.elior.baseactivity.worlds.view.adapters.WorldAdapter;
import com.example.elior.baseactivity.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;


public class MyAccountFragment extends BaseFragment {

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


    public void listArrivedFromREST(){
        WorldAdapter adapter = new WorldAdapter(getChildFragmentManager());
        List<Integer> listOfFragments = new ArrayList<>();
        listOfFragments.add(1);
        listOfFragments.add(2);

        adapter.setFragmentsList(new FragmentsMapper().getFragmentsByIds(listOfFragments));
        mViewPager.setAdapter(adapter);


        //TODO: if lazy put 1 else more :)
        //TODO: mViewPager.setOffscreenPageLimit();
    }

    @Override
    protected void initView(View view) {
        mViewPager.setRotationY(180);
        listArrivedFromREST();
        mTabsLayout.setupWithViewPager(mViewPager);

    }
    @Override
    protected void findView(View view) {
        mTabsLayout = (CustomTabLayout) view.findViewById(R.id.my_account_tab_layout);
        mViewPager = (ViewPager) view.findViewById(R.id.my_account_view_pager);

            //TODO: init viewpager

    }

}
