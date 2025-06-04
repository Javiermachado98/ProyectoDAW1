package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Equipo;
import model.Participa;

import java.util.List;

public class ParticipaDAO {

    private EntityManager entityManager;

    public ParticipaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Participa> getAllParticipa() {
        return entityManager.createQuery("SELECT p FROM Participa p", Participa.class).getResultList();
    }

    public void createParticipa(Participa pa) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(pa);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e; // Propagamos la excepción
        }
    }

}
