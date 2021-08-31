package Servicios;

import Entidades.Clientes;
import Entidades.Estancias;
import Persistencia.ClientesDAO;
import Persistencia.EstanciasDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EstanciasService extends Entidades.Casas{
    
    private EstanciasDAO dao;
    
    public EstanciasService() {
        this.dao = new EstanciasDAO();
    }
    
    public void listarEImprimiriiii() throws Exception {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'T' HH:mm:ss.SSS");
                
        try {
            
            ArrayList<Estancias> estancias = dao.iiii();
            System.out.println("\033[36m"+"i) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.\n"+"\033[30m");
            
            int casa = sc.nextInt();
            System.out.print("Fecha DESDE (YYYY-MM-DD) -> ");
            String fechaInicio = sc.next();
            Date fech1 = sdf.parse(fechaInicio);
            
            System.out.print("Fecha HASTA (YYYY-MM-DD) -> ");
            String fechaFinal = sc.next();
            Date fech2 = sdf.parse(fechaFinal);
            
            System.out.print("ID del cliente que alquila -> ");
            List<Clientes> clientes = new ArrayList<>();
            ClientesDAO cliente = new ClientesDAO();
            clientes = cliente.listarClientes();
            int seleccionarCliente = sc.nextInt();
            
            //completar
            
            if (estancias.isEmpty()) {
                System.out.println("La lista está vacia");
            } else {
                for (Estancias i : estancias) {
                    System.out.println(i.getIdEstancia()+" | ");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service iiii");

        }
    }
}
