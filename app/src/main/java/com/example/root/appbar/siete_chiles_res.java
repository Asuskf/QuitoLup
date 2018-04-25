package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class siete_chiles_res extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_res_siete_adapter adapter;
    Button llegar;
    ListView lista_precios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siete_chiles_res);

        mariscalprecios precios_data [] = new mariscalprecios[]{

             new mariscalprecios(R.drawable.sietechiles_nachos,"Nachos de la casa","$1,75"),
                new mariscalprecios(R.drawable.sietechiles_chilaquiles,"Chilauines de carne","$3,00"),
                new mariscalprecios(R.drawable.sietechiles_burritos,"Burrito de carne","$2,50"),
                new mariscalprecios(R.drawable.sietechiles_quesadilla,"Quesadilla de pollo","$3,00")
        };
        precios_m_adapter listasiete = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_res_siete);
        lista_precios.setAdapter(listasiete);

        viewPager = (ViewPager)findViewById(R.id.fotos_res_siete);
        adapter = new foto_res_siete_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.siete_llegar);
        llegar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.siete_llegar:

                Intent siete = new Intent(siete_chiles_res.this,llegar_siete.class);
                startActivity(siete);

        }

    }
}
