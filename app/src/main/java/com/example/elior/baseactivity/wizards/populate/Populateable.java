package com.example.elior.baseactivity.wizards.populate;

/**
 * Created by moveosoftware on 8/30/18
 */

public interface Populateable<T extends FieldsPopulator> {

    boolean conditionSatisfied();

    void populate(T t);
}
