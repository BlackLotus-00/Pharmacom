package com.example.pharma;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class abilify extends AppCompatActivity {
    private DocumentReference mDocRef1 = FirebaseFirestore.getInstance().document("favoris/medicaments");


    public static final String MEDICA_KEY = "medica1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abilifyc);
    }
    public void mainy(View v){
        Intent i = new Intent(this, ocetc.class);
        startActivity(i);
    }
    public void phar(View v){
        Intent a = new Intent(this, ibertinc.class);
        a.putExtra("abili","ABILIFY 10 MG, Comprimé");
        startActivity(a);
    }

    public void savefav(View view) {

        Map<String, Object> dataToSave = new HashMap<String, Object>();
        dataToSave.put(MEDICA_KEY, "ABILIFY 10 MG, Comprimé");

        mDocRef1.set(dataToSave).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("msg", "favoris sauvegardé");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("msg", "favoris n'est pas sauvegardé!", e);
            }
        });
    }
}