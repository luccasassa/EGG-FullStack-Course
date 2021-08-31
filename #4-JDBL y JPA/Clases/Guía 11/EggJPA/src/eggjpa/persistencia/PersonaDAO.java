package eggjpa.persistencia;

import eggjpa.entidades.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonaDAO{

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EggJPAPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarPersona(Persona persona) {
        try {
            if (persona == null) {
                throw new Exception("Objeto nulo");
            }

            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Persona> listarTodos() {

        List<Persona> personas = null;

        try {
            System.out.println(em.createQuery("SELECT p.nombre FROM Persona p WHERE p.mascota.nombre LIKE 'Pupi'").getResultList());
            personas = em.createQuery("SELECT p FROM Persona p").getResultList();
            return personas;
        } catch (Exception e) {
            e.printStackTrace();
            return personas;
        }
    }
}
