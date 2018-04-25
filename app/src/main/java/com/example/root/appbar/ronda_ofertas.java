package com.example.root.appbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ronda_ofertas extends AppCompatActivity implements View.OnClickListener {

    Button comollegar_btn;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ronda_ofertas);

        comollegar_btn = (Button) findViewById(R.id.comollegar_ronda);
        comollegar_btn.setOnClickListener(this);

        mariscalhoteles mariscal[] = new mariscalhoteles[]{

                new mariscalhoteles(R.drawable.cafeteria, "Restaurantes y cafeterías"),
                new mariscalhoteles(R.drawable.bar, "Bares y Discotecas"),
        };



        hoteles_m_adapter adapter = new hoteles_m_adapter(this, R.layout.list_hoteles_mariscal, mariscal);
        listview = (ListView) findViewById(R.id.listaR);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView v = (TextView)view.findViewById(R.id.texto_local);

            switch (position){
                case 0:
                    Intent restaurantes_mariscal = new Intent(ronda_ofertas.this,res_ronda.class);
                    startActivity(restaurantes_mariscal);
                    break;

            }
            switch (position){
                case 1:
                    Intent bares = new Intent(ronda_ofertas.this,bares_ronda.class);
                    startActivity(bares);

            }

            Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();

        }

    });


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.comollegar_ronda:
            Intent ronda = new Intent(ronda_ofertas.this,llegar_ronda.class);
            startActivity(ronda);
            break;
        }
    }
}