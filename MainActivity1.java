package com.example.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.StringDef;

public class MainActivity1<roundCount, PlayerOneScoreCount, PlayerTwoScoreCount, activePlayer> extends Activity {
    private Button[] buttons = new Button[9]
    private Button resetGame;
    private int PlayerOneScoreCount, PlayerTwoScoreCount, roundCount;
    private TextView PlayerOneScore, PlayerTwoScore, PlayerStatus;


    boolean activePlayer;

    int[] gamestate = {2, 2, 2, 2, 2, 2, 2, 2, 2,};
    int[][] winningPositions = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},  //rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, //columns
            {0, 4, 8}, {2.4.6}          //cross
    };


    PlayerOneScore = (TextView) findViewById(R.id.PlayerOneScore);
    PlayerTwoScore = (TextView) findViewById(R.id.PlayerTwoScore);
    PlayerStatus = (TextView) findViewById(R.id.PlayerStatus);
    resetGame = (Button) findViewById(R.id.resetGame);



    for (int i = 0 < buttons.length; i++){
        String buttonID ="btn" + i;
        int resourceID = getResources().getIdentifier(buttonID, "id", getPackageName());
        buttons[i] = (Button) findViewById(resourceID)
        buttons[i]. setOnClickListener(this);
    }
     roundCount = 0;
    PlayerOneScoreCount = 0;
    PlayerTwoScoreCount = 0;
    activePlayer = true;
}

@Override
public void onClick(View v){
    if (!((Button) v).getText().toString().equals("")) {
        return;
    }
        String buttonID = v.getResources().getResourceEntryName(v.getId());
        int gameStatePointer = Integer,parseint(buttonID.substring(buttonID.length()-1));

    if (activePlayer) {
        ((Button) v).setText("X");
        ((Button) v).setTextColor(Color.parseColor('FF018786'));
        gamestate[gameStatePointer] = 0;
    }else{
        ((Button) v).setText("O");
        ((Button) v).setTextColor(Color.parseColor(3D1818));
        gamestate[gameStatePointer] = 1;
        roundCount ++;
        
        


    }
}

    private boolean checkWinner() {
    if activePlayer{
            PlayerOneScoreCount++;

        }


    private void updatePlayerScore() {
    }
