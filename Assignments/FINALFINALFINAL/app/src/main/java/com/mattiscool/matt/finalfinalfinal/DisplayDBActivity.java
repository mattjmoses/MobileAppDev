package com.mattiscool.matt.finalfinalfinal;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Matt on 2017-12-10.
 */

public class DisplayDBActivity extends AppCompatActivity {

    private static final String tag = "displayDBActivity";
    DbController trailersDB;
    ListView dbContents;

    @Override
    protected void onCreate(@Nullable Bundle savedInstaceState)
    {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.displaydblayout);
        trailersDB = new DbController(this);
        dbContents = (ListView)findViewById(R.id.list_layout);
    }
    //Displays the contents of the DB..
    public void populateList()
    {
        //This gets all our data from the DB..
        Cursor data = trailersDB.getAllData();
        //To keep our data.
        ArrayList<String> listData = new ArrayList<>();
        while(data.moveToNext())
        {
            listData.add(data.getString(1));
        }
        final ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listData);
        dbContents.setAdapter(adapter);

        //Allows you to click the item to see the data
        dbContents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = parent.getItemAtPosition(position).toString();
                Cursor data = trailersDB.getId(title);
                int t_id = -1;
                while(data.moveToNext())
                {
                    t_id = data.getInt(0); //Gets the id and puts it in the variable.
                    if(t_id > -1)
                    {
                        //So, if there's data then move on over to the edit screen.
                        Intent editScreenIntent = new Intent(DisplayDBActivity.this, EditActivity.class);
                        editScreenIntent.putExtra("id",t_id);
                        editScreenIntent.putExtra("title",title); //This is sending along the id and title along.
                        startActivity(editScreenIntent);//Then off we go!
                    }
                }


            }
        });
    }
}
