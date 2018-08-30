package com.example.elior.baseactivity.wizards.fragment;

import com.example.elior.baseactivity.base.BaseSmartFragment;
import com.example.elior.baseactivity.wizards.model.FieldsPopulator;
import com.example.elior.baseactivity.wizards.populate.Populateable;
import com.example.elior.baseactivity.wizards.viewmodel.BaseWizardViewModel;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class SmartWizardFragment
        <T extends FieldsPopulator, VM extends BaseWizardViewModel<T>>
        extends BaseSmartFragment<VM>
        implements Populateable<T> {

    abstract void collectData(T t);
}
