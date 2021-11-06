package com.example.notas;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class NotasListAdapter extends ListAdapter<Nota,NotaViewHolder> {

    protected NotasListAdapter(@NonNull DiffUtil.ItemCallback<Nota> diffCallback) {
        super( diffCallback );
    }

    @NonNull
    @Override
    public NotaViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return NotaViewHolder.create( parent );
    }

    @Override
    public void onBindViewHolder( NotaViewHolder holder, int position) {
        Nota current = getItem( position );
        holder.bind( current.getTitulo() );
    }

    static class NotaDiff extends DiffUtil.ItemCallback<Nota>{

        @Override
        public boolean areItemsTheSame(@NonNull Nota oldItem, @NonNull Nota newItem) {
            return oldItem==newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Nota oldItem, @NonNull Nota newItem) {
            return oldItem.getTitulo().equals( newItem.getTitulo() );
        }
    }

}
