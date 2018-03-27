package com.example.v.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertBtn(View view){

        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());

        Double poundAmount = dollarAmountDouble * 0.75;

        TextView convertedAmount = (TextView) findViewById(R.id.conversionTextView);
        convertedAmount.setText("£" + String.format("%.2f", poundAmount).toString());

        Toast.makeText(MainActivity.this, "£" + String.format("%.2f", poundAmount).toString(), Toast.LENGTH_LONG).show();

        Log.d("AMOUNT", dollarAmountEditText.getText().toString());

    }

}
