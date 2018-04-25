package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class bar_casa_eva extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_bar_eva_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_casa_eva);

        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.cuba,"Cuba Libre","$4,00"),
                new mariscalprecios(R.drawable.antioqueno,"Antioqueño","$30,00"),
                new mariscalprecios(R.drawable.charro_silver,"Charro","$50,00"),
                new mariscalprecios(R.drawable.black,"Black Russian","$3,00"),
                new mariscalprecios(R.drawable.toro,"Toro bravo","$5,00")
        };

        precios_m_adapter listasiete = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_bar_eva);
        lista_precios.setAdapter(listasiete);

        viewPager = (ViewPager)findViewById(R.id.fotos_bar_eva);
        adapter = new foto_bar_eva_adapter(this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.eva_llegar);
        llegar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.eva_llegar:
                Intent eva = new Intent(bar_casa_eva.this,llegar_eva.class);
                startActivity(eva);

        }
    }
}
