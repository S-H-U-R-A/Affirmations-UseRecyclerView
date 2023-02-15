package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se obtiene la lista de datos
        val myDataset: List<Affirmation> = Datasource().loadAffirmations()
        //Se obtiene referencia a la vista Xml del recyclerview
        val recyclerView: RecyclerView = findViewById( R.id.recycler_view)

        //Se asigna el adapter al RecyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)

        /*Esto se usa para optimización en rendimiento internamente
         cuando el diseño de las filas siempre van a ser iguales*/
        recyclerView.setHasFixedSize(true)

    }
}