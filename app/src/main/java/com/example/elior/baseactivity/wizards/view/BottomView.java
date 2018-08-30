package com.example.elior.baseactivity.wizards.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/**
 * Created by moveosoftware on 8/30/18
 */

public class BottomView extends ConstraintLayout {
    public BottomView(Context context) {
        super(context);
        init();
    }

    public BottomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BottomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {

        }
    }


}
