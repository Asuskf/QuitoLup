package com.example.root.appbar;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by root on 31/01/17.
 */

public class precios_m_adapter extends ArrayAdapter<mariscalprecios> {


    Context context;
    int layautResourceId;
    mariscalprecios data[] = null;

    public precios_m_adapter(Context context, int layautResourceId, mariscalprecios[] data) {
        super(context, layautResourceId, data);

        this.context = context;
        this.layautResourceId = layautResourceId;
        this.data = data;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        Preciosholder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layautResourceId, parent, false);

            holder = new Preciosholder();
            holder.imagen = (ImageView) row.findViewById(R.id.foto_local);
            holder.texto = (TextView) row.findViewById(R.id.texto_local);
            holder.precio = (TextView) row.findViewById(R.id.precios);
            row.setTag(holder);
        } else {
            holder = (Preciosholder) row.getTag();
        }

        mariscalprecios mariscalprecios = data[position];
        holder.texto.setText(mariscalprecios.title);
        holder.imagen.setImageResource(mariscalprecios.icon);
        holder.precio.setText(mariscalprecios.money);




        return row;
    }

    static class Preciosholder {
        ImageView imagen;
        TextView texto;
        TextView precio;


    }
}

