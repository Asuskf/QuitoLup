package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class res_fogones extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_res_fogones_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_fogones);

        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.plancha,"Camarones a la plancha","$10,00"),
                new mariscalprecios(R.drawable.apanados,"Camarones apanados","$10,00"),
                new mariscalprecios(R.drawable.jugos_naturales,"Jugo Natural","$1,50"),
                new mariscalprecios(R.drawable.batido,"Batido","$1,50")
        };
        precios_m_adapter listasiete = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_res_fogones);
        lista_precios.setAdapter(listasiete);

        viewPager = (ViewPager)findViewById(R.id.fotos_res_fogones);
        adapter = new foto_res_fogones_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.fogones_llegar);
        llegar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fogones_llegar:

                Intent siete = new Intent(res_fogones.this,llegar_fogones.class);
                startActivity(siete);

        }

    }
}

