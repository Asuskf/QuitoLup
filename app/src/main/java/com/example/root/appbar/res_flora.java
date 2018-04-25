package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class res_flora extends AppCompatActivity implements View.OnClickListener {
    ViewPager viewPager;
    foto_res_flora_adapter adapter;
    Button llegar;
    ListView lista_precios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_flora);

        mariscalprecios precios_data[] = new mariscalprecios[]{
                new mariscalprecios(R.drawable.bestial,"Burrito bestial","$3,00"),
                new mariscalprecios(R.drawable.magia,"Magia vegana","$4,00"),
                new mariscalprecios(R.drawable.tha,"Burrito coco tha","$3,75"),
                new mariscalprecios(R.drawable.tropicana,"Burrito tropicana","$3,50")
        };

        precios_m_adapter flora = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_res_flora);
        lista_precios.setAdapter(flora);

        viewPager = (ViewPager) findViewById(R.id.fotos_res_flora);
        adapter = new foto_res_flora_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button)findViewById(R.id.flora_llegar);
        llegar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.flora_llegar:
                Intent flora = new Intent(res_flora.this,llegar_flora.class);
                startActivity(flora);

        }
    }
}
