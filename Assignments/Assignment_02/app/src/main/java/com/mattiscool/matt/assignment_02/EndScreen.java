package com.mattiscool.matt.assignment_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EndScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);

        TextView endMessage;
        endMessage = (TextView)findViewById(R.id.txtEndMessage);

        Bundle bundle = getIntent().getExtras();
        String score = bundle.getString("data");
        Bundle bundle02 = getIntent().getExtras();
        String name = bundle02.getString("name");

        endMessage.setText("Congratulaitons, your final score is.." + score + " out of 10!");
    }
}
