package com.example.android.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView gameStatus;
    ImageView ticTacToeGrid;
    ImageButton Button1;
    ImageButton Button2;
    ImageButton Button3;
    ImageButton Button4;
    ImageButton Button5;
    ImageButton Button6;
    ImageButton Button7;
    ImageButton Button8;
    ImageButton Button9;
    ImageView turnIndicatorX;
    ImageView xImage;
    TextView xScore;
    ImageView turnIndicatorO;
    ImageView oImage;
    TextView oScore;
    ImageButton resetButton;
    boolean xTurn = true;
    int xPoints = 0;
    int oPoints = 0;
    int[] gridValues = {3,4,5,6,7,8,9,10,11};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameStatus = (TextView) findViewById(R.id.game_status);
        ticTacToeGrid = (ImageView) findViewById(R.id.grid_view);
        Button1 = (ImageButton) findViewById(R.id.button1);
        Button2 = (ImageButton) findViewById(R.id.button2);
        Button3 = (ImageButton) findViewById(R.id.button3);
        Button4 = (ImageButton) findViewById(R.id.button4);
        Button5 = (ImageButton) findViewById(R.id.button5);
        Button6 = (ImageButton) findViewById(R.id.button6);
        Button7 = (ImageButton) findViewById(R.id.button7);
        Button8 = (ImageButton) findViewById(R.id.button8);
        Button9 = (ImageButton) findViewById(R.id.button9);
        turnIndicatorX = (ImageView) findViewById(R.id.turn_indicator_x);
        xImage = (ImageView) findViewById(R.id.x_image);
        xScore = (TextView) findViewById(R.id.x_score);
        turnIndicatorO = (ImageView) findViewById(R.id.turn_indicator_o);
        oImage = (ImageView) findViewById(R.id.o_image);
        oScore = (TextView) findViewById(R.id.o_score);
        resetButton = (ImageButton) findViewById(R.id.reset_button);
    }

    public void gridButton1Pressed (View view){
        if(xTurn == true){
            Button1.setBackgroundResource(R.drawable.cross);
            gridValues[0] = 1;
        }
        else{
            Button1.setBackgroundResource(R.drawable.naught);
            gridValues[0] = 2;
        }
        Button1.setEnabled(false);
        check();
    }

    public void gridButton2Pressed (View view){
        if(xTurn == true){
            Button2.setBackgroundResource(R.drawable.cross);
            gridValues[1] = 1;
        }
        else{
            Button2.setBackgroundResource(R.drawable.naught);
            gridValues[1] = 2;
        }
        Button2.setEnabled(false);
        check();
    }

    public void gridButton3Pressed (View view){
        if(xTurn == true){
            Button3.setBackgroundResource(R.drawable.cross);
            gridValues[2] = 1;
        }
        else{
            Button3.setBackgroundResource(R.drawable.naught);
            gridValues[2] = 2;
        }
        Button3.setEnabled(false);
        check();
    }

    public void gridButton4Pressed (View view){
        if(xTurn == true){
            Button4.setBackgroundResource(R.drawable.cross);
            gridValues[3] = 1;
        }
        else{
            Button4.setBackgroundResource(R.drawable.naught);
            gridValues[3] = 2;
        }
        Button4.setEnabled(false);
        check();
    }

    public void gridButton5Pressed (View view){
        if(xTurn == true){
            Button5.setBackgroundResource(R.drawable.cross);
            gridValues[4] = 1;
        }
        else{
            Button5.setBackgroundResource(R.drawable.naught);
            gridValues[4] = 2;
        }
        Button5.setEnabled(false);
        check();
    }

    public void gridButton6Pressed (View view){
        if(xTurn == true){
            Button6.setBackgroundResource(R.drawable.cross);
            gridValues[5] = 1;
        }
        else{
            Button6.setBackgroundResource(R.drawable.naught);
            gridValues[5] = 2;
        }
        Button6.setEnabled(false);
        check();
    }

    public void gridButton7Pressed (View view){
        if(xTurn == true){
            Button7.setBackgroundResource(R.drawable.cross);
            gridValues[6] = 1;
        }
        else{
            Button7.setBackgroundResource(R.drawable.naught);
            gridValues[6] = 2;
        }
        Button7.setEnabled(false);
        check();
    }

    public void gridButton8Pressed (View view){
        if(xTurn == true){
            Button8.setBackgroundResource(R.drawable.cross);
            gridValues[7] = 1;
        }
        else{
            Button8.setBackgroundResource(R.drawable.naught);
            gridValues[7] = 2;
        }
        Button8.setEnabled(false);
        check();
    }

    public void gridButton9Pressed (View view){
        if(xTurn == true){
            Button9.setBackgroundResource(R.drawable.cross);
            gridValues[8] = 1;
        }
        else{
            Button9.setBackgroundResource(R.drawable.naught);
            gridValues[8] = 2;
        }
        Button9.setEnabled(false);
        check();
    }

    public void check(){
        if(xTurn == true){
            if((gridValues[0] == gridValues[1] && gridValues[1] == gridValues[2]) ||
                    (gridValues[3] == gridValues[4] && gridValues[4] == gridValues[5]) ||
                    (gridValues[6] == gridValues[7] && gridValues[7] == gridValues[8]) ||
                    (gridValues[0] == gridValues[3] && gridValues[3] == gridValues[6]) ||
                    (gridValues[1] == gridValues[4] && gridValues[4] == gridValues[7]) ||
                    (gridValues[2] == gridValues[5] && gridValues[5] == gridValues[8]) ||
                    (gridValues[0] == gridValues[4] && gridValues[4] == gridValues[8]) ||
                    (gridValues[2] == gridValues[4] && gridValues[4] == gridValues[6])){
                xPoints = xPoints + 1;
                xScore.setText(" : " + xPoints);
                gameStatus.setText("X Wins. Press Reset.");
            }
            else if(gridValues[0]>2 && gridValues[1]>2 &&  gridValues[2]>2
                    &&  gridValues[3]>2 &&  gridValues[4]>2 &&  gridValues[5]>2
                    &&  gridValues[6]>2 && gridValues[7]>2 &&  gridValues[8]>2){
                gameStatus.setText("Match Tied. Press Reset");
            }
            else{
                gameStatus.setText("");
                xTurn = false;
                turnIndicatorX.setBackgroundResource(R.drawable.blank);
                turnIndicatorO.setBackgroundResource(R.drawable.wood_arrow);
            }
        }
        else{
            if((gridValues[0] == gridValues[1] && gridValues[1] == gridValues[2]) ||
                    (gridValues[3] == gridValues[4] && gridValues[4] == gridValues[5]) ||
                    (gridValues[6] == gridValues[7] && gridValues[7] == gridValues[8]) ||
                    (gridValues[0] == gridValues[3] && gridValues[3] == gridValues[6]) ||
                    (gridValues[1] == gridValues[4] && gridValues[4] == gridValues[7]) ||
                    (gridValues[2] == gridValues[5] && gridValues[5] == gridValues[8]) ||
                    (gridValues[0] == gridValues[4] && gridValues[4] == gridValues[8]) ||
                    (gridValues[2] == gridValues[4] && gridValues[4] == gridValues[6])){
                oPoints = oPoints + 1;
                oScore.setText(" : " + oPoints);
                gameStatus.setText("O Wins. Press Reset.");
            }
            else if(gridValues[0]>2 && gridValues[1]>2 &&  gridValues[2]>2
                    &&  gridValues[3]>2 &&  gridValues[4]>2 &&  gridValues[5]>2
                    &&  gridValues[6]>2 && gridValues[7]>2 &&  gridValues[8]>2){
                gameStatus.setText("Match Tied. Press Reset");
            }
            else{
                gameStatus.setText("");
                xTurn = true;
                turnIndicatorX.setBackgroundResource(R.drawable.wood_arrow);
                turnIndicatorO.setBackgroundResource(R.drawable.blank);
            }
        }
    }

    public void resetButtonClicked(View view){
        Button1.setEnabled(true);
        Button1.setBackgroundResource(R.drawable.blank);
        Button2.setEnabled(true);
        Button2.setBackgroundResource(R.drawable.blank);
        Button3.setEnabled(true);
        Button3.setBackgroundResource(R.drawable.blank);
        Button4.setEnabled(true);
        Button4.setBackgroundResource(R.drawable.blank);
        Button5.setEnabled(true);
        Button5.setBackgroundResource(R.drawable.blank);
        Button6.setEnabled(true);
        Button6.setBackgroundResource(R.drawable.blank);
        Button7.setEnabled(true);
        Button7.setBackgroundResource(R.drawable.blank);
        Button8.setEnabled(true);
        Button8.setBackgroundResource(R.drawable.blank);
        Button9.setEnabled(true);
        Button9.setBackgroundResource(R.drawable.blank);
        gameStatus.setText("");
    }
}
