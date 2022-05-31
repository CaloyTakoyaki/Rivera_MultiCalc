package com.example.rivera_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class zAsf2Activity extends AppCompatActivity implements View.OnClickListener{
    Button button4;
    EditText etdistance, ettime2;
    TextView asresult;

    Formulas1 formulas1 = new Formulas1();
    Components components = new Components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zactivity_asf3);

        //Button
        button4 = findViewById(R.id.button4);

        //EditText
        etdistance = findViewById(R.id.etdistance);
        ettime2 = findViewById(R.id.ettime2);

        //TextView
        asresult = findViewById(R.id.asresult);

        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button4:
                components.setMass(Double.parseDouble(etdistance.getText().toString()));
                components.setTime2(Double.parseDouble(ettime2.getText().toString()));
                double answer = formulas1.zAsf2Activity(components.getMass(),components.getAcceleration());
                asresult.setText(""+answer);
                break;
        }

    }
}