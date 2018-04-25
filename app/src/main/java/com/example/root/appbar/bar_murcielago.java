package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class bar_murcielago extends AppCompatActivity  implements View.OnClickListener{
    ViewPager viewPager;
    foto_bar_murcielago_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_murcielago);

        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.pollo,"Sanduche de pollo ","$4,10"),
                new mariscalprecios(R.drawable.chocolate,"Chocolate con queso","$2,40"),
                new mariscalprecios(R.drawable.chivo,"Seco de chivo","$8,20"),
                new mariscalprecios(R.drawable.yapingacho,"Llapingacho","$8,40")
        };
        precios_m_adapter listasiete = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_bar_murcielago);
        lista_precios.setAdapter(listasiete);

        viewPager = (ViewPager)findViewById(R.id.fotos_bar_murcielago);
        adapter = new foto_bar_murcielago_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.murcielago_llegar);
        llegar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.murcielago_llegar:

                Intent siete = new Intent(bar_murcielago.this,llegar_murcielago.class);
                startActivity(siete);

        }


    }
}
