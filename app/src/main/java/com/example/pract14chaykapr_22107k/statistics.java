package com.example.pract14chaykapr_22107k;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class statistics extends AppCompatActivity implements View.OnClickListener {

    Button btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMenu = findViewById(R.id.btnMenu4);
        btnMenu.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        startActivity(new Intent(statistics.this,menu.class ));
    }

}
