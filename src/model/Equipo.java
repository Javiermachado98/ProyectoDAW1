package model;

public class Equipo {
    private int id_equipo;
    private String nombreEq;
    private String ies;
    private String modalidad;

    public Equipo() {
    }

    public Equipo(int id_equipo, String nombreEq, String ies, String modalidad) {
        this.id_equipo = id_equipo;
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

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    @Override
    public String toString() {
        return "equipo{" +
                "id_equipo=" + id_equipo +
                ", nombreEq='" + nombreEq + '\'' +
                ", ies='" + ies + '\'' +
                ", modalidad='" + modalidad + '\'' +
                '}';
    }
}
