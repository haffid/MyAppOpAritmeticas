package com.haffid.myappoparitmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MASuma extends AppCompatActivity {
    private EditText campo1s, campo2s;
    private TextView resultados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuma);

        campo1s = findViewById(R.id.txtN1S);
        campo2s = findViewById(R.id.txtN2S);
        resultados = findViewById(R.id.txtResultadoS);
    }

    private void sumarn() {
        String num1 = campo1s.getText().toString();
        String num2 = campo2s.getText().toString();
        if (!num1.isEmpty() && !num2.isEmpty()) {
            int sumas = Integer.parseInt(num1) + Integer.parseInt(num2);
            resultados.setText("La suma es: " + sumas);
        } else {
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show();
        }

    }


    public void pulsars(View view) {
        if (view.getId() == R.id.btnSumar) {
            this.sumarn();
        }
    }
}


