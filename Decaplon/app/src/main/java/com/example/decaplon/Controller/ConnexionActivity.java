package com.example.decaplon.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.decaplon.R;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

public class ConnexionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion_layout);
        TextView identifiant = findViewById(R.id.identifiant);
        final EditText identifiantValue = findViewById(R.id.identifiantValue);
        TextView password = findViewById(R.id.password);
        final EditText passwordValue = findViewById(R.id.passwordValue);
        Button connexionBouton = findViewById(R.id.connexionBouton);
        identifiant.setText(R.string.identifiant);
        password.setText(R.string.password);
        connexionBouton.setText(R.string.connexionBouton);

        connexionBouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(identifiantValue.getText().equals("admin") && passwordValue.getText().equals("admin")){
                    Intent switchPage = new Intent(ConnexionActivity.this,ItemListActivity.class);
                    startActivity(switchPage);
                }
                else{
                    Snackbar.make(view, "Identifiant ou Mot de Passe incorrect. Veuillez ré-essayez.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
    }
}
