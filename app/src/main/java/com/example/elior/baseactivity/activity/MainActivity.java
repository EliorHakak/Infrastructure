package com.example.elior.baseactivity.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.elior.baseactivity.R;

public class MainActivity extends AppCompatActivity {


    Button button1;
    Button button2;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

/*        findViewById(R.id.fragment1_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityOne.newInstance(context,null);
            }
        });

        findViewById(R.id.fragment2_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityOne.newInstance(context,null);
            }
        });*/
    }
}
