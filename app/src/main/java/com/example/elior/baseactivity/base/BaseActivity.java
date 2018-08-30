package com.example.elior.baseactivity.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    private static String hasStartWithNewInstance = "hasStartWithNewInstance";

    protected  void start(Context context){
        start(context, null);
    }

    protected  void start(Context context, Bundle bundle){
        if(bundle == null){
            bundle = new Bundle();
        }
        bundle.putBoolean(hasStartWithNewInstance , true);
        Intent intent = new Intent(context, this.getClass());
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!getIntent().getBooleanExtra(hasStartWithNewInstance,false)) {
            throw new IllegalArgumentException("asdsa");
        }
        setContentView(getLayout());
        findView();
        initView();
    }

    protected abstract int getLayout();

    protected abstract void findView();

    protected abstract void initView();

}
