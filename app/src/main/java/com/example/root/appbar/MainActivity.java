package com.example.root.appbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button comollegar_btn;
    ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comollegar_btn = (Button) findViewById(R.id.comollegar_btn);
        comollegar_btn.setOnClickListener(this);

        mariscalhoteles mariscal [] = new mariscalhoteles[]{

                new mariscalhoteles (R.drawable.hotel,"Hoteles " ),
                new mariscalhoteles (R.drawable.cafeteria,"Restaurantes y cafeterías"),
                new mariscalhoteles (R.drawable.bar,"Bares y Discotecas"),
        };
        hoteles_m_adapter adapter = new hoteles_m_adapter(this,R.layout.list_hoteles_mariscal,mariscal);
        listview = (ListView) findViewById(R.id.lista);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView)view.findViewById(R.id.texto_local);
                switch (position){
                    case 0:
                        Intent hoteles_mariscal = new Intent(MainActivity.this,hoteles_mariscal.class);
                        startActivity(hoteles_mariscal);
                        break;
                }

                switch (position){
                    case 1:
                        Intent restaurantes_mariscal = new Intent(MainActivity.this,restaurante_mariscal.class);
                        startActivity(restaurantes_mariscal);
                        break;

                }
                switch (position){
                    case 2:
                        Intent bares = new Intent(MainActivity.this,bares_mariscal.class);
                        startActivity(bares);

                }

                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();

            }

        });



    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.comollegar_btn:
                Intent llegar = new Intent(MainActivity.this,llegar_mariscal.class);
                startActivity(llegar);
                break;

        }

    }
}
