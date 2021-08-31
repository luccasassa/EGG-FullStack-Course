package eggjpa.servicios;

import eggjpa.entidades.Mascota;
import eggjpa.entidades.Persona;
import eggjpa.entidades.Pulga;
import eggjpa.persistencia.PersonaDAO;
import eggjpa.persistencia.PulgaDAO;
import java.util.List;
import java.util.UUID;

public class PulgaServicio {

    private PulgaDAO dao = new PulgaDAO();

    public Pulga crearPulga(String nombre) {

        Pulga pulga = new Pulga();
        try {
            pulga.setId(UUID.randomUUID().toString());
            pulga.setNombre(nombre);
            dao.guardarPulga(pulga);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return pulga;
        }
    }

    public List<Pulga> listarPulgas() {
        try {
            return dao.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Pulga buscarPorId(String id) {
        return dao.buscarPorId(id);
    }
}
