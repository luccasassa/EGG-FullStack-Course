package eggjpa.persistencia;

import eggjpa.entidades.Pulga;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PulgaDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EggJPAPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarPulga(Pulga pulga) {
        try {
            if (pulga == null) {
                throw new Exception("Objeto nulo");
            }
                em.getTransaction().begin();
                em.persist(pulga);
                em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Pulga> listarTodos() {
        List<Pulga> pulgas = null;
        try {
            pulgas = em.createQuery("SELECT p FROM Pulga p ").getResultList();
            return pulgas;
        } catch (Exception e) {
            e.printStackTrace();
            return pulgas;
        }
    }

    public Pulga buscarPorId(String id) {
        Pulga p = null;
        try {
            p = (Pulga) em.createQuery("SELECT p FROM Pulga p WHERE p.id = '"+ id +"'").getSingleResult();
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }
}
