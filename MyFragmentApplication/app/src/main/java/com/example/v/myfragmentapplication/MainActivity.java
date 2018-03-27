package com.example.v.myfragmentapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("log test","testing");

    }

    public void FragBtn1(View view){

//        EditText sampleText = (EditText) findViewById(R.id.editText);
//
//        Bundle bundle = new Bundle();
//        bundle.putString("theText", sampleText.getText().toString());

        Fragment frag = new NewFragment1();

//        frag.setArguments(bundle);

        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment1, frag);
        transaction.commit();

    }

    public void FragBtn2(View view){

//        EditText sampleText = (EditText) findViewById(R.id.editText);
//
//        Bundle bundle = new Bundle();
//        bundle.putString("theText", sampleText.getText().toString());

        Fragment frag = new NewFrangment2();

//        frag.setArguments(bundle);

        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment1, frag);
        transaction.commit();



    }


}
