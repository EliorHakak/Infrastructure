package com.example.elior.baseactivity.wizards.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;

import com.example.elior.baseactivity.R;
import com.jakewharton.rxbinding2.view.RxView;

/**
 * Created by moveosoftware on 8/30/18
 */

public class ButtonBarView extends ConstraintLayout {

    private Button mProceedBtn;
    private Button mBackBtn;

    private BottomClickListener listener;

    private BottomConfig mBottomConfig;

    public void setListener(BottomClickListener listener) {
        this.listener = listener;
    }

    public ButtonBarView(Context context) {
        super(context);
        init();
    }

    public ButtonBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonBarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (isInEditMode()) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.bottom_view, this);

        findViews();
        initView();
    }

    private void initView() {
        RxView.clicks(mProceedBtn)
                .subscribe(o -> {
                    if (listener != null) {
                        listener.onProceedClick();
                    }
                });

        RxView.clicks(mBackBtn)
                .subscribe(o -> {
                    if (listener != null) {
                        listener.onProceedClick();
                    }
                });
    }

    private void findViews() {
        mProceedBtn = findViewById(R.id.proceed_btn);
        mBackBtn = findViewById(R.id.back_btn);
    }

    public void applyConfig(BottomConfig bottomConfig) {
        this.mBottomConfig = bottomConfig;

        mBackBtn.setText(bottomConfig.getBackText());
        mProceedBtn.setText(bottomConfig.getProceedText());
    }


    public interface BottomClickListener {
        void onProceedClick();

        void onBackClick();
    }
}
