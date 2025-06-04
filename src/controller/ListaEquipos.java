package controller;
import model.Equipo;
import dao.EquipoDAO;
import jakarta.persistence.EntityManager;
import util.util.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListaEquipos {

    List<Equipo> arrayListEquipos = new ArrayList();

    /**
     * Crea una lista de Equipos
     */
    public ListaEquipos() {

    }

    /**
     *
     * @return el número de Equipos de la lista
     */
    public int nEquipos() {
        return arrayListEquipos.size();
    }

    /**
     * Pedimos los datos y añadimos un Equipos al final de la lista
     *
     */
    public void anadirEquipos() {
        // Crear un EntityManager
        EntityManager entityManager = JPAUtil.getEntityManager();

        // Crear el DAO
        EquipoDAO libreriaDao = new EquipoDAO(entityManager);

        Scanner sc = new Scanner(System.in);

        System.out.println("\nDatos de la equipo=====");
        System.out.print("id_equipo: ");
        int id_equipo = sc.nextInt();
        System.out.print("nombreEq: ");
        String nombreEq = sc.nextLine();
        System.out.print("ies: ");
        String ies = sc.nextLine();
        System.out.print("modalidad: ");
        String modalidad = sc.nextLine();
        System.out.print("Teléfono: ");
        String tel = sc.nextLine();

        Equipo l = new Equipo(id_equipo, nombreEq, ies, modalidad);

        libreriaDao.createEquipo(l);

        this.anadirEquipos(l);

    }

    /**
     * Añadimos un Equipos al final de la lista
     *
     * @param p
     */
    public void anadirEquipos(Equipo p) {
        arrayListEquipos.add(p);
    }

    /**
     *
     * @param posicion
     * @return El Equipos que está en la posición posicion
     */
    public Equipo EquiposPosicion(int posicion) {
        return arrayListEquipos.get(posicion);
    }

    /**
     * Muestra todos los Equipos de la lista
     */
    public void mostrarLista() {
        // Crear un EntityManager
        EntityManager entityManager = JPAUtil.getEntityManager();

        // Crear el DAO
        EquipoDAO libreriaDao = new EquipoDAO(entityManager);



        System.out.println("Equipos en la base de datos:");

        for (Equipo libreria : libreriaDao.getAllEquipos()) {
            System.out.println(libreria);
        }


    }
}
