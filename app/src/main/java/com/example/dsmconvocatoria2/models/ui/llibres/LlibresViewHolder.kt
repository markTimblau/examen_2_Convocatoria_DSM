package com.example.dsmconvocatoria2.models.ui.llibres

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.dsmconvocatoria2.R
import com.example.dsmconvocatoria2.models.Estat
import com.example.dsmconvocatoria2.models.Llibre

class LlibreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val tvTitol: TextView = itemView.findViewById(R.id.TVtitol)
    private val tvAutor: TextView = itemView.findViewById(R.id.TVnom)
    private val tvTipus: TextView = itemView.findViewById(R.id.TVtipus)
    private val tvAny: TextView = itemView.findViewById(R.id.TVdata)
    private val tvEstat: TextView = itemView.findViewById(R.id.TVestat)

    fun bind(llibre: Llibre){
        tvTitol.text = llibre.titol
        tvAutor.text = llibre.autor
        tvTipus.text = llibre.genere.nom
        tvAny.text = llibre.any.toString()
        tvEstat.text = llibre.estat.nom

        val colorRes = when (llibre.estat){
            is Estat.Llegit -> android.R.color.holo_green_light
            is Estat.Llegint -> android.R.color.holo_blue_bright
            is Estat.PerLlegir -> android.R.color.holo_orange_light
        }
        tvEstat.setTextColor(ContextCompat.getColor(itemView.context, colorRes))
    }
}
