package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class bar_el_javi extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_bar_el_javi_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_el_javi);

        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.michelada,"Micheladas","$3,00"),
                new mariscalprecios(R.drawable.micheladas,"Combo de 3 micheladas ","$7,50"),
                new mariscalprecios(R.drawable.jarra,"Jarra de michelada","$7,00")
        };
        precios_m_adapter listasiete = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_res_el_javi);
        lista_precios.setAdapter(listasiete);

        viewPager = (ViewPager)findViewById(R.id.fotos_res_el_javi);
        adapter = new foto_bar_el_javi_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.el_javi_llegar);
        llegar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.el_javi_llegar:

                Intent siete = new Intent(bar_el_javi.this,llegar_el_javi.class);
                startActivity(siete);

        }

    }


}

