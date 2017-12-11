package com.mattiscool.matt.finalfinalfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Matt on 2017-12-10.
 */

public class EditActivity extends AppCompatActivity {
    private EditText edTitle;
    private EditText edLink;
    private EditText edRating;
    private Button btUpdate, btDelete, backToData;
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
        backToData = (Button)findViewById(R.id.buttonBacktoDisplay);

        //This is getting the info from the selection screen
        Intent recievedIntent = getIntent();
        //Here we're giving values to the variables...
        selectedID = recievedIntent.getIntExtra("id",-1);//This will store the ID..
        selectedTitle = recievedIntent.getStringExtra("title");

        //This now shows the title on the title thing.
        edTitle.setText(selectedTitle);

        //The back button
        backToData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToData= new Intent(EditActivity.this, DisplayDBActivity.class);
                startActivity(backToData);
            }
        });

        //The update button
        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edTitle.getText().toString();
                //Checking if value is null
                if(!title.equals(""))
                {
                    trailersDB.updateRow(title,selectedID);  //Passing the title and ID to the update method
                }
                else
                    {
                        Toast.makeText(EditActivity.this, "Please fill out all fields", Toast.LENGTH_LONG).show();
                    }

            }
        });
        //The delete button (obviously)
        btDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trailersDB.deleteRow(selectedID);//Removing the row based on id

            }
        });
    }
}
