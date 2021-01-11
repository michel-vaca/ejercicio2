package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ejercicio2.model.Jugador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Jugador> datos= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Toast.makeText(this, "oncreate", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
       Bundle bundle = getIntent().getExtras();
       if(bundle!=null) {
            Adaptador adaptador = (Adaptador) bundle.getSerializable("adaptador");
            lv.setAdapter(adaptador);/**/
        }






        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
         Jugador    jugador=(Jugador) adapterView.getAdapter().getItem(i);
                Toast.makeText(MainActivity.this,getResources().getString(R.string.stMensajeID) + jugador.getId(), Toast.LENGTH_SHORT).show();
            }
        }
        );


    }



}