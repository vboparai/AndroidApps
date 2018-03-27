package com.example.v.myformapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View btn){

        EditText name = (EditText) findViewById(R.id.inputName);
        EditText email = (EditText) findViewById(R.id.inputEmail);
        EditText password = (EditText) findViewById(R.id.inputPW);

        String nm = name.getText().toString();
        String em = email.getText().toString();
        String pw = password.getText().toString();

        String[] details = new String[3];
        details[0] = nm;
        details[1] = em;
        details[2] = pw;

        Intent it = new Intent(MainActivity.this, SuccessfulRegistrationActivity.class);

        it.putExtra("details", details);

        startActivity(it);

    }








}
