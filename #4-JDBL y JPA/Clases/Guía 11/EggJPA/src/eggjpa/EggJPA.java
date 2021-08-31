package eggjpa;

import eggjpa.entidades.Mascota;
import eggjpa.entidades.Pulga;
import eggjpa.servicios.MascotaServicio;
import eggjpa.servicios.PersonaServicio;
import eggjpa.servicios.PulgaServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EggJPA {

    public static void main(String[] args) {

        PersonaServicio pService = new PersonaServicio();
        MascotaServicio mascotaService = new MascotaServicio();
        PulgaServicio pulgService = new PulgaServicio();

//        System.out.println(pulgService.buscarPorId("0f065f5d-8bf5-43e8-9538-d2c01f684796"));;
        
        List<Pulga> pulgas = new ArrayList();
 

        pulgas.add(pulgService.crearPulga("BeLuciana"));
        pulgas.add(pulgService.crearPulga("Belu"));
        pulgas.add(pulgService.crearPulga("Mari"));
        pulgas.add(pulgService.crearPulga("Cocco"));

        Mascota m = mascotaService.crearMascota("Chiquito", pulgas);

        pService.crearPersona("Agustin", "Fiorde", m);
        
        System.out.println("-----------------Personas-----------------");
        pService.listarPersonas().forEach((n -> System.out.println(n)));
        System.out.println("-----------------Mascotas-----------------");
        mascotaService.listarMascotas().forEach((n -> System.out.println(n)));
        System.out.println("-----------------Pulgas-----------------");
        pulgService.listarPulgas().forEach((n -> System.out.println(n)));
    }

}
