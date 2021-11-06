package com.example.notas;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NotasViewModel extends AndroidViewModel {

    private NotasRepository mRepository;
    private final LiveData<List<Nota>> mAllTareas;

    public NotasViewModel(Application application) {
        super( application );
        mRepository = new NotasRepository( application );
        mAllTareas = mRepository.getmAllTareas();
    }

    LiveData<List<Nota>> getmAllTareas(){return mAllTareas;}

    public void insert(Nota nota){mRepository.insert( nota );}
}
