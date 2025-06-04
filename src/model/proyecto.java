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

    public proyecto(String titulo, String descripcion, String fechPresentacion, String tecnologia) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechPresentacion = fechPresentacion;
        this.tecnologia = tecnologia;
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

    @Override
    public String toString() {
        return "proyecto{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechPresentacion='" + fechPresentacion + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }
}
