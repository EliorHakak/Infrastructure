package com.example.elior.baseactivity.worlds.loansWorld.viewModel;

import com.example.elior.baseactivity.worlds.base.BaseWorldViewModel;

public class LoansWorldViewModel extends BaseWorldViewModel<String> {


    @Override
    public void init() {
        //TODO: call retrofit and setvalue onSucces callbackk
        getInitMutableLiveData().setValue("test");
    }
}
