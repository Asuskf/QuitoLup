package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class res_geranios extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_res_geranios_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_geranios);

        mariscalprecios prescios_data[] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.jugos_naturales,"Jugos Naturales","$2,54"),
                new mariscalprecios(R.drawable.llapingachos,"LLapingacho con fritada","$13,13"),
                new mariscalprecios(R.drawable.cuy,"Cuy los Geranios","$34,35"),
                new mariscalprecios(R.drawable.trucha,"Trucha","$18,22")

        };
        precios_m_adapter preciosgranios = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,prescios_data);
        lista_precios = (ListView)findViewById(R.id.lista_res_geranios);
        lista_precios.setAdapter(preciosgranios);

        viewPager = (ViewPager)findViewById(R.id.fotos_res_geranios);
        adapter = new foto_res_geranios_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button)findViewById(R.id.geranios_llegar);
        llegar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.geranios_llegar:
                Intent geranios = new Intent(res_geranios.this,llegar_geranios.class);
                startActivity(geranios);


        }
    }
}
