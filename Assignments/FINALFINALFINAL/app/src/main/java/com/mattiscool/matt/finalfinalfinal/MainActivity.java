package com.mattiscool.matt.finalfinalfinal;

import android.content.Intent;
import android.database.Cursor;
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
    Button showAllData;

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
        showAllData = (Button)findViewById(R.id.buttonShow);

        addData();
        goToData();


    }

    public void addData()
    {
        confirmAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean result = trailerDB.insertData(addTitle.getText().toString(),addLink.getText().toString(),addRating.getText().toString());
                if(result)
                {
                    Toast.makeText(MainActivity.this, "Data added successfully :)", Toast.LENGTH_LONG).show();
                }
                else
                    {
                        Toast.makeText(MainActivity.this, "Data not added :C", Toast.LENGTH_LONG).show();
                    }
                    addTitle.setText("");
                    addLink.setText("");
                    addRating.setText("");
            }
        });
    }

    public void getAllData()
    {
        showAllData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor result = trailerDB.getAllData();
                if(result.getCount() == 0)
                {
                    return;
                }
            }
        });
    }

    public void goToData()
    {
        showAllData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showDataScreen = new Intent(MainActivity.this, DisplayDBActivity.class);
                startActivity(showDataScreen);
            }
        });

    }





}
