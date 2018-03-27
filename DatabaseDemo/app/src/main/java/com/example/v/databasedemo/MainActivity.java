package com.example.v.databasedemo;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
/*

            SQLiteDatabase eventsDB = this.openOrCreateDatabase("Events", MODE_PRIVATE, null);

            eventsDB.execSQL("CREATE TABLE IF NOT EXISTS events (event VARCHAR, year INT(4))");

            eventsDB.execSQL("INSERT INTO events (event, year) VALUES ('End of WW2', 1945)");

            eventsDB.execSQL("INSERT INTO events (event, year) VALUES ('Wham split up', 1986) ");

            Cursor c = eventsDB.rawQuery("SELECT * FROM events", null);

            int eventIndex = c.getColumnIndex("event");

            int yearIndex = c.getColumnIndex("year");

            c.moveToFirst();
            while (c != null) {

                Log.i("Results - Event", c.getString(eventIndex));
                Log.i("Results - Year", Integer.toString(c.getInt(yearIndex)));

                c.moveToNext();

            }
*/


            SQLiteDatabase myDatabase = this.openOrCreateDatabase("Users", MODE_PRIVATE, null);

            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS newUsers (name VARCHAR, age INT(3), id INTEGER PRIMARY KEY  )");

            myDatabase.execSQL("INSERT INTO newUsers (name, age) VALUES ('Kirsten', 21)");

            myDatabase.execSQL("INSERT INTO newUsers (name, age) VALUES ('Ralphie', 1)");

//            myDatabase.execSQL("DELETE FROM users WHERE name = 'Ralphie'  ");

            Cursor c = myDatabase.rawQuery("SELECT * FROM newUsers", null);

            int nameIndex = c.getColumnIndex("name");
            int ageIndex = c.getColumnIndex("age");
            int idIndex = c.getColumnIndex("id");

            c.moveToFirst();
            while(c != null){

                Log.i("UserResults - name", c.getString(nameIndex));
                Log.i("UserResults - age", Integer.toString(c.getInt(ageIndex)));
                Log.i("UserResults - id", Integer.toString(c.getInt(idIndex)));

                c.moveToNext();


            }


        } catch (Exception e){

            e.printStackTrace();

        }


    }
}
