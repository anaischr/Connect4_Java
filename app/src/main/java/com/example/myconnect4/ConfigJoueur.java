package com.example.myconnect4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ConfigJoueur extends AppCompatActivity {

    private EditText joueur1;
    private EditText joueur2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_joueur);

        joueur1 = findViewById(R.id.nomJoueur1);
        joueur2 = findViewById(R.id.nomJoueur2);
    }

    public void submitButtonOnClick (View view){
        String nomJoueur1 = joueur1.getText().toString();
        String nomJoueur2 = joueur2.getText().toString();

        Intent intent = new Intent(this,Affichage_jeu.class);
        intent.putExtra("NOMS_JOUEURS", new String[]{nomJoueur1,nomJoueur2});
        startActivity(intent);

    }
}