package com.example.elior.baseactivity.worlds.view;


import android.util.Pair;

import com.example.elior.baseactivity.wizards.fragment.BaseWizardFragment;
import com.example.elior.baseactivity.worlds.base.BaseWorldFragment;
import com.example.elior.baseactivity.worlds.checksWorld.CheckWorldFragment;
import com.example.elior.baseactivity.worlds.loansWorld.LoanWorldFragment;
import com.example.elior.sample.TerminalFragmentStep1;
import com.example.elior.sample.TerminalFragmentStep2;
import com.example.elior.sample.model.TestObject;

import java.util.ArrayList;
import java.util.List;

public class FragmentsMapper {


    public static final int LOAN_WORLD = 1;
    public static final int CHECK_WORLD = 2;

    /**
     *
     * @param listOfFragmentIds
     * @return
     * NewWorldFragment - 1
     * ChecksWorldFragment - 2
     *
     */

    public List<Pair<BaseWorldFragment,String>> getFragmentsByIds(List<Integer> listOfFragmentIds) {
        List<Pair<BaseWorldFragment,String>> fragmentsList = new ArrayList<>();
        for (int i = 0; i < listOfFragmentIds.size(); i++) {
            switch (listOfFragmentIds.get(i)){
                case CHECK_WORLD:
                    fragmentsList.add(new Pair(new CheckWorldFragment(), "שיקים"));
                    break;
                case LOAN_WORLD:
                    fragmentsList.add(new Pair(new LoanWorldFragment(), "הלוואות"));
                    break;
            }
        }
        return fragmentsList;

    }

    public List<BaseWizardFragment<TestObject>> getWizards() {
        List<BaseWizardFragment<TestObject>> fragmentsList = new ArrayList<>();
        fragmentsList.add(new TerminalFragmentStep1());
        fragmentsList.add(new TerminalFragmentStep2());


        return fragmentsList;

    }}