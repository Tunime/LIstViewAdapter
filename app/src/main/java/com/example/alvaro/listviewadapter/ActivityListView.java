package com.example.alvaro.listviewadapter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ActivityListView extends ActionBarActivity {

    ListView lista;
    ArrayAdapter<String>adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] cosasPorHacer = new String[] { "Aprender a programar en Android",
                "Hacer una aplicación famosa","Vender la aplicación","Esperar a que llegue el dinero"};

        lista=(ListView)findViewById(R.id.lista);
        adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cosasPorHacer);
        lista.setAdapter(adaptador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
