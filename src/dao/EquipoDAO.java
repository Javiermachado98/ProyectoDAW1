package dao;
import model.Equipo;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class EquipoDAO {
    private EntityManager entityManager;

    public EquipoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Equipo> getAllEquipos() {
        return entityManager.createQuery("SELECT e FROM Equipo e", Equipo.class).getResultList();
    }

    public void createEquipo(Equipo eq) {
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
