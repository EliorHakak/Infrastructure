package com.example.elior.baseactivity.wizards.populate;

import com.example.elior.baseactivity.wizards.model.FieldsPopulator;

/**
 * Created by moveosoftware on 8/30/18
 */

public interface Populateable<T extends FieldsPopulator> {

    boolean conditionSatisfied();

    void populate(T t);
}
