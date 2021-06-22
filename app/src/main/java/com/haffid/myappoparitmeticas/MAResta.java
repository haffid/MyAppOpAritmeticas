package com.haffid.myappoparitmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MAResta extends AppCompatActivity {
    private EditText campo1R, campo2R;
    private TextView resultadoR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maresta);

        campo1R = findViewById(R.id.txtN1R);
        campo2R = findViewById(R.id.txtN2R);
        resultadoR = findViewById(R.id.txtResultadoR);
    }

    private void restarn(){
        String num1 = campo1R.getText().toString();
        String num2 = campo2R.getText().toString();
        if(!num1.isEmpty() && !num2.isEmpty()){
            int resta = Integer.parseInt(num1) - Integer.parseInt(num2);
            resultadoR.setText("La resta es: "+resta );
        }else{
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show();
        }

    }

    public void restar(View view) {
        if(view.getId()==R.id.btnRestar){
            this.restarn();
        }
    }
}