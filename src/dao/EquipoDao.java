package dao;
import model.equipo;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class EquipoDao {
    private EntityManager entityManager;

    public EquipoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<equipo> getAllEquipos() {
        return entityManager.createQuery("SELECT e FROM Equipo e", equipo.class).getResultList();
    }

    public void createEquipo(equipo eq) {
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
