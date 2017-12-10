package com.mattiscool.matt.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Add data elements.
    EditText addTitle;
    EditText addLink;
    EditText addRating;
    Button addData;

    DbController trailerDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Defining he add data elements..
        addTitle = (EditText)findViewById(R.id.titleInput);
        addLink = (EditText)findViewById(R.id.linkInput);
        addRating = (EditText)findViewById(R.id.ratingInput);
        addData = (Button)findViewById(R.id.btnAdd);
        trailerDB = new DbController(this); //Remember the context. ALWAYS THE CONTEXT
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();// Calling the AddData method.
    }
    public void addData()
    {
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Passing the data into the DB. Booolean checks if it was actually added.
               boolean isAdded = trailerDB.insertValue(addTitle.getText().toString()
                       ,addLink.getText().toString(),addRating.getText().toString());
               if(isAdded == true)
               {
                   Toast.makeText(MainActivity.this, "Data Added", Toast.LENGTH_LONG).show();
               }
               else
                   {
                       Toast.makeText(MainActivity.this, "Data Not Added :C", Toast.LENGTH_LONG).show();
                   }
            }
        });
    }
}
