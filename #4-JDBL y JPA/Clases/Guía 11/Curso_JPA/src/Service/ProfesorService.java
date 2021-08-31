package Service;

import Entidades.Profesor;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ProfesorService {
    
    private EntityManager em = Persistence.createEntityManagerFactory("Curso_JPAPU").createEntityManager();

    public void crearProfesor(Integer documento, String nombre, String apellido, Integer telefono, Integer sueldo){
        
        em.getTransaction().begin();
        
        Profesor profesor = new Profesor();
        profesor.setDocumento(documento);
        profesor.setNombre(nombre);
        profesor.setApellido(apellido);
        profesor.setTelefono(telefono);
        profesor.setSueldo(sueldo);
        
        em.persist(profesor);
        
        em.getTransaction().commit();
    }
}
