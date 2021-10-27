package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pharmacy(View v){
        Intent i = new Intent(this, pharmacies.class);
        startActivity(i);

    }
    public void about(View v){
        Intent i = new Intent(this, aboutus.class);
        startActivity(i);

    }
    public void mapi(View v){
        Intent i = new Intent(this, MapsAct.class);
        startActivity(i);

    }
    public void medicamentss(View v){
        Intent i = new Intent(this, medicaments.class);
        startActivity(i);

    }
    public void medica(View v){
        Intent i = new Intent(this, ocetc.class);
        startActivity(i);

    }
    public void city(View v){
        Intent i = new Intent(this, cities.class);
        startActivity(i);
    }
}