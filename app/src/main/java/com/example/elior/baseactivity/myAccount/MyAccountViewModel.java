package com.example.elior.baseactivity.myAccount;

import com.example.elior.baseactivity.worlds.base.BaseWorldViewModel;

import java.util.ArrayList;
import java.util.List;

public class MyAccountViewModel extends BaseWorldViewModel<List<Integer>> {

    List<Integer> worldList = null;


    @Override
    public void init() {


        //TODO: if lazy put 1 else more :)
        //TODO: mViewPager.setOffscreenPageLimit();
        //TODO: call retrofit and setvalue onSucces callbackk
        List<Integer> worldList = new ArrayList<>();
        worldList.add(1);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);
        worldList.add(2);


        getLiveData().setValue(worldList);
    }

}
