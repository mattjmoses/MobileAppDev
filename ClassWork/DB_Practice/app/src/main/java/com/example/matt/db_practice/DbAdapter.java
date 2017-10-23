package com.example.matt.db_practice;

import android.content.*; //For using Databases
import android.database.*;
import android.database.sqlite.*;
import android.icu.text.DateFormat;
import android.util.Log;



public class DbAdapter
{
    public static final String KEY_ROWID = "_id"; //Setting up the elements of the Databases
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String TAG = "DBAdapter";
    public static final String DATABASE_NAME = "MyDB";
    public static final String DATABASE_TABLE = "contacts";
    public static final int DATABASE_VERSION = 2;

    public static final String DATABASE_CREATE = "CREATE TABLE contacts (_id integer PRIMARY KEY AUTOINCREMENT,"+
            "name text NOT NULL,email text NOT NULL);"; //Create table statement.

    private Context context = null; //Also this. Needs to be null so it works.
    private SQLiteDatabase db;

    public DbAdapter(Context ctx)
    {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }//End constructor


    public static class DatabaseHelper extends SQLiteOpenHelper
    {
        DatabaseHelper(Context context)//Constructor
        {
            super(context,DATABASE_NAME,null,DATABASE_VERSION);
        }

        public void onCreate(SQLiteDatabase db)
        {
            try
            {
                db.execSQL(DATABASE_CREATE);//This creates the database
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }//End onCreate
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            Log.w(TAG,"Upgrade database from version "+ oldVersion + " to " + newVersion+ ", which will destroy all old data >:0");
            db.execSQL("DROP TABLE IF EXISTS contacts"); //Drops the old table
            onCreate(db);

        }

    }//End  inner class DatabaseHelper

    //open the database
    public DbAdapter open() throws SQLException
    {
        db = DBHelper.getWritableDataBase();
        return this;
    }
    //CLOSES the database :0
    public void close()
    {
        DBHelper.close();
    }
    //Insert a contact into the database
    public long insertContact(String name, String email)
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_NAME,name);
        initialValues.put(KEY_EMAIL);
        return db.insert(DATABASE_TABLE,null,initialValues);
    }

    //Delete a contact from the database
    public boolean deleteContact(long rowID)
    {
        return db.delete(DATABASE_TABLE,KEY_ROWID + "=" + rowID, null);
    }
   //Retrieving from the db (Selecting)
    //Retrieve all contacts
    public Cursor getAllContacts()
    {
        return db.query(DATABASE_TABLE,new String[]{KEY_ROWID,KEY_NAME,KEY_EMAIL},null,null,null,null,null);
    }
    //Retrieve specific contact
    public Cursor getContact(long rowID) throws SQLException
    {
        Cursor myCursor = db.query(true, DATABASE_TABLE,new String[]{KEY_ROWID,KEY_NAME,KEY_EMAIL},
                KEY_ROWID + "=" + rowID, null, null, null, null, null);
        if(myCursor !=null)
        {
            //You need to move the cursor back to the top of the database
            //IF you don't it will search from it's current position and may not work
            myCursor.moveToFirst();
        }
        return myCursor;
    }

    //Update a contact
    public boolean updateContact(long rowId, String name, String email)
    {
        ContentValues cVal = new ContentValues();
        cVal.put(KEY_NAME,name);
        cVal.put(KEY_EMAIL,email);
        return db.update(DATABASE_TABLE,cVal,KEY_ROWID + "=" + rowId,null) > 0;
    }

}//End class
