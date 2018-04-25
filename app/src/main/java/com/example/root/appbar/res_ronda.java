package com.example.root.appbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class res_ronda extends AppCompatActivity {

    ListView lv_ronda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_ronda);
        mariscalhoteles hoteles_data[] = new mariscalhoteles[]{
            new mariscalhoteles(R.drawable.geranios,"Los Geranios"),
            new mariscalhoteles(R.drawable.fogones,"Los fogones de Jasmín"),
            new mariscalhoteles(R.drawable.pozo,"La casa del pozo")

    };

    hoteles_m_adapter adapter = new hoteles_m_adapter(this,R.layout.list_hoteles_mariscal,hoteles_data);
        lv_ronda = (ListView)findViewById(R.id.lv_ronda);
        lv_ronda.setAdapter(adapter);

        lv_ronda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView)view.findViewById(R.id.texto_local);

                switch (position){
                    case 0:
                        Intent Discovery = new Intent(res_ronda.this,res_geranios.class);
                        startActivity(Discovery);
                        break;

                }
                switch (position){
                    case 1:
                        Intent Plaza = new Intent(res_ronda.this,res_fogones.class);
                        startActivity(Plaza);
                        break;

                }
                switch (position){

                    case 2:
                        Intent pozo = new Intent(res_ronda.this,res_pozo.class);
                        startActivity(pozo);
                        break;
                }


                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();



            }

        });


    }


}
