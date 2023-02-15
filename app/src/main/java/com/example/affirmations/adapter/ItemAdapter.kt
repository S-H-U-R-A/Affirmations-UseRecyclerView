package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /*En el ViewHolder es donde se setean los datos */
    inner class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //Acá se obtiene la vista del xml
        val adapterLayout =
            /*LayoutInflater sabe como inflar vistas*/
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder( adapterLayout )
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    //Se llama cada vez que se va a remplazar una vista, es decir una fila del recyclerView
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //Se obtiene el elemento de la lista
        val item = dataset[position]

        //Del holder que es el root de las vistas obtenemos el textView y seteamos su valor
        holder.textView.text = context.resources.getString( item.stringResourceId )
        //Obtenemos el imageView
        holder.imageView.setImageResource( item.imageResourceId )
    }

}