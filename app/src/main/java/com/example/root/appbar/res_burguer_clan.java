package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class res_burguer_clan extends AppCompatActivity  implements View.OnClickListener {
    ViewPager viewPager;
    foto_res_clan_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burguer_clan);
        mariscalprecios precios_data[] = new mariscalprecios[]{
                new mariscalprecios(R.drawable.alitas6,"6 Alitas BBQ","$5,75"),
                new mariscalprecios(R.drawable.alitas12,"12 Alitas BBQ","$10,50"),
                new mariscalprecios(R.drawable.espanola,"Hamburguesa Española","$3,50"),
                new mariscalprecios(R.drawable.italiana,"Hamburguesa Italiana","$3,50"),
                new mariscalprecios(R.drawable.italiana,"jaksdksja","askjldaskldjas")
        };

        precios_m_adapter lista = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_res_clan);
        lista_precios.setAdapter(lista);

        viewPager = (ViewPager)findViewById(R.id.fotos_res_clan);
        adapter = new foto_res_clan_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.clan_llegar);
        llegar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.clan_llegar:
                Intent clan = new Intent(res_burguer_clan.this,llegar_clan.class);
                startActivity(clan);


        }

    }
}
