package com.example.root.appbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    ImageButton Mariscalbtn;
    ImageButton Rondabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Mariscalbtn = (ImageButton) findViewById(R.id.Mariscalbtn);
        Mariscalbtn.setOnClickListener(this);

        Rondabtn = (ImageButton) findViewById(R.id.Rondabtn);
        Rondabtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Mariscalbtn:
                Intent mariscal = new Intent(Inicio.this,MainActivity.class);
                startActivity(mariscal);
                break;
        }
        switch (v.getId()){
            case R.id.Rondabtn:
                Intent ronda = new Intent(Inicio.this,ronda_ofertas.class);
                startActivity(ronda);
                break;

        }

    }
}

