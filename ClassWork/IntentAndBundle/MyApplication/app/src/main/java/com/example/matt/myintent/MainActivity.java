package com.example.matt.myintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View.*; //For OnClickListener
import android.content.Intent; //For intent
import android.provider.ContactsContract; //contacts manager
import android.net.Uri; //used for URLS
import android.widget.*; //controls aka views

public class MainActivity extends AppCompatActivity {
    //Building buttons
    Button btnBrowser,btnPhone,btnContacts,btnMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hooking up the buttons :/
        btnBrowser = (Button)findViewById(R.id.btnBrowser);
        btnPhone = (Button)findViewById(R.id.btnPhone);
        btnContacts =(Button)findViewById(R.id.btnContacts);
        btnMap =(Button)findViewById(R.id.btnMap);

        //Setting the listeners
        btnBrowser.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating intent object
                Intent i = new Intent("android.intent.action.VIEW");
               //Opens the browser
                i.setData(Uri.parse("http://www.nscc.ca"));
                startActivity(i);
            }
        });

        btnPhone.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
//            Intent i = new Intent(android.content.Intent.ACTION_CALL,
//                    Uri.parse("tel:9021234567"));
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:9028778554"));
                startActivity(i);
            }
        });

        btnContacts.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //You can use i every time since each listener is its own class.
                Intent i = new Intent(Intent.ACTION_PICK);
                i.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
                startActivity(i);
            }
        });

        btnMap.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
//            Intent i = new Intent(Intent.ACTION_VIEW,
//                    Uri.parse());

//                This is the long way of doing location info. IT'S NOT COOL
//                I mean it works, but I'm new to this. SO....
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://maps.google.ca/maps?q=moscow&hl=en&11=55.756486,"+
                                        "37.628174&spn=0.755757,1.678162&sll=44.004261,"+
                                        "-62.918551&sspn=7.726484,13.425293&hnear=Moscow,+gorod+"+
                                        "Moskva,+Russia&t=m&z=9&iwloc=A"));

//                //Alternate waaay which presently doesn't work
//                String geoAddress = "http://maps.google.com/maps?q=";
//                String[] LatLong = {"44.67","-63.61"};
//                geoAddress += LatLong[0]+","+LatLong[1];
//
//                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(geoAddress));

                startActivity(i);
            }
        });

    }//End Oncreate
}//End clas
