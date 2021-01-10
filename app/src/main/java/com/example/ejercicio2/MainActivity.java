package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.ejercicio2.model.Jugador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Jugador> datos= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        Bundle bundle = getIntent().getExtras();
        Jugador jugador;
        if(bundle != null){
            jugador = (Jugador) bundle.getSerializable("jugador" );
            Jugador llenajugador = new Jugador(1238, jugador.getNombre(), jugador.getEquipo(), jugador.getNumPlayera());
            datos.add(llenajugador);



        }


       Adaptador adaptador = new Adaptador(this, datos );
       lv.setAdapter(adaptador);

    }



}