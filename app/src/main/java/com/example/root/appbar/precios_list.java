package com.example.root.appbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class precios_list extends AppCompatActivity {
    ListView lista_precios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precios_list);

        mariscalprecios precios_data [] = new mariscalprecios[]{

                new mariscalprecios(R.drawable.a,"Michelada","$1,00")


        };
        precios_m_adapter adapter = new precios_m_adapter(this,R.layout.precio_hoteles_mariscal,precios_data);
        lista_precios = (ListView) findViewById(R.id.lv_precios);
        lista_precios.setAdapter(adapter);



        lista_precios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView)view.findViewById(R.id.texto_local);



                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();



            }

        });

    }



    }

