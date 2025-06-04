package model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "proyecto")
public class Proyecto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proyecto;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fechaPresentacion")
    private LocalDate fechPresentacion;
    @Column(name = "tecnologias")
    private String tecnologia;
    @Column(name = "puntuacion")
    private String puntuacion;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "idJurados")
    private int id_jurado;
    @Column(name = "idJurados")
    private int codigoEquipo;

    public Proyecto() {
    }

    public Proyecto(String titulo, String descripcion, LocalDate fechPresentacion, String tecnologia, String puntuacion, String comentario, int id_jurado, int codigoEquipo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechPresentacion = fechPresentacion;
        this.tecnologia = tecnologia;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.id_jurado = id_jurado;
        this.codigoEquipo = codigoEquipo;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
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

    public LocalDate getFechPresentacion() {
        return fechPresentacion;
    }

    public void setFechPresentacion(LocalDate fechPresentacion) {
        this.fechPresentacion = fechPresentacion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getId_jurado() {
        return id_jurado;
    }

    public void setId_jurado(int id_jurado) {
        this.id_jurado = id_jurado;
    }

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "id_proyecto=" + id_proyecto +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechPresentacion=" + fechPresentacion +
                ", tecnologia='" + tecnologia + '\'' +
                ", puntuacion='" + puntuacion + '\'' +
                ", comentario='" + comentario + '\'' +
                ", id_jurado=" + id_jurado +
                ", codigoEquipo=" + codigoEquipo +
                '}';
    }
}
