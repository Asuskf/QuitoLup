package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class fotos_locales extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_m_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos_locales);
        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.habitacion6,"Cama en habitación compartida de 6","$12,00"),
                new mariscalprecios(R.drawable.habitacion6per,"Cama en habitación compartida de 8","$12,00"),
                new mariscalprecios(R.drawable.habitacion1,"Habitación sencilla para 1 persona","$28,00"),
                new mariscalprecios(R.drawable.habitacion1per,"Habitación doble para 2 persona","$36,00"),

        };

        precios_m_adapter lista = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista);
        lista_precios.setAdapter(lista);


        viewPager = (ViewPager)findViewById(R.id.fotos_locales);
        adapter= new foto_m_adapter(this);
        viewPager.setAdapter(adapter);




        llegar = (Button) findViewById(R.id.discovery_llegar);
        llegar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.discovery_llegar:
                Intent mapa = new Intent(fotos_locales.this,llegar_discovery.class);
                startActivity(mapa);


        }
    }
}
