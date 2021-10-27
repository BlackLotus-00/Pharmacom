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

public class centrale extends AppCompatActivity {
    private DocumentReference mDocRef2 = FirebaseFirestore.getInstance().document("favoris/pharmacies");

    public static final String PHARMA_KEY = "ph1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centrale);
    }
    public void mainbut(View v){
        Intent i = new Intent(this, centralmap.class);
        startActivity(i);

    }
    public void savefav(View view) {



        Map<String, Object> dataToSave = new HashMap<String, Object>();
        dataToSave.put(PHARMA_KEY, "Pharmacie Centrale");

        mDocRef2.set(dataToSave).addOnSuccessListener(new OnSuccessListener<Void>() {
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