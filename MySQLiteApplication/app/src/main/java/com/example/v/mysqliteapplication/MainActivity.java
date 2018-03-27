package com.example.v.mysqliteapplication;

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

    public void AddDataBtn(View view){

        EditText name = (EditText) findViewById(R.id.editTextName);

        boolean result = mydb.insertData(name.getText().toString());

        if(result){
            Toast.makeText(getApplicationContext(),"Successfully Inserted", Toast.LENGTH_LONG).show();
            name.setText("");
        }
        else {
            Toast.makeText(getApplicationContext(),"FAILED!!!!!!!!!!!", Toast.LENGTH_LONG).show();
        }

    }


}
