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
        Toast.makeText(this, "oncreate", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        Bundle bundle = getIntent().getExtras();
        Adaptador adaptador=(Adaptador) bundle.getSerializable("adaptador");
        lv.setAdapter(adaptador);/**/







        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
         Jugador    jugador=(Jugador) adapterView.getAdapter().getItem(i);
                Toast.makeText(MainActivity.this,getResources().getString(R.string.stMensajeID) + jugador.getId(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        /*Bundle bundle = getIntent().getExtras();
        Jugador jugador;
        if(bundle != null){
            jugador = (Jugador) bundle.getSerializable("jugador" );
            Jugador llenajugador = new Jugador(jugador.getId(), jugador.getNombre(), jugador.getEquipo(), jugador.getNumPlayera());
            //datos.add(llenajugador);


            }

            Adaptador adaptador = new Adaptador(this, datos );
            lv.setAdapter(adaptador);
  */



    }

    @Override
    protected void onResume() {
        super.onResume();
        /*Toast.makeText(this, "onresume", Toast.LENGTH_SHORT).show();
            Adaptador adaptador = new Adaptador(this, datosaux);
               lv.setAdapter(adaptador);*/
    }

    @Override
    protected void onRestart() {
        super.onRestart();

            /*Adaptador adaptador = new Adaptador(this, datos);
               lv.setAdapter(adaptador);*/

        Toast.makeText(this, "onrestart", Toast.LENGTH_SHORT).show();
    }

    public void clic(View view) {

    }

    public void clic2(View view) {
    }
}