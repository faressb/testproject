package com.pfe.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Inscription extends AppCompatActivity implements View.OnClickListener {
    EditText etNom , etPrenom ,etAge;
    RadioButton etHomme,etFemme;
    Button etInscri ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        etNom = (EditText) findViewById(R.id.etNom);
        etPrenom = (EditText) findViewById(R.id.etPrenom);
        etAge = (EditText) findViewById(R.id.etAge);
        etHomme = (RadioButton) findViewById(R.id.etHomme);
        etFemme = (RadioButton) findViewById(R.id.etFemme);
        etInscri = (Button) findViewById(R.id.etInscri);


        etInscri.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


    }
}


