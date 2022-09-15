package com.example.myconnect4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Affichage_jeu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.affichage_jeu);
    }

    public void rejouerBtnOnClick(){

    }

    public void accueilBtnOnclik(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}