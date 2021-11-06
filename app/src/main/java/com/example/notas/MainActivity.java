package com.example.notas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView( findViewById( R.id.main_activity ) );
        RecyclerView recyclerView = findViewById( R.id.recyclerview );
        final NotasListAdapter adapter = new NotasListAdapter( new NotasListAdapter.NotaDiff() );
        recyclerView.setAdapter( adapter );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
    }

}
