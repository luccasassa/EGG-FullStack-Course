package eggjpa.servicios;

import eggjpa.entidades.Mascota;
import eggjpa.entidades.Persona;
import eggjpa.entidades.Pulga;
import eggjpa.persistencia.PersonaDAO;
import java.util.List;
import java.util.UUID;

public class PersonaServicio {

    private PersonaDAO dao = new PersonaDAO();

    public Persona crearPersona(String nombre, String apellido, Mascota mascota) {

        Persona persona = new Persona();
        try {
            persona.setId(UUID.randomUUID().toString());
            persona.setApellido(apellido);
            persona.setNombre(nombre);
            persona.setMascota(mascota);

            dao.guardarPersona(persona);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return persona;
        }
    }

    public List<Persona> listarPersonas() {
        try {
            return dao.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
