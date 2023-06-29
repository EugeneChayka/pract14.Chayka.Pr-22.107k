package com.example.pract14chaykapr_22107k;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity implements View.OnClickListener {

    Button btnMenu;
    Button btnWorkout;
    Button btnStat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMenu = findViewById(R.id.btnMenu1);
        btnMenu.setOnClickListener(this);
        btnWorkout = findViewById(R.id.btnWorkout);
        btnMenu.setOnClickListener(this);
        btnStat = findViewById(R.id.btnStatistics);
        btnStat.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnMenu1){
            startActivity(new Intent(menu.this,MainActivity.class ));
        }
        else if(view.getId()==R.id.btnWorkout){
            startActivity(new Intent(menu.this,workout.class ));
        }
        else if(view.getId()==R.id.btnStatistics){
            startActivity(new Intent(menu.this,statistics.class ));
        }
    }

}
