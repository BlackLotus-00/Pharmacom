package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quinolxc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinolxc);
    }
    public void mainy(View v){
        Intent i = new Intent(this, ocetc.class);
        startActivity(i);
    }
    public void phar(View v){
        Intent q = new Intent(this, ibertinc.class);
        q.putExtra("quino","OCET 200 MG, comprimé");
        startActivity(q);
    }
}