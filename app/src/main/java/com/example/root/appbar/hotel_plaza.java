package com.example.root.appbar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class hotel_plaza extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    foto_plaza_adapter adapter;
    Button llegar;
    ListView lista_precios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_plaza);
        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.habitacion2per,"Cama en habitación compartida de 2","$30,00"),
                new mariscalprecios(R.drawable.habitacion1,"Cama en habitación simple","$15,00")
        };

        precios_m_adapter lista = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lista_hotel_plaza);
        lista_precios.setAdapter(lista);

        viewPager = (ViewPager)findViewById(R.id.fotos_hotel_plaza);
        adapter= new foto_plaza_adapter (this);
        viewPager.setAdapter(adapter);

        llegar = (Button) findViewById(R.id.plaza_llegar);
        llegar.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plaza_llegar:
                Intent plaza = new Intent(hotel_plaza.this,llegar_plaza.class);
                startActivity(plaza);

        }
    }
}
