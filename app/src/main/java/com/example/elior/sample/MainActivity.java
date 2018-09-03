package com.example.elior.sample;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

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

        MutableLiveData<String> stringMutableLiveData = new MutableLiveData<>();
        stringMutableLiveData.setValue("Moshe ata lo kipod, ata ashach");

        stringMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
            }
        });

        stringMutableLiveData.setValue("Moshe ata Alof <3");

    }
}
