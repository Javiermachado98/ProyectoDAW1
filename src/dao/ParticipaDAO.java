package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Participa;

public class ParticipaDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");

    public void guardarParticipa(Participa participa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(participa);
        em.getTransaction().commit();
        em.close();
    }

}
