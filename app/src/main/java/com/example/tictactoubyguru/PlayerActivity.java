package com.example.tictactoubyguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class PlayerActivity extends AppCompatActivity {
TextInputEditText player2Name;
TextInputEditText player1Name;
Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        player1Name = findViewById(R.id.player1Name);
        player2Name = findViewById(R.id.player2Name);
        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String p1name = player1Name.getText().toString();
                String p2name = player2Name.getText().toString();
                if(p1name.length()>9 || p2name.length()>9){
                    Toast.makeText(PlayerActivity.this, "Enter smaller name. Length should be less than 9 alphabets", Toast.LENGTH_SHORT).show();
                }else{
                    Intent players = new Intent(PlayerActivity.this,MainActivity.class);
                    players.putExtra("playerOneName",p1name);
                    players.putExtra("playerTwoName",p2name);
                    startActivity(players);
                    //finish();

                }

            }
        });
    }
}