package com.example.v.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper mydb = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addBtn(View view){

        EditText task = (EditText) findViewById(R.id.addTaskText);

        boolean result = mydb.insertData(task.getText().toString());

        if(result){
            Toast.makeText(getApplicationContext(),"Task Successfully Inserted", Toast.LENGTH_LONG).show();
            task.setText("");
        }
        else {
            Toast.makeText(getApplicationContext(),"FAILED!!!!!!!!!!!", Toast.LENGTH_LONG).show();
        }
    }

    public void viewTasksBtn(View view){

        Intent it = new Intent(MainActivity.this, DisplayTasksActivity.class);

        startActivity(it);

    }



}
