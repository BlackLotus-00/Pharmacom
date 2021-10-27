package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ibertinc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ibertinc);
       /* Intent a = getIntent();
        String msg1 = a.getStringExtra("abili");
        ((TextView)findViewById(R.id.textView5)).setText(msg1);
        Intent q = getIntent();
        String msg2 = q.getStringExtra("quino");
        ((TextView)findViewById(R.id.textView28)).setText(msg2);
        Intent x = getIntent();
        String msg3 = x.getStringExtra("xal");
        ((TextView)findViewById(R.id.textView29)).setText(msg3);
*/
    }
    public void mainy(View v){
        Intent i = new Intent(this, abilify.class);
        startActivity(i);
    }
    public void agdalll(View v){
        Intent i = new Intent(this, agdal.class);
        startActivity(i);
    }
    public void centralll(View v){
        Intent i = new Intent(this, centrale.class);
        startActivity(i);
    }
    public void pop(View v){
        Toast.makeText(this,"Ce champs sera disponible prochainement",Toast.LENGTH_LONG).show();
    }
}