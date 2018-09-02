package com.example.elior.baseactivity.wizards.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by moveosoftware on 8/30/18
 */

public class BottomView extends ConstraintLayout {

    private Button mProceedBtn;

    private BottomClickListener listener;

    public void setListener(BottomClickListener listener) {
        this.listener = listener;
    }

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
            if (listener != null) {
                listener.onProceedClick();
            }
        }
    }

    public void applyConfig(BottomConfig bottomConfig) {
        // TODO: 9/2/18 Apply config
    }


    public interface BottomClickListener {
        void onProceedClick();

        void onBackClick();
    }
}
