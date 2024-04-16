package org.paquete.entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pelicula
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String title;
private int duracion_minutos;
private String fecha_estreno;

    public Pelicula() {
    }
    

    public Pelicula(int id, String nombre, int duracion_min, String fecha_estreno) {
        this.id = id;
        this.title = nombre;
        this.duracion_minutos = duracion_min;
        this.fecha_estreno = fecha_estreno;
    }


    public Pelicula(String nombre, int duracion_min, String fecha_estreno) {
        this.title = nombre;
        this.duracion_minutos = duracion_min;
        this.fecha_estreno = fecha_estreno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuracion_minutos() {
        return duracion_minutos;
    }

    public void setDuracion_minutos(int duracion_minutos) {
        this.duracion_minutos = duracion_minutos;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public String toString()
    {
        return this.title +" -- "+this.fecha_estreno;
    }
}
