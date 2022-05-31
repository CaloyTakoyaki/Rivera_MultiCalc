package com.example.rivera_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button wf, pf, prf, asf;
    private Object WFactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons
        wf = findViewById(R.id.wf);
        pf = findViewById(R.id.pf);
        prf = findViewById(R.id.prf);
        asf = findViewById(R.id.asf);

        //Clicks
        wf.setOnClickListener(this);
        pf.setOnClickListener(this);
        prf.setOnClickListener(this);
        asf.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.wf:
                Intent intent=new Intent(MainActivity.this,WFactivity.class);
                startActivity(intent);
                break;

            case  R.id.pf:
                Intent intent1=new Intent(MainActivity.this,Pf2Activity.class);
                startActivity(intent1);
                break;

            case R.id.prf:
                Intent intent2=new Intent(MainActivity.this,Prf2Activity.class);
                startActivity(intent2);
                break;

            case R.id.asf:
                Intent intent3=new Intent(MainActivity.this,zAsf2Activity.class);
                startActivity(intent3);
                break;
        }

    }
}