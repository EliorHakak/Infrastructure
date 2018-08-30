package com.example.elior.baseactivity.wizards.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.elior.baseactivity.wizards.fragment.BaseWizardFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moveosoftware on 8/30/18
 */

public class WizardAdapter extends FragmentStatePagerAdapter {


    private List<BaseWizardFragment> mFragmentsList = new ArrayList<>();

    public WizardAdapter(FragmentManager fm) {
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
        return mFragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentsList.size();
    }


    public void setFragmentsList(List<BaseWizardFragment> fragmentsList) {
        mFragmentsList = fragmentsList;
        notifyDataSetChanged();
    }

}
