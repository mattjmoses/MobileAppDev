package com.mattiscool.matt.finalproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Matt on 2017-12-08.
 */
//Here now is our DB class that does the Database stuff.
public class DbController extends SQLiteOpenHelper {
    //Database variables
    private static final String DB_name = "movies.db";
    private static final String table_name = "trailers";
    private static final String col01 = "id";
    private static final String col02 = "title";
    private static final String col03 = "link";
    private static final String col04 = "rating";

    public DbController(Context context) {
        super(context, DB_name, null, 1); //Values for the DB so far...

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //DB creation string.
        String creatTable = "CREATE TABLE "+ table_name +" (id INTEGER PRIMARY KEY AUTOINCREMENT, "+col02+ " TEXT, "
                +col03+" TEXT,"+col04+ " TEXT)";
        db.execSQL(creatTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ table_name);// Updates the dang table
        onCreate(db);
    }

    //Insert data method.
    public boolean insertValue(String title, String link, String rating)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col02,title);
        contentValues.put(col03,link);
        contentValues.put(col04,rating);

        long result = db.insert(table_name,null,contentValues); //This does the actual inserting into the DB

        if(result == -1)
        {
            return false;
        }
        else
            {
                return true;
            }
    }//End insert value

}//End class
