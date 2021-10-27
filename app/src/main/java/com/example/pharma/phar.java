package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class phar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phar);
    }
    public void mainy(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void agda(View v){
        Intent i = new Intent(this, agdal.class);
        startActivity(i);
    }
    public void centra(View v){
        Intent i = new Intent(this, centrale.class);
        startActivity(i);
    }
    public void pop(View v){
        Toast.makeText(this,"Ce champs sera disponible prochainement",Toast.LENGTH_LONG).show();
    }
}