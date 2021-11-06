package com.example.notas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class NotaViewHolder extends RecyclerView.ViewHolder {
    private final TextView vistaDeItem;


    public NotaViewHolder(View itemView) {
        super( itemView );
        vistaDeItem = itemView.findViewById( R.id.textView );
    }

    public void bind(String texto){
        vistaDeItem.setText( texto );
    }

    static NotaViewHolder create(ViewGroup parent){
        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.recyclerview_item, parent, false );
        return new NotaViewHolder( view );
    }
}

