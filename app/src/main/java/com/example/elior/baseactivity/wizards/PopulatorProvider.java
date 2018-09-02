package com.example.elior.baseactivity.wizards;

import android.arch.lifecycle.MutableLiveData;

/**
 * Created by moveosoftware on 9/2/18
 */

public interface PopulatorProvider<T> {

    MutableLiveData<T> getPopulator();

}