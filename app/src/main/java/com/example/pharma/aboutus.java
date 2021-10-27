package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
    }
    public void mainbut(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void gardbut(View v){
        Intent i = new Intent(this, pgarde.class);
        startActivity(i);

    }
}