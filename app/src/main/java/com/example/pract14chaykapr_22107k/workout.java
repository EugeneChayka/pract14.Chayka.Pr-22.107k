package com.example.pract14chaykapr_22107k;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class workout extends AppCompatActivity implements View.OnClickListener {

    Button btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMenu = findViewById(R.id.btnMenu3);
        btnMenu.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        startActivity(new Intent(workout.this,menu.class ));
    }

}
