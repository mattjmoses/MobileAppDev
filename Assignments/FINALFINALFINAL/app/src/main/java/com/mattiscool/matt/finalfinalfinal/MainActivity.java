package com.mattiscool.matt.finalfinalfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DbController trailerDB;
    EditText addTitle;
    EditText addLink;
    EditText addRating;
    Button confirmAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Initalizing the elements.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trailerDB = new DbController(this);
        addTitle = (EditText)findViewById(R.id.editTitle);
        addLink = (EditText)findViewById(R.id.editLink);
        addRating = (EditText)findViewById(R.id.editRating);
        confirmAdd = (Button)findViewById(R.id.buttonAdd);




    }



}
