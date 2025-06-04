package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Equipo;
import model.Proyecto;

import java.util.List;

public class ProyectoDAO {

    private EntityManager entityManager;

    public ProyectoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Proyecto> getAllProyecto() {
        return entityManager.createQuery("SELECT p FROM Proyecto p", Proyecto.class).getResultList();
    }

    public void createProyecto(Proyecto pr) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(pr);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e; // Propagamos la excepción
        }
    }

}
