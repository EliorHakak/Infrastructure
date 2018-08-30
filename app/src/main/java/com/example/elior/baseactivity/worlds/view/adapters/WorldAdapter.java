package com.example.elior.baseactivity.worlds.view.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Pair;

import com.example.elior.baseactivity.worlds.base.BaseWorldFragment;

import java.util.ArrayList;
import java.util.List;

public class WorldAdapter extends FragmentStatePagerAdapter {


    private List<Pair<BaseWorldFragment, String>> mFragmentsList = new ArrayList<>();

    public WorldAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, int position) {
        mFragmentsList.remove(position);
    }

    public void removeFragment(Fragment fragment, int position) {
        mFragmentsList.remove(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentsList.get(position).first;
    }

    @Override
    public int getCount() {
        return mFragmentsList.size();
    }


    public void setFragmentsList(List<Pair<BaseWorldFragment, String>> fragmentsList) {
        mFragmentsList = fragmentsList;
        for (int i = 0; i < mFragmentsList.size(); i++) {
            Pair<BaseWorldFragment, String> baseWorldFragmentStringPair = mFragmentsList.get(i);
            baseWorldFragmentStringPair.first.attachToViewPager();
        }

        notifyDataSetChanged();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentsList.get(position).second;
    }
}
