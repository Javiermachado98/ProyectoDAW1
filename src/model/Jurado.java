package model;

public class Jurado {
    private int id_jurado;
    private int nMiembros;

    public Jurado() {
    }

    public Jurado(int id_jurado, int nMiembros) {
        this.id_jurado = id_jurado;
        this.nMiembros = nMiembros;
    }

    public int getId_jurado() {
        return id_jurado;
    }

    public void setId_jurado(int id_jurado) {
        this.id_jurado = id_jurado;
    }

    public int getnMiembros() {
        return nMiembros;
    }

    public void setnMiembros(int nMiembros) {
        this.nMiembros = nMiembros;
    }

    @Override
    public String toString() {
        return "jurado{" +
                "id_jurado=" + id_jurado +
                ", nMiembros=" + nMiembros +
                '}';
    }
}
