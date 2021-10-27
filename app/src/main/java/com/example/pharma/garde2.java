package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class garde2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garde2);
    }

    public void mainy(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void mpgard(View v){
        Intent i = new Intent(this, pgarde.class);
        startActivity(i);
    }
}