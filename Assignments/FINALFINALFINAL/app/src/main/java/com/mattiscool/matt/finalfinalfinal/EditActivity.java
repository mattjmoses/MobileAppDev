package com.mattiscool.matt.finalfinalfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Matt on 2017-12-10.
 */

public class EditActivity extends AppCompatActivity {
    private EditText edTitle;
    private EditText edLink;
    private EditText edRating;
    private Button btUpdate, btDelete;
    DbController trailersDB;

    int selectedID;
    String selectedTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_data);
        edTitle = (EditText)findViewById(R.id.eDelTitle);
        edLink = (EditText)findViewById(R.id.editLink);
        edRating = (EditText)findViewById(R.id.eDelRating);
        btUpdate = (Button)findViewById(R.id.buttonUpdate);
        btDelete = (Button)findViewById(R.id.buttonDelete);
        trailersDB = new DbController(this);

        //This is getting the info from the selection screen
        Intent recievedIntent = getIntent();
        //Here we're giving values to the variables...
        selectedID = recievedIntent.getIntExtra("id",-1);//This will store the ID..
        selectedTitle = recievedIntent.getStringExtra("title");

        //This now shows the title on the title thing.
        edTitle.setText(selectedTitle);

    }
}
