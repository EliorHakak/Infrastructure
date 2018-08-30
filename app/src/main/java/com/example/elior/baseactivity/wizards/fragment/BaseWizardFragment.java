package com.example.elior.baseactivity.wizards.fragment;

import com.example.elior.baseactivity.base.BaseFragment;
import com.example.elior.baseactivity.wizards.model.FieldsPopulator;
import com.example.elior.baseactivity.wizards.populate.Populateable;
import com.example.elior.baseactivity.wizards.view.BottomConfig;

/**
 * Created by moveosoftware on 8/30/18
 */

public abstract class BaseWizardFragment<T extends FieldsPopulator> extends BaseFragment implements Populateable<T> {


    public abstract BottomConfig getBottomConfig();
}
