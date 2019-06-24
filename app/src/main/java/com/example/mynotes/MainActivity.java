package com.example.mynotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNotes = findViewById(R.id.rvNotas);

        rvNotes.setHasFixedSize(true);

        // use a linear layout manager
        rvNotes.setLayoutManager(new LinearLayoutManager(this));

        // specify an adapter with the list to show
        NotaAdapter mAdapter = new NotaAdapter (getData());
        rvNotes.setAdapter(mAdapter);

    }

    private List<NotaModel> getData(){
        NotaModel note1 = new NotaModel();
        note1.setTituloNota(" Dentista");
        note1.setSubtituloNota("Dentix a las 17h");


        NotaModel note2 = new NotaModel();
        note2.setTituloNota("Cena");
        note2.setSubtituloNota("Vips de Sol a las 18h");

        NotaModel note3 = new NotaModel();
        note3.setTituloNota("Escalada");
        note3.setSubtituloNota("Espacio Accion Lunes a las 20h");

        NotaModel note4 = new NotaModel();
        note4.setTituloNota("Cine");
        note4.setSubtituloNota("Aladdin cinesa Rosas 20:30h Viernes");


        List<NotaModel> listaNotas = new ArrayList<>();
        listaNotas.add(note1);
        listaNotas.add(note2);
        listaNotas.add(note3);
        listaNotas.add(note4);

        return listaNotas;
    }


}