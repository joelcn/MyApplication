package com.example.rafaelsinosaki.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class PerfilDados extends AppCompatActivity {

    public String nome;
    public String idade;
    public String servico;
    public String valor;
    public Button btnSalvar;
    public EditText editText3;
    public EditText editText4;
    public EditText editText5;
    public EditText editText6;
    //private Todo todo;

    public void init4() {

        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome = editText3.getText().toString();
                idade = editText4.getText().toString();
                servico = editText5.getText().toString();
                valor = editText6.getText().toString();
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_dados);
        Historico a = new Historico();
        init4();
    }


}
