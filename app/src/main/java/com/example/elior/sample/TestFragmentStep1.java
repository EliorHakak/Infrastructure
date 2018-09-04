package com.example.elior.sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.elior.baseactivity.R;
import com.example.elior.baseactivity.wizards.fragment.BaseWizardFragment;
import com.example.elior.baseactivity.wizards.view.BottomConfig;
import com.example.elior.sample.model.TestObject;


//TODO: smart
public class TestFragmentStep1 extends BaseWizardFragment<TestObject> {

    private EditText mEditext;

    @Override
    protected void initView(View view) {
        super.initView(view);

        mEditext = view.findViewById(R.id.step1_editetext);


    }

    @Override
    public BottomConfig getBottomConfig() {
        return new BottomConfig.Builder()
                .setBackText("BACK")
                .setProceedText("NXT")
                .build();
    }

    @Override
    public void collectData(TestObject testObject) {
        testObject.username = mEditext.getText().toString();
    }

    @Override
    public boolean conditionSatisfied() {
        return mEditext.getText().toString().length() > 0;
    }

    @Override
    public void populate(TestObject testObject) {
        mEditext.setText(testObject.username);
    }

    @Override
    protected int getLayout() {
        return R.layout.test_fragment_step1;
    }
}
