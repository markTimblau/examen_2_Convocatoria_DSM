package com.example.dsmconvocatoria2.models.ui.llbres

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dsmconvocatoria2.R
import com.example.dsmconvocatoria2.models.Llibre

class LlibresAdapter(private val onLlibreClick: (Llibre) -> Unit) : RecyclerView.Adapter<LlibreViewHolder>() {
    private var llistaLlibres: List<Llibre> = emptyList()

    fun setLlibres(nousLlibres: List<Llibre>) {
        llistaLlibres = nousLlibres
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LlibreViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_llibre, parent, false)
        return LlibreViewHolder(view)
    }
    override fun getItemCount(): Int= llistaLlibres.size

    override fun onBindViewHolder(holder: LlibreViewHolder, position: Int) {
        val llibre = llistaLlibres[position]
        holder.bind(llibre)
        holder.itemView.setOnClickListener {
            onLlibreClick(llibre)
        }
    }
}