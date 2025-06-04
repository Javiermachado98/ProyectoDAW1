package model;

public class participa {
    private int id_participa;
    private String idEstudiante;
    private String anio;
    private String rol;

    public participa() {
    }

    public participa(int id_participa, String idEstudiante, String anio, String rol) {
        this.id_participa = id_participa;
        this.idEstudiante = idEstudiante;
        this.anio = anio;
        this.rol = rol;
    }

    public int getId_participa() {
        return id_participa;
    }

    public void setId_participa(int id_participa) {
        this.id_participa = id_participa;
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
                "id_participa=" + id_participa +
                ", idEstudiante='" + idEstudiante + '\'' +
                ", anio='" + anio + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
