package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

public class pharmacies extends AppCompatActivity {

    private DocumentReference mDocRef1 = FirebaseFirestore.getInstance().document("favoris/medicaments");
    private DocumentReference mDocRef2 = FirebaseFirestore.getInstance().document("favoris/pharmacies");
    public static final String MEDICA_KEY = "medica1";
    public static final String PHARMA_KEY = "ph1";
    TextView mTextView;
    TextView mmTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacies);

        mTextView = (TextView) findViewById(R.id.textView31);
        mmTextView = (TextView) findViewById(R.id.textView32);

        mDocRef1.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    String medText = documentSnapshot.getString(MEDICA_KEY);

                    mTextView.setText( medText );

                }
            }

        });

        mDocRef2.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    String phText = documentSnapshot.getString(PHARMA_KEY);

                    mmTextView.setText( phText );

                }
            }


        });
    }


    /*
    public void findfavmed(View v){
        TextView txt1= (TextView) findViewById(R.id.textView31);
        if (txt1.toString()=="XALKORI 200 MG, Gélule") {
            Intent i = new Intent(this, xalkoric.class);
            startActivity(i);
        }
        else {
            if (txt1.toString()=="OCET 200 MG, comprimé") {
                Intent i = new Intent(this, quinolxc.class);
                startActivity(i);
            }
            else {
                Intent i = new Intent(this, abilify.class);
                startActivity(i);
            }

        }


    }

    public void findfavphar(View v){
        TextView txt2= (TextView) findViewById(R.id.textView32);
        if (txt2.toString()=="Al Hayat") {
            Intent i = new Intent(this, agdal.class);
            startActivity(i);
        }
        else {
            if (txt2.toString()=="Ibn Rochd") {
                Intent i = new Intent(this, agdal.class);
                startActivity(i);
            }
            else {
                Intent i = new Intent(this, centrale.class);
                startActivity(i);
            }

        }


    }

     */
    public void mainy(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }



}
