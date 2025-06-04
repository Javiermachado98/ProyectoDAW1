package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Proyecto;

public class ProyectoDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");

    public void guardarProyecto(Proyecto proyecto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(proyecto);
        em.getTransaction().commit();
        em.close();
    }

}
