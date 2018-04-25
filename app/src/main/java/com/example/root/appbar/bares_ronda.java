package com.example.root.appbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class bares_ronda extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares_ronda);
    final mariscalhoteles hoteles_data [] = new mariscalhoteles[]{

            new mariscalhoteles(R.drawable.anoranza,"Añoranza"),
            new mariscalhoteles(R.drawable.javi,"El Javi"),
            new mariscalhoteles(R.drawable.expreso,"Expreso de la ronda"),
            new mariscalhoteles(R.drawable.murcielago,"Casa del muercielago")


    };
    hoteles_m_adapter adapter = new hoteles_m_adapter(this,R.layout.list_hoteles_mariscal,hoteles_data);
        list = (ListView) findViewById(R.id.lv_bar_r);
        list.setAdapter(adapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView)view.findViewById(R.id.texto_local);

                switch (position){
                    case 0:
                        Intent anoranza = new Intent(bares_ronda.this,bar_anoranza.class);
                        startActivity(anoranza);
                        break;
                }
                switch (position){
                    case 1:
                        Intent absin = new Intent(bares_ronda.this,bar_el_javi.class);
                        startActivity(absin);
                        break;

                }
                switch (position){
                    case 2:
                        Intent eva = new Intent(bares_ronda.this,bar_expreso_ronda.class);
                        startActivity(eva);
                        break;

                }
                switch (position){
                    case 3:
                        Intent murcielago = new Intent(bares_ronda.this,bar_murcielago.class);
                        startActivity(murcielago);
                        break;

                }


                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();



            }

        });

    }
}
