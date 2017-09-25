package com.example.matt.intenttonav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button btnGoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoto = (Button)findViewById(R.id.btnGoTo);


        btnGoto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is all one line that works in one shot
//                startActivity(new Intent("ActivityTwo")); //create intent object
                Bundle extras = new Bundle(); //Create bundle object


//                Starts up the second activity
                Intent i = new Intent("ActivityTwo");
                extras.putString("KEY","Stuff"); //Fill bundle
                i.putExtras(extras);
                startActivityForResult(i,1);
            }
        });
    }
}
