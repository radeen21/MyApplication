package com.example.raden.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.raden.myapplication.babar.kean.root.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
