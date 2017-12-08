package com.mattiscool.matt.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Matt on 2017-12-08.
 */
//Here now is our DB class that does the Database stuff.
public class DbController extends SQLiteOpenHelper {
    //Database variables
    public static final String DB_name = "movies.db";
    public static final String table_name = "trailers";
    public static final String col01 = "id";
    public static final String col02 = "title";
    public static final String col03 = "link";
    public static final String col04 = "rating";

    public DbController(Context context) {
        super(context, DB_name, null, 1); //Values for the DB so far...
        SQLiteDatabase db = this.getWritableDatabase(); //This is only for testing purposes.
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //DB creation string.
        db.execSQL("CREATE TABLE "+table_name +"("+col01+" INTEGER PRIMARY KEY AUTOINCREMENT, "+col02+"TEXT, " +col03+"TEXT, "+ col04+"INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ table_name);// Updates the dang table
        onCreate(db);
    }
}
