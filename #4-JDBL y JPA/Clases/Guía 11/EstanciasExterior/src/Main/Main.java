package Main;

import Servicios.CasasService;
import Servicios.ComentariosService;
import Servicios.FamiliasService;

public class Main {

    public static void main(String[] args) throws Exception {
        
        try {
            FamiliasService familiasservice = new FamiliasService();
            familiasservice.listarEImprimiraaaa();
            System.out.println("---------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new Exception("Error MAIN aaaa");
        }
        /////////////////////////////////////////////////////////////////
        try {
            CasasService casasservice = new CasasService();
            casasservice.listarEImprimirbbbb();
            System.out.println("---------------------------------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new Exception("Error MAIN bbbb");
        }
        /////////////////////////////////////////////////////////////////
        try {
            FamiliasService familiasservice = new FamiliasService();
            familiasservice.listarEImprimircccc();
            System.out.println("---------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new Exception("Error MAIN cccc");
        }
        /////////////////////////////////////////////////////////////////
        try {
            FamiliasService familiasservice = new FamiliasService();
            familiasservice.listarEImprimirdddd();
            System.out.println("---------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new Exception("Error MAIN dddd");
        }
        /////////////////////////////////////////////////////////////////
        try {
            CasasService casasservice = new CasasService();
            casasservice.listarEImprimireeee();
            System.out.println("---------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error MAIN eeee");
        }
        /////////////////////////////////////////////////////////////////
        try {
            CasasService casasservice = new CasasService();
            casasservice.listarEImprimirffff();
            System.out.println("---------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error MAIN ffff");
        }
        /////////////////////////////////////////////////////////////////
        try {
            CasasService casasservice = new CasasService();
            casasservice.listarEImprimirgggg();
            System.out.println("---------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error MAIN gggg");
        }
        /////////////////////////////////////////////////////////////////
        try {
            ComentariosService comentariosservice = new ComentariosService();
            comentariosservice.listarEImprimirhhhh();
            System.out.println("---------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error MAIN hhhh");
        }
        /////////////////////////////////////////////////////////////////
        try {
            ComentariosService comentariosservice = new ComentariosService();
            //comentariosservice.listarEImprimiriiii();
            System.out.println("---------------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error MAIN iiii");
        }
    }
}
