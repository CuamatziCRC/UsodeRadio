package com.example.cuamatzi.usoderadio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.ET1);
        et2=(EditText)findViewById(R.id.ET2);
        tv1=(TextView) findViewById(R.id.TVResultado);
        r1=(RadioButton)findViewById(R.id.Bsuma);
        r2=(RadioButton)findViewById(R.id.Bresta);
    }

    public void Calcular(View view){
        String VS1 = et1.getText().toString();
        String VS2 = et2.getText().toString();

        int VI1 = Integer.parseInt(VS1);
        int VI2 = Integer.parseInt(VS2);

        if (r1.isChecked() == true){
            int suma = VI1 + VI2;
            String RS = String.valueOf(suma);
            tv1.setText(RS);
        }else if (r2.isChecked() == true){
            int resta = VI1 - VI2;
            String RR = String.valueOf(resta);
            tv1.setText(RR);
        }
    }
}
