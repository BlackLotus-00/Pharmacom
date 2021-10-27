package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class medicaments extends AppCompatActivity {
    private DocumentReference mDocRef1 = FirebaseFirestore.getInstance().document("pharmacies_de_garde/Casablanca");
    private DocumentReference mDocRef2 = FirebaseFirestore.getInstance().document("pharmacies_de_garde/Rabat");
    public static final String PHARMA1_KEY = "ph1";
    public static final String PHARMA2_KEY = "ph2";
    public static final String PHARMA3_KEY = "ph3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicament);

    }
    public void mainy(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void phrabat(View v){
        TextView txt1= (TextView) findViewById(R.id.textView33);
        TextView txt2= (TextView) findViewById(R.id.textView34);
        TextView txt3= (TextView) findViewById(R.id.textView35);
        txt1.setText("Centrale  TEL : 0537724395 ");
        txt2.setText("Ibn Rochd  TEL : 0537690119");
        txt3.setText("Jnane Souissi  TEL : 0537630404");


    }
    public void phcasa(View v){
        TextView txt1= (TextView) findViewById(R.id.textView33);
        TextView txt2= (TextView) findViewById(R.id.textView34);
        TextView txt3= (TextView) findViewById(R.id.textView35);
        txt1.setText("Dalanda  TEL : 0522523561");
        txt2.setText("Hay El Matar  TEL : 0522932026");
        txt3.setText("Riad El Oulfa  TEL : 0522914578");
    }

    public void pop1(View v){
        TextView txt1= (TextView) findViewById(R.id.textView33);
        TextView txt2= (TextView) findViewById(R.id.textView34);
        TextView txt3= (TextView) findViewById(R.id.textView35);
        if ((txt1.getText().toString())=="Centrale  TEL : 0537724395"){
            Intent i = new Intent(this, centrale.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this,"Ce champs sera disponible prochainement",Toast.LENGTH_LONG).show();
        }

    }

    public void pop(View v){
        Toast.makeText(this,"Ce champs sera disponible prochainement",Toast.LENGTH_LONG).show();
    }
/*
    public void trouvergdcasa(View v) {
        TextView mTextView;
        TextView mmTextView;
        TextView mmmTextView;
        mTextView = (TextView) findViewById(R.id.textView33);
        mmTextView = (TextView) findViewById(R.id.textView34);
        mmmTextView = (TextView) findViewById(R.id.textView35);
        mDocRef1.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    String phh1Text = documentSnapshot.getString(PHARMA1_KEY);
                    String phh2Text = documentSnapshot.getString(PHARMA2_KEY);
                    String phh3Text = documentSnapshot.getString(PHARMA3_KEY);
                    mTextView.setText(phh1Text);
                    mmTextView.setText(phh2Text);
                    mmmTextView.setText(phh3Text);

                }

            }
        });
    }

    public void trouvergdraba(View v) {
        TextView mTextView;
        TextView mmTextView;
        TextView mmmTextView;
        mTextView = (TextView) findViewById(R.id.textView33);
        mmTextView = (TextView) findViewById(R.id.textView34);
        mmmTextView = (TextView) findViewById(R.id.textView35);
        mDocRef2.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    String phh1Text = documentSnapshot.getString(PHARMA1_KEY);
                    String phh2Text = documentSnapshot.getString(PHARMA2_KEY);
                    String phh3Text = documentSnapshot.getString(PHARMA3_KEY);
                    mTextView.setText(phh1Text);
                    mmTextView.setText(phh2Text);
                    mmmTextView.setText(phh3Text);

                }

            }
        });
    }
*/
}