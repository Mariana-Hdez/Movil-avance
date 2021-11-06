package com.example.notas;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NotaDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE) void insert(Nota nota);

    @Query( "DELETE FROM tablaNotas" ) void borrar();

    @Query( "SELECT * FROM tablaNotas ORDER BY fecha ASC" )
    LiveData<List<Nota>> obtieneTareas();
}
