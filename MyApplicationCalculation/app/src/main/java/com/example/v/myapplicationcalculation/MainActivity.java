package com.example.v.myapplicationcalculation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void Add(View theBtn){

        TextView answerTb = (TextView) findViewById(R.id.answerTb);

        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);

        String number1 = num1.getText().toString();
        String number2 = num1.getText().toString();

        Double Number1 = Double.parseDouble(number1);
        Double Number2 = Double.parseDouble(number2);
        Double answer = Number1 + Number2;

        answerTb.setText(answer.toString());

        Toast.makeText(MainActivity.this, "The sum is: " + answer, Toast.LENGTH_SHORT).show();

    }

    public void Subtract(View theBtn){

        TextView answerTb = (TextView) findViewById(R.id.answerTb);

        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);

        String number1 = num1.getText().toString();
        String number2 = num1.getText().toString();

        Double Number1 = Double.parseDouble(number1);
        Double Number2 = Double.parseDouble(number2);
        Double answer = Number1 - Number2;

        answerTb.setText(answer.toString());

        Toast.makeText(MainActivity.this, "The difference is: " + answer, Toast.LENGTH_SHORT).show();

    }

    public void Multiply(View theBtn){

        TextView answerTb = (TextView) findViewById(R.id.answerTb);

        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);

        String number1 = num1.getText().toString();
        String number2 = num1.getText().toString();

        Double Number1 = Double.parseDouble(number1);
        Double Number2 = Double.parseDouble(number2);
        Double answer = Number1 * Number2;

        answerTb.setText(answer.toString());

        Toast.makeText(MainActivity.this, "The multiplication of the numbers is: " + answer, Toast.LENGTH_SHORT).show();

    }

    public void Divide(View theBtn){

        TextView answerTb = (TextView) findViewById(R.id.answerTb);

        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);

        String number1 = num1.getText().toString();
        String number2 = num1.getText().toString();

        Double Number1 = Double.parseDouble(number1);
        Double Number2 = Double.parseDouble(number2);
        Double answer = Number1 / Number2;

        answerTb.setText(answer.toString());

        Toast.makeText(MainActivity.this, "The division of the numbers is: " + answer, Toast.LENGTH_SHORT).show();

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
