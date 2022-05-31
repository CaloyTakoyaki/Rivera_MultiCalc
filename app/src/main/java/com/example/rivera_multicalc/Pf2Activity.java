package com.example.rivera_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pf2Activity extends AppCompatActivity implements View.OnClickListener{
    Button button2;
    EditText etwork, ettime;
    TextView presult;

    Formulas1 formulas1 = new Formulas1();
    Components components = new Components();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pf2);

        //Button
        button2 = findViewById(R.id.button2);

        //EditText
        etwork = findViewById(R.id.etwork);
        ettime = findViewById(R.id.ettime);

        //TextView
        presult = findViewById((R.id.presult));

        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
            components.setWork(Double.parseDouble((etwork.getText().toString())));
            components.setAcceleration(Double.parseDouble((ettime.getText().toString())));
            double asnwer = formulas1.Pf2Activity(components.getWork(),components.getTime());
            presult.setText(""+asnwer);
            break;


    }
}}