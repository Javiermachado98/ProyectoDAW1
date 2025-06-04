package dao;
import model.Jurado;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class JuradoDAO {
    private EntityManager entityManager;

    public JuradoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Jurado> getAllJurados() {
        return entityManager.createQuery("SELECT e FROM Jurado e", Jurado.class).getResultList();
    }

    public void createJurado(Jurado eq) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(eq);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e; // Propagamos la excepción
        }
    }

}
