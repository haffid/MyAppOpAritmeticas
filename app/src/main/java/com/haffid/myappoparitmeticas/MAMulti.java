package com.haffid.myappoparitmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MAMulti extends AppCompatActivity {
    private EditText campo1M, campo2M;
    private TextView resultadoM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamulti);

        campo1M = findViewById(R.id.txtN1M);
        campo2M = findViewById(R.id.txtN2M);
        resultadoM = findViewById(R.id.txtResultadoM);
    }

    private void multiplicar(){
        String num1 = campo1M.getText().toString();
        String num2 = campo2M.getText().toString();
        if(!num1.isEmpty() && !num2.isEmpty()){
            int multi = Integer.parseInt(num1) * Integer.parseInt(num2);
            resultadoM.setText("La multiplicacion es: "+ multi );
        }else{
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show();
        }

    }

    public void multi(View view) {
        if(view.getId()==R.id.btnMulti){
            this.multiplicar();
        }
    }
}