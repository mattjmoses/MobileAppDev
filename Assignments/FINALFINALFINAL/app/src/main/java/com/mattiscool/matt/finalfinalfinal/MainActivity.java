package com.mattiscool.matt.finalfinalfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DbController trailerDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        trailerDB = new DbController(this);
        trailerDB.insertData("bill","jurp","lurp");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
