package com.example.v.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Toast.makeText(MainActivity.this,"ON START", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Toast.makeText(MainActivity.this,"ON RESUME", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Toast.makeText(MainActivity.this,"ON PAUSE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Toast.makeText(MainActivity.this,"ON RESTART", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Toast.makeText(MainActivity.this,"ON STOP", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Toast.makeText(MainActivity.this,"ON DESTROY", Toast.LENGTH_SHORT).show();
    }


}
