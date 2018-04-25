package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class res_la_pepa extends AppCompatActivity implements View.OnClickListener {
    ViewPager viewPager;
    foto_res_pepa_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_la_pepa);

        mariscalprecios precios_pepa[] = new mariscalprecios[]{
                new mariscalprecios(R.drawable.almuerzos, "Aluerzos", "$2,75"),
                new mariscalprecios(R.drawable.tigrillo, "Tigrillo", "$1,50"),
                new mariscalprecios(R.drawable.micheladas, "Michelada", "$1,00")
        };
        precios_m_adapter lista = new precios_m_adapter(this, R.layout.precio_hoteles_mariscal, precios_pepa);
        lista_precios = (ListView) findViewById(R.id.lista_res_pepa);
        lista_precios.setAdapter(lista);

        viewPager = (ViewPager)findViewById(R.id.fotos_res_pepa);
        adapter = new  foto_res_pepa_adapter(this);
        viewPager.setAdapter(adapter);

        llegar= (Button) findViewById(R.id.pepa_llegar);
        llegar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pepa_llegar:
                Intent pepa= new Intent(res_la_pepa.this,llegar_pepa.class);
                startActivity(pepa);

        }
    }

}

