package com.example.v.connect3;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // 0 = green, 1 = red

    int activePlayer = 0;

    // 2 means unplayed
    int[] gameState = { 2, 2, 2, 2, 2, 2, 2, 2 , 2};

    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8},{0,4,8}, {2,4,6} };


    public void dropIn(View view){

        ImageView counter = (ImageView) view;

        counter.getTag();

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 2) {

            gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1000f);

            if (activePlayer == 0) {

                counter.setImageResource(R.drawable.greenchip);
                activePlayer = 1;

            } else {

                counter.setImageResource(R.drawable.blackchip);
                activePlayer = 0;

            }

            counter.animate().translationYBy(1000f).rotation(360).setDuration(500);
        }

        for (int[] winningPosition : winningPositions){

            if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                    gameState[winningPosition[1]] == gameState[winningPosition[2]]&&
                    gameState[winningPosition[0]] != 2){

                String winner = "Black";
                if (gameState[winningPosition[0]] == 0){
                    winner = "Green";

                }

                TextView winnerMessage = (TextView) findViewById(R.id.winnerMsg);

                winnerMessage.setText(" HAS WON!!!");

                Button layout = (Button) findViewById(R.id.playAgainBtn);

                layout.setVisibility(View.VISIBLE);

            }
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
