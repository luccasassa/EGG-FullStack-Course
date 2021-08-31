package Servicios;

import Entidades.Familias;
import Persistencia.FamiliasDAO;
import java.util.ArrayList;

public class FamiliasService {

    private FamiliasDAO dao;

    public FamiliasService() {
        this.dao = new FamiliasDAO();
    }

//    public void listaraaaa() throws Exception {
//        try {
//            ArrayList<Familias> familias = dao.aaaa();
//            System.out.println("\033[36m"+"a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.\n");
//            imprimirFamilias(familias);
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new Exception("Error aaaa");
//        }
//    }
    
    public void listarEImprimiraaaa() throws Exception {
        
        try {
            ArrayList<Familias> familias = dao.aaaa();
            System.out.println("\033[36m"+"a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.\n"+"\033[30m");
            
            if (familias.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                for (Familias i : familias) {
                    System.out.println(i.getIdFamilia()+" | "+i.getNombre()+i.getEdadMaxima()+" | "+i.getNumHijos());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service aaaa");
        }
    }
    
    public void listarEImprimircccc() throws Exception {
        
        try {
            ArrayList<Familias> familias = dao.cccc();
            System.out.println("\033[36m"+"c) Como cliente, estás interesado en mandar a tu hijo a una familia, de la que únicamente recuerdas que su nombre familiar terminaba en ‘y’.\n"+"\033[30m");
            
            if (familias.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                for (Familias i : familias) {
                    System.out.println(i.getIdFamilia()+" | "+i.getNombre());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service cccc");
        }
    }
    
    public void listarEImprimirdddd() throws Exception {
        
        try {
            ArrayList<Familias> familias = dao.dddd();
            System.out.println("\033[36m"+"d) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.\n"+"\033[30m");
            
            if (familias.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                for (Familias i : familias) {
                    System.out.println(i.getIdFamilia()+" | "+i.getNombre()+" | "+i.getEmail());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service dddd");
        }
    }
    
    
}