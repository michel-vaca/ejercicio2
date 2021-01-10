package com.example.ejercicio2;
import android.content.Context;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejercicio2.model.Jugador;


import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    Context contexto ;
    ArrayList<Jugador> datos;
    private static LayoutInflater inflater= null;

    public Adaptador(Context contexto, ArrayList<Jugador> datos) {
        this.contexto = contexto;
        this.datos = datos;
        inflater =(LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int i) {
        //return null;
        return datos.get(i); }

    @Override
    public long getItemId(int i) {
        return datos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View vista = inflater.inflate(R.layout.elemento_lista,null);
        TextView tvNombre = vista.findViewById(R.id.tvNombre);
        TextView tvEquipo = vista.findViewById(R.id.tvEquipo);
        TextView tvNumPlayera = vista.findViewById(R.id.tvNumPlayera);
        ImageView ivImagen = vista.findViewById(R.id.ivImagen);

        tvNombre.setText(datos.get(i).getNombre());
        tvEquipo.setText(datos.get(i).getEquipo());
        tvNumPlayera.setText(datos.get(i).getNumPlayera());


        /*switch (datos.get(i).getEquipo()){
            case "Club America (el mas grande)":
                ivImagen.setImageResource(R.drawable.clubamerica);
                break;
            case "Atlas F. C.":
                ivImagen.setImageResource(R.drawable.atlas);
                break;
            case"C. D. Cruz Azul":
                ivImagen.setImageResource(R.drawable.cruzazul);
                break;
            case"C. D. Guadalajara":
                ivImagen.setImageResource(R.drawable.chivas);
                break;
            case"Club Leon":
                ivImagen.setImageResource(R.drawable.leon);
                break;
            case"F. C. Juarez":
                 ivImagen.setImageResource(R.drawable.juarez);
                break;
            case"Mazatlan F. C.":
                ivImagen.setImageResource(R.drawable.mazatlan);
                break;
            case"C. F. Monterrey":
                ivImagen.setImageResource(R.drawable.monterrey);
                break;
            case"IClub Necaxa":
                ivImagen.setImageResource(R.drawable.necaxa);
                break;
            case"C. F. Pachuca":
                ivImagen.setImageResource(R.drawable.pachuca);
                break;
            case"C. F. Puebla":
                ivImagen.setImageResource(R.drawable.puebla);
                break;
            case"Queretaro F. C.":
                ivImagen.setImageResource(R.drawable.queretaro);
                break;
            case"Atletico San Luis":
                ivImagen.setImageResource(R.drawable.sanluis);
                break;
            case"Santos Laguna":
                ivImagen.setImageResource(R.drawable.santos);
                break;
            case"Tigres de la UANL":
                ivImagen.setImageResource(R.drawable.tigres);
                break;
            case"Club Tijuana":
                ivImagen.setImageResource(R.drawable.tijuana);
                break;
            case"Deportivo Toluca F. C.":
                ivImagen.setImageResource(R.drawable.toluca);
                break;
            case"Universidad Nacional":
                ivImagen.setImageResource(R.drawable.pumas);
                break;
            default:
                break;

        }*/



        return vista;

    }
}
