package com.example.elior.sample;

import android.support.v4.view.ViewPager;

import com.example.elior.baseactivity.R;
import com.example.elior.baseactivity.wizards.activity.BaseWizardActivity;
import com.example.elior.baseactivity.wizards.fragment.BaseWizardFragment;
import com.example.elior.baseactivity.wizards.view.LayoutConfig;
import com.example.elior.baseactivity.worlds.view.FragmentsMapper;
import com.example.elior.sample.model.TestObject;

import java.util.List;


//TODO: AALLL
public class TerminalActivity extends BaseWizardActivity<TestObject, TerminalViewModel> {

    @Override
    public ViewPager getViewPager() {
        return findViewById(R.id.terminal_exchange_view_pager);
    }

    @Override
    public LayoutConfig getLayoutConfig() {
        return new LayoutConfig.LayoutConfigBuilder()
                .setBottomView(findViewById(R.id.terminal_button_bar))
                .createLayoutConfig();
    }

    @Override
    public List<BaseWizardFragment<TestObject>> getFragments() {
        return new FragmentsMapper().getWizards();
    }

    @Override
    public Class<TerminalViewModel> getViewModelClass() {
        return TerminalViewModel.class;
    }

    @Override
    public void observe() {

    }

    @Override
    protected int getLayout() {
        return R.layout.terminal_acitivity;
    }

    @Override
    protected void initView() {

    }
}
