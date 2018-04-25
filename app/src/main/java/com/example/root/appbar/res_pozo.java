package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class res_pozo extends AppCompatActivity implements View.OnClickListener {


    ViewPager viewPager;
    foto_res_pozo_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_pozo);
        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.cuba,"Cuba libre","$5,00"),
                new mariscalprecios(R.drawable.expresso,"Café expresso","$1,50"),
                new mariscalprecios(R.drawable.cafe_americano,"Café americano","$1,00"),
                new mariscalprecios(R.drawable.copa_vino,"Copa de vino","$3,00")
        };
        precios_m_adapter listasiete = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_res_pozo);
        lista_precios.setAdapter(listasiete);

        viewPager = (ViewPager)findViewById(R.id.fotos_res_pozo);
        adapter = new foto_res_pozo_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.pozo_llegar);
        llegar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pozo_llegar:

                Intent siete = new Intent(res_pozo.this,llegar_pozo.class);
                startActivity(siete);

        }

    }
}

