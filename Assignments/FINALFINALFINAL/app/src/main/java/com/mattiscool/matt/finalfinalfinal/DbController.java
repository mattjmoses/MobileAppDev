package com.mattiscool.matt.finalfinalfinal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Matt on 2017-12-10.
 */

public class DbController extends SQLiteOpenHelper {

    private final static int db_version = 1;
    private final static String db_name = "trailer_db";
    private final static String table_name = "trailers";
    private final static String t_id = "id";
    private final static String t_title = "title";
    private final static String t_link = "link";
    private final static String t_rating = "rating";



    //The ol default constructor
    public DbController(Context context) {
        super(context, db_name,null,db_version );



    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db = this.getWritableDatabase();

        db.execSQL("CREATE TABLE trailers(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, link TEXT, rating TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ table_name);
        onCreate(db);
    }

    public boolean insertData(String title, String link, String rating)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(t_title,title);
        values.put(t_link,link);
        values.put(t_rating,rating);
        long result = db.insert(table_name,null,values);
        db.close();
        if(result == -1)
        {
            return false;
        }
        else
            {
                return true;
            }


    }
}
