package com.example.rivera_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WFactivity extends AppCompatActivity implements View.OnClickListener{
    Button button1;
    EditText etmass, etacc;
    TextView wresult;

    Formulas1 formulas1 = new Formulas1();
    Components components = new Components();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wf2);

        //Button
        button1 = findViewById(R.id.button1);

        //EditText
        etmass = findViewById(R.id.etmass);
        etacc = findViewById(R.id.etacc);

        //Textview
        wresult = findViewById(R.id.wresult);

        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                components.setMass(Double.parseDouble(etmass.getText().toString()));
                components.setAcceleration(Double.parseDouble(etacc.getText().toString()));
                double answer = formulas1.WFactivity(components.getMass(),components.getAcceleration());
                wresult.setText(""+answer);
                break;

    }
}}