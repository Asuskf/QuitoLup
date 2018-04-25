package com.example.root.appbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class hoteles_mariscal extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_mariscal);

        mariscalhoteles hoteles_data [] = new mariscalhoteles[]{

                new mariscalhoteles (R.drawable.discovery,"Discovery Quito" ),
                new mariscalhoteles (R.drawable.plaza,"Hotel plaza")
        };
        hoteles_m_adapter adapter = new hoteles_m_adapter(this,R.layout.list_hoteles_mariscal,hoteles_data);
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView)view.findViewById(R.id.texto_local);

                switch (position){
                    case 0:
                        Intent Discovery = new Intent(hoteles_mariscal.this,fotos_locales.class);
                        startActivity(Discovery);
                    break;

                }
                switch (position){
                    case 1:
                        Intent Plaza = new Intent(hoteles_mariscal.this,hotel_plaza.class);
                        startActivity(Plaza);
                    break;

                }


                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();



            }

        });

    }
}
