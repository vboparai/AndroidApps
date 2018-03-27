package com.example.v.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageButton mickeyBtn = (ImageButton) findViewById(R.id.mickeyBtn);

        ImageButton maskBtn = (ImageButton) findViewById(R.id.maskBtn);

        mickeyBtn.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        mickeyBtn.animate().rotation(1800f).setDuration(2000);

        /*
        mickeyBtn.animate().alpha(0f).setDuration(2000);
        maskBtn.animate().alpha(1f).setDuration(2000);

        */

    }

    public void fadeDown(View view){

        ImageView pikaBtn = (ImageView) findViewById(R.id.pikaBtn);

        pikaBtn.animate().translationYBy(1000f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ImageView pikaBtn = (ImageView) findViewById(R.id.pikaBtn);

        pikaBtn.setTranslationX(-1000f);

        */




    }
}
