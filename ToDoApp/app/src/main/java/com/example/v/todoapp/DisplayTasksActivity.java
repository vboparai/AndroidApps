package com.example.v.todoapp;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplayTasksActivity extends AppCompatActivity {

    DatabaseHelper mydb = new DatabaseHelper(this);
    private String selectedItem;                // Stores the selected list item
    private final Context context = this;        // This context
    private ArrayAdapter<String> ld;
    ArrayList<String> myArrayList = new ArrayList<String>();
    public int location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_tasks);

        Cursor myCursor = mydb.getAllData();

        for(myCursor.moveToFirst(); !myCursor.isAfterLast(); myCursor.moveToNext()) {
            // The Cursor is now set to the right position
            myArrayList.add(myCursor.getString(1));
        }

        ld = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , myArrayList);

        ListView lv = (ListView) findViewById(R.id.tasksList);

        lv.setAdapter(ld);

        // Create the listener for normal item clicks
        OnItemClickListener itemListener = new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long rowid) {

                Toast.makeText(
                        getApplicationContext(),
                        "You have clicked on " + parent.getItemAtPosition(position).toString() + ".",
                        Toast.LENGTH_SHORT).show();
            }
        };

        // Create the listener for long item clicks
        AdapterView.OnItemLongClickListener itemLongListener = new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View v, int position, long rowid) {

                // Store selected item in global variable
                selectedItem = parent.getItemAtPosition(position).toString();

                location = position;

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Do you want to remove " + selectedItem + "?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        ld.remove(selectedItem);
                        ld.notifyDataSetChanged();

                        mydb.deleteTask(location);

                        Toast.makeText(
                                getApplicationContext(),
                                selectedItem + " has been removed.",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                // Create and show the dialog
                builder.show();

                // Signal OK to avoid further processing of the long click
                return true;
            }
        };

        // Assign both click listeners
        lv.setOnItemClickListener(itemListener);
        lv.setOnItemLongClickListener(itemLongListener);


    }



}
