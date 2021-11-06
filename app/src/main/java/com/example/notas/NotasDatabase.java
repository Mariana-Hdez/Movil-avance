package com.example.notas;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database( entities = {Nota.class}, version = 1, exportSchema = false)
public abstract class NotasDatabase extends RoomDatabase {

    public abstract NotaDao notaDao();

    private static volatile NotasDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool( NUMBER_OF_THREADS );

    static NotasDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (NotasDatabase.class){
                if (INSTANCE==null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            NotasDatabase.class, "notasDatabase").build();
                }
            }
        }
        return INSTANCE;
    }

}
