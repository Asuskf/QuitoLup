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

public class hoteles_m_adapter extends ArrayAdapter<mariscalhoteles> {


    Context context;
    int layautResourceId;
    mariscalhoteles data[] = null;

    public hoteles_m_adapter(Context context, int layautResourceId, mariscalhoteles[] data) {
        super(context, layautResourceId, data);

        this.context = context;
        this.layautResourceId = layautResourceId;
        this.data = data;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        Mariscalholder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layautResourceId, parent, false);

            holder = new Mariscalholder();
            holder.imagen = (ImageView) row.findViewById(R.id.foto_local);
            holder.texto = (TextView) row.findViewById(R.id.texto_local);
            row.setTag(holder);
        } else {
            holder = (Mariscalholder) row.getTag();
        }

        mariscalhoteles mariscalhoteles = data[position];
        holder.texto.setText(mariscalhoteles.title);
        holder.imagen.setImageResource(mariscalhoteles.icon);


        return row;
    }

    static class Mariscalholder {
        ImageView imagen;
        TextView texto;


    }
}

