package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;


public class cities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
    }
    public void raba(View v){
        Intent i = new Intent(this, phar.class);
        startActivity(i);
    }
    public void mainy(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void pop(View v){
        Toast.makeText(this,"Ce champs sera disponible prochainement",Toast.LENGTH_LONG).show();
    }
}