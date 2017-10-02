package com.example.matt.hashmapexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//Importing the business. Hooo hoo hooo doggy
import android.view.View.*;
import android.content.*;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

//A hashmap is a data structure that uses a mathematical hash function to map identifying values
//(known as keys), to associate values. eg. mapping a name to a phone number
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Hash maps are objects and you have to tell what you want to store in it
        Map<String,String> map = new HashMap<String,String>();
        //ALWAYS spell color the American way. Fuck you America. Fuccck YOOOOOOOOUUUU!!! >:0
        map.put("Color1","Red");
        map.put("Color2","Blue");
        map.put("Color3","Green");
        map.put("Color4","White");
        //This goes through the values of the map
        Iterator<String> myIterator = map.values().iterator();
        //Means the current context of the screen. Like uh On THIS current screen instead of over there.
        Context context = getApplicationContext();

        while(myIterator.hasNext())//While there's something left on the list to read
        {
//            Toast.makeText(getBaseContext(),myIterator.next(),Toast.LENGTH_LONG).show();
            CharSequence text = myIterator.next();
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        }//End while

        String s = map.get("Color1"); //to give a key and get its associate value back!!
        Toast.makeText(getBaseContext(),s,Toast.LENGTH_LONG).show();



    }//End oncreate
}//End class
