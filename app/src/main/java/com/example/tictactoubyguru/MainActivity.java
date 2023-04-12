package com.example.tictactoubyguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout ll;
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
ImageButton rstbtn;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
TextView p1Score,p2Score,turnDisplay,winnerDisplay;
int flag = 0;
int count = 0;
int winFlag = 0;
int p1s=0,p2s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1Score = findViewById(R.id.p1Score);
        p2Score = findViewById(R.id.p2Score);
        turnDisplay = findViewById(R.id.turnDisplay);
        winnerDisplay = findViewById(R.id.winnerDisplay);

        winnerDisplay.setText("");
        Intent fromPlayers = getIntent();

        String playerOneName = fromPlayers.getStringExtra("playerOneName");
        if(playerOneName.equals("")){
            playerOneName="P1";
        }
        String playerTwoName = fromPlayers.getStringExtra("playerTwoName");
        if(playerTwoName.equals("")){
            playerTwoName="P2";
        }
        p1Score.setText(playerOneName+": 0 ");
        p2Score.setText(playerTwoName+": 0 ");
        turnDisplay.setText(playerOneName+"'s Turn");
        init();

    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        rstbtn=findViewById(R.id.rstbtn);


    }
    public void check(View view){
        Animation vib = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
        Button currButton = (Button) view;
        Intent fromPlayers = getIntent();
        String playerOneName = fromPlayers.getStringExtra("playerOneName");
        if(playerOneName.equals("")){
            playerOneName="P1";
        }
        String playerTwoName = fromPlayers.getStringExtra("playerTwoName");
        if(playerTwoName.equals("")){
            playerTwoName="P2";
        }
        if(winFlag==0){
            if(currButton.getText().toString().equals("")){

                count++;
                if(flag == 0){
                    turnDisplay.setText(playerTwoName+"'s Turn");
                    currButton.setText("X");
                    flag = 1;
                }else{
                    currButton.setText("o");
                    turnDisplay.setText(playerOneName+"'s Turn");
                    flag = 0;
                }
                if(count>4){
                    b1 = btn1.getText().toString();
                    b2 = btn2.getText().toString();
                    b3 = btn3.getText().toString();
                    b4 = btn4.getText().toString();
                    b5 = btn5.getText().toString();
                    b6 = btn6.getText().toString();
                    b7 = btn7.getText().toString();
                    b8 = btn8.getText().toString();
                    b9 = btn9.getText().toString();

                    if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){

                        if(flag == 1){
                            p1s++;
                            p1Score.setText(playerOneName+": "+p1s);
                            winnerDisplay.setText(playerOneName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }else{
                            p2s++;
                            p2Score.setText(playerTwoName+": "+p2s);
                            winnerDisplay.setText(playerTwoName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }
                        //changing winners colour to green
                        btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn2.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn3.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        //showing vibration
                        btn1.startAnimation(vib);
                        btn2.startAnimation(vib);
                        btn3.startAnimation(vib);


//                        Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                        if(flag == 1){
                            p1s++;
                            p1Score.setText(playerOneName+": "+p1s);
                            winnerDisplay.setText(playerOneName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }else{
                            p2s++;
                            p2Score.setText(playerTwoName+": "+p2s);
                            winnerDisplay.setText(playerTwoName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }
                        btn4.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn5.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn6.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        //showing vibration
                        btn4.startAnimation(vib);
                        btn5.startAnimation(vib);
                        btn6.startAnimation(vib);
//                        Toast.makeText(this, "Winner is "+b4, Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                        if(flag == 1){
                            p1s++;
                            p1Score.setText(playerOneName+": "+p1s);
                            winnerDisplay.setText(playerOneName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }else{
                            p2s++;
                            p2Score.setText(playerTwoName+": "+p2s);
                            winnerDisplay.setText(playerTwoName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }
                        btn7.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn8.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn9.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn7.startAnimation(vib);
                        btn8.startAnimation(vib);
                        btn9.startAnimation(vib);
//                        Toast.makeText(this, "Winner is "+b7, Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                        if(flag == 1){
                            p1s++;
                            p1Score.setText(playerOneName+": "+p1s);
                            winnerDisplay.setText(playerOneName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }else{
                            p2s++;
                            p2Score.setText(playerTwoName+": "+p2s);
                            winnerDisplay.setText(playerTwoName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }
                        btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn4.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn7.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn1.startAnimation(vib);
                        btn4.startAnimation(vib);
                        btn7.startAnimation(vib);
//                        Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                        if(flag == 1){
                            p1s++;
                            p1Score.setText(playerOneName+": "+p1s);
                            winnerDisplay.setText(playerOneName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }else{
                            p2s++;
                            p2Score.setText(playerTwoName+": "+p2s);
                            winnerDisplay.setText(playerTwoName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }
                        btn2.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn5.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn8.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn2.startAnimation(vib);
                        btn5.startAnimation(vib);
                        btn8.startAnimation(vib);
//                        Toast.makeText(this, "Winner is "+b2, Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                        if(flag == 1){
                            p1s++;
                            p1Score.setText(playerOneName+": "+p1s);
                            winnerDisplay.setText(playerOneName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }else{
                            p2s++;
                            p2Score.setText(playerTwoName+": "+p2s);
                            winnerDisplay.setText(playerTwoName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }
                        btn3.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn6.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn9.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn3.startAnimation(vib);
                        btn6.startAnimation(vib);
                        btn9.startAnimation(vib);
//                        Toast.makeText(this, "Winner is "+b3, Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                        if(flag == 1){
                            p1s++;
                            p1Score.setText(playerOneName+": "+p1s);
                            winnerDisplay.setText(playerOneName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }else{
                            p2s++;
                            p2Score.setText(playerTwoName+": "+p2s);
                            winnerDisplay.setText(playerTwoName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }
                        btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn5.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn9.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn1.startAnimation(vib);
                        btn5.startAnimation(vib);
                        btn9.startAnimation(vib);
//                        Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                        if(flag == 1){
                            p1s++;
                            p1Score.setText(playerOneName+": "+p1s);
                            winnerDisplay.setText(playerOneName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }else{
                            p2s++;
                            p2Score.setText(playerTwoName+": "+p2s);
                            winnerDisplay.setText(playerTwoName+" Wins !!");
                            winnerDisplay.startAnimation(scale);
                        }
                        btn3.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn5.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn7.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.green));
                        btn3.startAnimation(vib);
                        btn5.startAnimation(vib);
                        btn7.startAnimation(vib);
//                        Toast.makeText(this, "Winner is "+b3, Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }else if(count==9){
                        winnerDisplay.setText("Game Tie 💀");
                        winnerDisplay.startAnimation(scale);
//                        Toast.makeText(this, "Game Tie", Toast.LENGTH_SHORT).show();
                        winFlag = 1;

                    }
                }

            }
        }else{
            Toast.makeText(this, "You should Restart this Game", Toast.LENGTH_SHORT).show();
        }


    }


    public void newGame(View v){
        Animation rotote = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        rstbtn.startAnimation(rotote);
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        winFlag=0;
        btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        btn2.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        btn3.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        btn4.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        btn5.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        btn6.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        btn7.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        btn8.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        btn9.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.creamyWhite));
        winnerDisplay.setText("");
        Toast.makeText(this, "Game Restarted", Toast.LENGTH_SHORT).show();
    }
}