package com.example.matt.intenttonav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.Intent;

public class ActivityTwo extends AppCompatActivity {
    TextView tvStuffRec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvStuffRec = (TextView)findViewById(R.id.tvStuffRec);

        String myStuff ="";

        Bundle extras = getIntent().getExtras();
//        ensure it isn't empty'
        if(extras !=null)
        {
            myStuff = extras.getString("KEY");
                    tvStuffRec.setText(myStuff);
        }

    }//End onCreate
}//End Class
