package com.example.notas;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class NotasRepository {
    private NotaDao mNotaDao;
    private LiveData<List<Nota>> mAllNotes;
    private LiveData<List<Nota>> mAllTareas;

    NotasRepository(Application application){
        NotasDatabase db = NotasDatabase.getDatabase( application );
        mNotaDao = db.notaDao();
        mAllTareas = mNotaDao.obtieneTareas();
    }

    LiveData<List<Nota>> getmAllTareas(){
        return mAllTareas;
    }

    void insert(Nota nota){
        NotasDatabase.databaseWriteExecutor.execute( ()->{
            mNotaDao.insert( nota );
        } );
    }
}
