package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.participa;
import model.proyecto;

public class ParticipaDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");

    public void guardarParticipa(participa participa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(participa);
        em.getTransaction().commit();
        em.close();
    }

}
