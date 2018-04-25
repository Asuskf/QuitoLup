package com.example.root.appbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class bares_mariscal extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_mariscal);
    final mariscalhoteles hoteles_data [] = new mariscalhoteles[]{

            new mariscalhoteles(R.drawable.space,"Space Entertaiment"),
            new mariscalhoteles(R.drawable.absin,"Absin the"),
            new mariscalhoteles(R.drawable.eva,"La casa de Eva")


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
                        Intent space = new Intent(bares_mariscal.this,bar_space_entertaiment.class);
                        startActivity(space);
                        break;
                }
                switch (position){
                    case 1:
                        Intent absin = new Intent(bares_mariscal.this,bar_absin_the.class);
                        startActivity(absin);
                        break;

                }
                switch (position){
                    case 2:
                        Intent eva = new Intent(bares_mariscal.this,bar_casa_eva.class);
                        startActivity(eva);
                        break;

                }


                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();



            }

        });

    }
}
