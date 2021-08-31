package eggjpa.servicios;

import eggjpa.entidades.Mascota;
import eggjpa.entidades.Mascota;
import eggjpa.entidades.Persona;
import eggjpa.entidades.Pulga;
import eggjpa.persistencia.MascotaDAO;
import eggjpa.persistencia.PersonaDAO;
import java.util.List;
import java.util.UUID;

public class MascotaServicio {
    
    private MascotaDAO dao = new MascotaDAO();

    public Mascota crearMascota(String nombre, List<Pulga> pulgas) {

        Mascota mascota = new Mascota();
        try {
            mascota.setId(UUID.randomUUID().toString().substring(0, 8));
            mascota.setNombre(nombre);
            mascota.setPulgas(pulgas);
            dao.guardarMascota(mascota);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return mascota;
        }
    }
    
        public List<Mascota> listarMascotas() {
        try {
            return dao.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
