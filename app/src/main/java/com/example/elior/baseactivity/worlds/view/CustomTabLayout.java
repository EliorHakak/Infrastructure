package com.example.elior.baseactivity.worlds.view;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class CustomTabLayout extends TabLayout {
    public CustomTabLayout(Context context) {
        super(context);
    }

    public CustomTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        ViewGroup tabLayout = (ViewGroup)getChildAt(0);

        int childCount = tabLayout.getChildCount();

        int widths[] = new int[childCount+1];

        for(int i = 0; i < childCount; i++){
            widths[i] = tabLayout.getChildAt(i).getMeasuredWidth();
            widths[childCount] += widths[i];
        }

        int measuredWidth = getMeasuredWidth();
        for(int i = 0; i < childCount; i++){
            tabLayout.getChildAt(i).setMinimumWidth(measuredWidth*widths[i]/widths[childCount]);
        }

    }

}