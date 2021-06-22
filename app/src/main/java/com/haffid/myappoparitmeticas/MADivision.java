package com.haffid.myappoparitmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MADivision extends AppCompatActivity {
    private EditText campo1D, campo2D;
    private TextView resultadoD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madivision);

        campo1D = findViewById(R.id.txtN1D);
        campo2D = findViewById(R.id.txtN2D);
        resultadoD = findViewById(R.id.txtResultadoD);
    }

    private void dividir(){
        String num1 = campo1D.getText().toString();
        String num2 = campo2D.getText().toString();
        if(!num1.isEmpty() && !num2.isEmpty()){
            int divi = Integer.parseInt(num1) / Integer.parseInt(num2);
            resultadoD.setText("La division es: "+ divi );
        }else{
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show();
        }
    }

    public void division(View view) {
        if(view.getId()==R.id.btnDivision){
            this.dividir();
        }
    }
}