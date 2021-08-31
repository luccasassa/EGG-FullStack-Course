package eggjpa.persistencia;

import eggjpa.entidades.Mascota;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MascotaDAO{

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EggJPAPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarMascota(Mascota mascota) {
        try {
            if (mascota == null) {
                throw new Exception("Objeto nulo");
            }
            em.getTransaction().begin();
            em.persist(mascota);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Mascota> listarTodos() {

        List<Mascota> personas = null;

        try {
            personas = em.createQuery("SELECT p FROM Mascota p").getResultList();
            return personas;
        } catch (Exception e) {
            e.printStackTrace();
            return personas;
        }
    }
}
