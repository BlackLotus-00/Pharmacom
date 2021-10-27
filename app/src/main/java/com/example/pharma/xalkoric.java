package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class xalkoric extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xalkoric);
    }
    public void mainy(View v){
        Intent i = new Intent(this, ocetc.class);
        startActivity(i);
    }
    public void phar(View v){
        Intent x = new Intent(this, ibertinc.class);
        x.putExtra("xal","XALKORI 200 MG, Gélule");
        startActivity(x);
    }
}