package com.example.rafaelsinosaki.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    public Button btnServicos;
    public Button btnPerfil;
    public Button btnHistorico;

    public void init3() {

        btnHistorico=(Button)findViewById(R.id.btnHistorico);
        btnHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teste3 = new Intent(MainActivity.this,Historico.class);

                startActivity(teste3);

            }
        });

    }


    public void init2() {

        btnPerfil=(Button)findViewById(R.id.btnPerfil);
        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teste2 = new Intent(MainActivity.this,Perfil.class);

                startActivity(teste2);

            }
        });

    }


    public void init() {

        btnServicos=(Button)findViewById(R.id.btnServicos);
        btnServicos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent teste = new Intent(MainActivity.this,Servicos.class);

            startActivity(teste);

        }
    });

}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init2();
        init3();
    }
}
