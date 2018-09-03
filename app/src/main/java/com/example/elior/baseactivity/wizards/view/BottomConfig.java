package com.example.elior.baseactivity.wizards.view;

public class BottomConfig {

    private String proceedText;
    private String backText;

    public BottomConfig(String returnText, String proceedText) {
        this.backText = returnText;
        this.proceedText = proceedText;
    }


    public static class Builder {
        private String proceedText;
        private String returnText;

        public Builder setProceedText(String proceedText) {
            this.proceedText = proceedText;
            return this;
        }

        public Builder setBackText(String returnText) {
            this.returnText = returnText;
            return this;
        }

        public BottomConfig build() {
            return new BottomConfig(returnText, proceedText);
        }
    }


    public String getProceedText() {
        return proceedText;
    }

    public String getBackText() {
        return backText;
    }
}