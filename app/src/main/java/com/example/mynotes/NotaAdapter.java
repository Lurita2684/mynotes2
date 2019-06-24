package com.example.mynotes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.MyNotesRow> {

    private List<NotaModel> userModelList;


    public NotaAdapter(List<NotaModel> NotaModelList) {  // Constructor
        this.userModelList = NotaModelList;
    }

    @Override
    public MyNotesRow onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        MyNotesRow viewHolder = new MyNotesRow(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyNotesRow holder, int position) {  // Pinta celda
        String receivedTitleNote = userModelList.get(position).getTituloNota();  // Obtengo el String que quiero pintar en la celda
        holder.tvTitleNote.setText(receivedTitleNote);


        String receivedSub = userModelList.get(position).getSubtituloNota();
        holder.tvSubtitleNote.setText(receivedSub);


    }


    @Override
    public int getItemCount() {  // Tamaño de la Lista (RecyclerView)
        return userModelList.size();
    }

    static class MyNotesRow extends RecyclerView.ViewHolder {  // Crea mi vista celda, la cual tiene un TextView
        private TextView tvTitleNote;
        private TextView tvSubtitleNote;


        MyNotesRow(View v) {
            super(v);
            tvTitleNote = v.findViewById(R.id.tituloNota);
            tvSubtitleNote = v.findViewById(R.id.subtituloNota);

        }
    }

}

