package com.example.elior.baseactivity.wizards.view;

/**
 * Created by moveosoftware on 8/30/18
 */

public class LayoutConfig {

    public ButtonBarView mButtonBarView;

    public StepsView mStepsView;

    public AccountDetailsView mAccountDetailsView;


    public LayoutConfig(ButtonBarView mButtonBarView, StepsView mStepsView, AccountDetailsView mAccountDetailsView) {
        this.mButtonBarView = mButtonBarView;
        this.mStepsView = mStepsView;
        this.mAccountDetailsView = mAccountDetailsView;
    }


    public static class LayoutConfigBuilder {
        private ButtonBarView mButtonBarView;
        private StepsView mStepsView;
        private AccountDetailsView mAccountDetailsView;

        public LayoutConfigBuilder setBottomView(ButtonBarView mButtonBarView) {
            this.mButtonBarView = mButtonBarView;
            return this;
        }

        public LayoutConfigBuilder setStepsView(StepsView mStepsView) {
            this.mStepsView = mStepsView;
            return this;
        }

        public LayoutConfigBuilder setAccountDetailsView(AccountDetailsView mAccountDetailsView) {
            this.mAccountDetailsView = mAccountDetailsView;
            return this;
        }

        public LayoutConfig createLayoutConfig() {
            return new LayoutConfig(mButtonBarView, mStepsView, mAccountDetailsView);
        }
    }
}
