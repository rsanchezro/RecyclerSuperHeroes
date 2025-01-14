package com.example.recyclersuperheroes.adaptador

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclersuperheroes.R
import com.example.recyclersuperheroes.SuperHeroe

class SuperHeroeAdaptador(val superHeroes:List<SuperHeroe>):RecyclerView.Adapter<SuperHeroeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroeViewHolder {
      //Tiene que obtener un inflador de vistas
      val minflater= LayoutInflater.from(parent.context)
        return SuperHeroeViewHolder(minflater.inflate(R.layout.elemento_superheroe,parent,false))
    }

    override fun getItemCount(): Int=
      //Solamente tiene que devolver el nº de elementos que habría que pintar
       superHeroes.size


    override fun onBindViewHolder(holder: SuperHeroeViewHolder, position: Int) {
        //Se invoca por cada elemento que se visualiza
        holder.vincular(superHeroes.get(position))
    }
}