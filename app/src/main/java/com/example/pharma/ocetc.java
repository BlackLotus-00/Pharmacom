package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ocetc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ocetc);
    }

    public void mainy(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void abilifyc(View v){
        Intent i = new Intent(this, abilify.class);
        startActivity(i);
    }

    public void ocet(View v){
        Intent i = new Intent(this, medicaments.class);
        startActivity(i);
    }
    public void quinolox(View v){
        Intent i = new Intent(this, quinolxc.class);
        startActivity(i);
    }
    public void xalkory(View v){
        Intent i = new Intent(this, xalkoric.class);
        startActivity(i);
    }
    public void pop(View v){
        Toast.makeText(this,"Ce champs sera disponible prochainement",Toast.LENGTH_LONG).show();
    }
}