package com.example.notas;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "tablaNotas")
public class Nota {

    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo
    public String titulo;
    @ColumnInfo public String descripcion;
    @ColumnInfo public String fecha;
    @ColumnInfo public boolean esTarea;
    @ColumnInfo public String hora;
    @ColumnInfo public boolean concluida;

    public Nota(int id, String titulo, String descripcion, String fecha, boolean esTarea, String hora, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.esTarea = esTarea;
        this.hora = hora;
        this.concluida = concluida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isEsTarea() {
        return esTarea;
    }

    public void setEsTarea(boolean esTarea) {
        this.esTarea = esTarea;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
