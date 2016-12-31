package com.android.gilmeran.gridlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private  List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        //datos a mostrar
        names = new ArrayList<String>();
        names.add("Putin");
        names.add("Alejandro");
        names.add("Diego");
        names.add("Pedro");
        names.add("Wachin");
        names.add("anthony");

        //adaptador, la forma visual en q mostraremos nuestros datos
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        //enlazamos el adaptador con nuestra listView
      //  listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked:"+names.get(position),Toast.LENGTH_SHORT).show();
                }
            });
        //enlazamos con nuestro adaptador personalizado
        MyAdapter myAdapter =new MyAdapter(this,R.layout.list_item,names);
        listView.setAdapter(myAdapter);
    }
}

