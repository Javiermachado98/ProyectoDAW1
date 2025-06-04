package model;

public class proyecto {
    private int id_proyecto;
    private String titulo;
    private String descripcion;
    private String fechPresentacion;
    private String tecnologia;
    private String puntuacion;
    private String comentario;
    private String id_jurado;

    public proyecto() {
    }

    public proyecto(int id_proyecto, String titulo, String descripcion, String fechPresentacion, String tecnologia, String puntuacion, String comentario, String id_jurado) {
        this.id_proyecto = id_proyecto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechPresentacion = fechPresentacion;
        this.tecnologia = tecnologia;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.id_jurado = id_jurado;
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

    public String getFechPresentacion() {
        return fechPresentacion;
    }

    public void setFechPresentacion(String fechPresentacion) {
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

    public String getId_jurado() {
        return id_jurado;
    }

    public void setId_jurado(String id_jurado) {
        this.id_jurado = id_jurado;
    }

    @Override
    public String toString() {
        return "proyecto{" +
                "id_proyecto=" + id_proyecto +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechPresentacion='" + fechPresentacion + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                ", puntuacion='" + puntuacion + '\'' +
                ", comentario='" + comentario + '\'' +
                ", id_jurado='" + id_jurado + '\'' +
                '}';
    }
}
