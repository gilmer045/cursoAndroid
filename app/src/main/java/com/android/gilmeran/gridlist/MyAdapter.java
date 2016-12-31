package com.android.gilmeran.gridlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

//creando mi adaptador
 public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String>names;


    public MyAdapter(Context context, int layout, List<String> names) {
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup ViewGroup) {
        //copiamos la vista
        View v= convertView;

        //inflamos la vista q nos a llegado con nuestro layout
        LayoutInflater layoutInflater=LayoutInflater.from(this.context);
        v=layoutInflater.inflate(R.layout.list_item, null);
    //rellenamos con nuestros datos
        String currentName= names.get(position);
       // currentName=(String)getItem(position);
        // referenciamos el elemento a modificar y lo rellenamos
        TextView textView=(TextView)v.findViewById(R.id.textView);
        textView.setText(currentName);

        //devolvemos la vista inflada y nomdificada denuestros datos
        return v;
    }
}
