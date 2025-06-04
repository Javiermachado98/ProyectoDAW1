package model;

public class participa {
    private int id_participa;
    private String idEstudiante;
    private String anio;
    private String rol;

    public participa() {
    }

    public participa(String idEstudiante, String anio, String rol) {
        this.idEstudiante = idEstudiante;
        this.anio = anio;
        this.rol = rol;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "participa{" +
                "idEstudiante='" + idEstudiante + '\'' +
                ", anio='" + anio + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
