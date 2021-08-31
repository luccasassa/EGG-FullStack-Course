/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegradorJava;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class VehiculoService {
    
    public static Vehiculo crearVehiculo() {
        Vehiculo v = new Vehiculo();
        
        v.setMarca("Ford");
        v.setModelo("Fiesta");
        v.setAnio(2000);
        v.setNumeroMotor(123456);
        v.setChasis("chasis de auto");
        v.setColor("Rojo");
        v.setTipoDeVehiculo("auto");
        
        return v;
    }
    
}
