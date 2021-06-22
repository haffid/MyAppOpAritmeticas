package com.haffid.myappoparitmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsar(View view) {
        Intent intent = null;
        if (view.getId() == R.id.btnSuma) {
            intent = new Intent(this, MASuma.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnResta) {
            intent = new Intent(this, MAResta.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnMulti) {
            intent = new Intent(this, MAMulti.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnDivision) {
            intent = new Intent(this, MADivision.class);
            startActivity(intent);
        }
    }
}