package com.example.pract14chaykapr_22107k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    Button btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnReg);
        btn.setOnClickListener(this);
        btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this,menu.class ));
    }

}