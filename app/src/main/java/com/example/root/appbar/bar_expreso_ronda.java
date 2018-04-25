package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class bar_expreso_ronda extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_bar_expreso_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_expreso_ronda);

        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.canelazo,"Jarra de canelazo","$12,00"),
                new mariscalprecios(R.drawable.michelada,"Micheladas ","$3,50"),
                new mariscalprecios(R.drawable.cuba,"Cuba libre","$5,00"),
                new mariscalprecios(R.drawable.vino_hervido,"Jarra de vino hervido","$15,00")
        };
        precios_m_adapter listasiete = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_bar_expreso);
        lista_precios.setAdapter(listasiete);

        viewPager = (ViewPager)findViewById(R.id.fotos_bar_expreso_ronda);
        adapter = new foto_bar_expreso_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.expreso_llegar);
        llegar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.expreso_llegar:

                Intent siete = new Intent(bar_expreso_ronda.this,llegar_expreso.class);
                startActivity(siete);

        }

    }
}
