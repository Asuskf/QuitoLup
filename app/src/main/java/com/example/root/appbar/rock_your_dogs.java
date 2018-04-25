package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class rock_your_dogs extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_res_dogs_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_your_dogs);

        mariscalprecios preciso_data [] = new mariscalprecios[]{
                new mariscalprecios(R.drawable.queen,"Queen","$3,50"),
                new mariscalprecios(R.drawable.ramones,"Ramones","$3,50"),
                new mariscalprecios(R.drawable.nirvana,"Nirvana","$3,50"),
                new mariscalprecios(R.drawable.beatles,"Beatles","$3,50")
        };

        precios_m_adapter lista = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,preciso_data);
        lista_precios = (ListView) findViewById(R.id.lista_res_dogs);
        lista_precios.setAdapter(lista);

        viewPager = (ViewPager)findViewById(R.id.fotos_res_dogs);
        adapter = new foto_res_dogs_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button)findViewById(R.id.dogs_llegar);
        llegar.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dogs_llegar:
                Intent dogs = new Intent(rock_your_dogs.this,llegar_dogs.class);
                startActivity(dogs);

        }
    }
}
