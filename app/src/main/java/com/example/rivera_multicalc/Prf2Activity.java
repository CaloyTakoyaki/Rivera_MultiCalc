package com.example.rivera_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prf2Activity extends AppCompatActivity implements View.OnClickListener{
    Button button3;
    EditText etforce, ettotal;
    TextView prsrresult;

    Formulas1 formulas1 = new Formulas1();
    Components components = new Components();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prf2);

        //Button
        button3 = findViewById(R.id.button3);

        //EditText
        etforce = findViewById(R.id.etforce);
        ettotal = findViewById(R.id.ettotal);

        //TextView
        prsrresult = findViewById(R.id.prsresult);

        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button3:
                components.setForce(Double.parseDouble(etforce.getText().toString()));
                components.setAcceleration(Double.parseDouble(ettotal.getText().toString()));
                double asnwer = formulas1.Prf2Activity(components.getForce(), components.getTotal());
                prsrresult.setText(""+asnwer);
                break;

    }
}}