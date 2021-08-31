package Servicios;

import Entidades.Casas;
import Persistencia.CasasDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class CasasService {

    private CasasDAO dao;
    
    public CasasService() {
        this.dao = new CasasDAO();
    }
    
    public void listarEImprimirbbbb() throws Exception {
        
        try {
            
            ArrayList<Casas> casas = dao.bbbb();
            System.out.println("\033[36m"+"b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.\n"+"\033[30m");

            if (casas.isEmpty()) {
                System.out.println("La lista está vacia");
            } else {
                for (Casas i : casas) {
                    System.out.println(i.getIdCasa()+" | "+i.getPais()+" | "+i.getFechaDesde()+" | "+i.getFechaHasta());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service bbbb");

        }
    }
    
    public void listarEImprimireeee() throws Exception {
        
        try {
            
            System.out.println("\033[36m"+"e) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico.\n"+"\033[30m");
            
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Cuántos dias? -> ");
            Integer dias = sc.nextInt();
            System.out.println("");
            
            ArrayList<Casas> casas = dao.eeee(dias);

            //System.out.println("Casas disponibles para "+dias+" dias\n");    //la fecha la pongo yo
            if (casas.isEmpty()) {
                System.out.println("La lista está vacia");
            } else {
                for (Casas i : casas) {
                    System.out.println(i.getIdCasa()+" | "+i.getCalle()+" | "+i.getNumero()+" | "+i.getCiudad()+" | "+i.getPais()+" | "+i.getFechaDesde()+" | $"+i.getPrecioHabitacion());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service eeee");
        }
    }
    
    public void listarEImprimirffff() throws Exception {
        
        try {
            
            CasasDAO dao = new CasasDAO();
            ArrayList<Casas> casas = dao.ffff();
            System.out.println("\033[36m"+"f) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido.\n"+"\033[30m");

            
            System.out.println("--PRECIO ACTUALIZADO--\n");
            
            if (casas.isEmpty()) {
                System.out.println("La lista está vacia");
            } else {
                for (Casas i : casas) {
                    System.out.println(i.toString());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error Service ffff");
        }
    }

    public void listarEImprimirgggg() throws Exception {
        
        try {

            ArrayList<Casas> casas = dao.gggg();
            System.out.println("\033[36m"+"g) Obtener el número de casas que existen para cada uno de los países diferentes.\n"+"\033[30m");

            int i = 0;
            int j = 0;
            int k = 0;
            
            if (casas.isEmpty()) {
                System.out.println("La lista está vacia");
            } else {
                
                for (Casas casa : casas) {
                    if (casa.getPais().equals("Reino Unido")) {
                        i++;
                    } else if (casa.getPais().equals("Irlanda")) {
                        j++;
                    } else if (casa.getPais().equals("Holanda")) {
                        k++;
                    }
                }
                
                System.out.println("CASAS DE REINO UNIDO: " + i);
                System.out.println("CASAS DE IRLANDA: " + j);
                System.out.println("CASAS DE HOLANDA: " + k);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error Service gggg");
        }
    }
}
