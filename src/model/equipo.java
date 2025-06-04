package model;

public class equipo {
    private int id_equipo;
    private String nombreEq;
    private String ies;
    private String modalidad;

    public equipo() {
    }

    public equipo(String nombreEq, String ies, String modalidad) {
        this.nombreEq = nombreEq;
        this.ies = ies;
        this.modalidad = modalidad;
    }

    public String getNombreEq() {
        return nombreEq;
    }

    public void setNombreEq(String nombreEq) {
        this.nombreEq = nombreEq;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getIes() {
        return ies;
    }

    public void setIes(String ies) {
        this.ies = ies;
    }

    @Override
    public String toString() {
        return "equipo{" +
                "nombreEq='" + nombreEq + '\'' +
                ", ies='" + ies + '\'' +
                ", modalidad='" + modalidad + '\'' +
                '}';
    }
}
