package com.example.root.appbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class restaurante_mariscal extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_mariscal);
    final mariscalhoteles hoteles_data [] = new mariscalhoteles[]{

            new mariscalhoteles(R.drawable.sietechiles,"Siete chiles - Comida Mexicana"),
            new mariscalhoteles(R.drawable.lapepa,"La Pepa"),
            new mariscalhoteles(R.drawable.rockyourdogs,"Rock Your Dogs"),
            new mariscalhoteles(R.drawable.flora,"Flora"),
            new mariscalhoteles(R.drawable.burgerclan1,"Burger Clan")


    };
    hoteles_m_adapter adapter = new hoteles_m_adapter(this,R.layout.list_hoteles_mariscal,hoteles_data);
        list = (ListView) findViewById(R.id.lv_res_mar);
        list.setAdapter(adapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView)view.findViewById(R.id.texto_local);

                switch (position){
                    case 0:
                        Intent siete = new Intent(restaurante_mariscal.this,siete_chiles_res.class);
                        startActivity(siete);
                        break;
                }
                switch (position){
                    case 1:
                        Intent pepa = new Intent(restaurante_mariscal.this,res_la_pepa.class);
                        startActivity(pepa);
                        break;
                }
                switch (position){
                    case 2:
                        Intent dogs = new Intent(restaurante_mariscal.this,rock_your_dogs.class);
                        startActivity(dogs);

                }
                switch (position){
                    case 3:
                        Intent flora = new Intent(restaurante_mariscal.this,res_flora.class);
                        startActivity(flora);
                        break;

                }
                switch (position){
                    case 4:
                        Intent clan = new Intent(restaurante_mariscal.this,res_burguer_clan.class);
                        startActivity(clan);
                        break;
                }



                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();



            }

        });

    }
}
