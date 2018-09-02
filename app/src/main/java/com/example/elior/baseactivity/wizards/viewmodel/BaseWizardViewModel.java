package com.example.elior.baseactivity.wizards.viewmodel;

import com.example.elior.baseactivity.base.BaseViewModel;
import com.example.elior.baseactivity.wizards.populate.FieldsPopulator;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class BaseWizardViewModel<T extends FieldsPopulator> extends BaseViewModel {

    private T populator;

    public T getPopulator() {
        return populator;
    }
}
