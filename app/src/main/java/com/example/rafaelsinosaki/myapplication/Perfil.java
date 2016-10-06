package com.example.rafaelsinosaki.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Perfil extends AppCompatActivity {

    public Button btnPerfilDados;
    public void init4() {

        btnPerfilDados=(Button)findViewById(R.id.btnPerfilDados);
        btnPerfilDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teste4 = new Intent(Perfil.this,PerfilDados.class);
                startActivity(teste4);

            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        init4();
    }
}
