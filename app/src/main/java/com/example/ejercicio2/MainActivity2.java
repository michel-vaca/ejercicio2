package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ejercicio2.model.Jugador;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    Jugador jugador;
    EditText etNombre,etNumPlayera;
    Spinner spnEquipo;
    ArrayList<Jugador> datos= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etNombre=findViewById(R.id.etNombre);
        etNumPlayera=findViewById(R.id.etNumPlayera);
        spnEquipo=findViewById(R.id.spnEquipo);

        String [] equipos ={"",getResources().getString(R.string.stAmerica),getResources().getString(R.string.stAtlas),getResources().getString(R.string.stChivas),
                getResources().getString(R.string.stCruzAzul),getResources().getString(R.string.stJuarez),getResources().getString(R.string.stLeon),
                getResources().getString(R.string.stMazatlan),getResources().getString(R.string.stMonterrey),getResources().getString(R.string.stNecaxa),
                getResources().getString(R.string.stPachuca),getResources().getString(R.string.stPuebla),getResources().getString(R.string.stPumas),
                getResources().getString(R.string.stQueretaro),getResources().getString(R.string.stSanLuis),getResources().getString(R.string.stSantos),
                getResources().getString(R.string.stTigres),getResources().getString(R.string.stTijuana),getResources().getString(R.string.stToluca)};

        ArrayAdapter<String> adapterequipos = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,equipos);
        spnEquipo.setAdapter(adapterequipos);


    }

    public void clic(View view) {
        int i=0;
        if(validacion()){
            i=i+1;
            jugador = new Jugador(i,etNombre.getText().toString(),etNumPlayera.getText().toString(),spnEquipo.getSelectedItem().toString());
            datos.add(jugador);


        }
            //startActivity(intent);





    }

    public void clic2(View view) {
        Intent intent   = new Intent(this,MainActivity.class);

        Adaptador adaptador = new Adaptador(this, datos );
        Bundle bundle= new Bundle();
        bundle.putSerializable("adaptador", adaptador );
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public boolean validacion(){
        if(etNombre.getText().toString().equals(""))
        {
            etNombre.setError(getResources().getString(R.string.stErrorNombre));
            return false;
        }
        if(etNumPlayera.getText().toString().equals("")){
            etNumPlayera.setError(getResources().getString(R.string.stErrorNumPlayera));
            return false;
        }

        if(spnEquipo.getSelectedItem().toString().equals("")){
            Toast.makeText(this, getResources().getString(R.string.stErrorEquipo), Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }



}