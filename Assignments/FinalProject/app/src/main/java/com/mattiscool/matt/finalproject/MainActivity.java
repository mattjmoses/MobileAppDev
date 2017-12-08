package com.mattiscool.matt.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DbController trailerDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trailerDB = new DbController(this); //Remember the context. ALWAYS THE CONTEXT
    }
}
