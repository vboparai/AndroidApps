package com.example.v.todoapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by V on 2018-02-22.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String Database_Name = "ToDoApp.db";
    public static final String Table_Name = "ToDO";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Task";


    public DatabaseHelper(Context context) {
        super(context, Database_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,Task TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_Name);
        onCreate(db);
    }

    public boolean insertData(String task){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, task);

        long result = db.insert(Table_Name, null, contentValues);

        if(result == -1){
            return false;
        }
        else {
            return true;
        }
    }

    //---deletes a particular title---
    public boolean deleteTask(int position)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        return db.delete(Table_Name, COL_1 + "=" + position, null) > 0;
    }




    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + Table_Name, null);
        return res;
    }

}
