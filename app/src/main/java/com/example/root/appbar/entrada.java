package com.example.root.appbar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class entrada extends AppCompatActivity implements View.OnClickListener {

    //Crear botón de entrada
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }
    //Botón para abriri fanpage (facebook)

    public void openfacebook(View imageButton10) throws Exception
        {
            String link = "https://www.facebook.com/Quito-Lup-366401797086253/";
            Intent intent = null;
            intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
            startActivity(intent);
        }
   //Botón para abriri página de la universidad

    public  void openuisrael(View imageButton14) throws  Exception
        {
            String link = "http://uisrael.edu.ec/";
            Intent intent = null;
            intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
            startActivity(intent);
        }

    //Botón para desplegar el perfil del desarrollador

    public  void opendesar(View imageButton15) throws Exception
        {
            String link = "https://www.facebook.com/darkjmk";
            Intent intent = null;
            intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
            startActivity(intent);
        }

    //Enlazar botón de entrada a una nueva actividad

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                Intent inicio = new Intent(entrada.this,Inicio.class);
                startActivity(inicio);


        }
    }
}
