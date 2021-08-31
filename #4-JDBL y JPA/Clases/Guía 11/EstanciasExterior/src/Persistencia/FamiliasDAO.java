package Persistencia;

import Entidades.Familias;
import java.util.ArrayList;

public class FamiliasDAO extends DAO {

    public ArrayList<Familias> listarFamilias() throws Exception {
        
        try {
            String sql = "SELECT * FROM Familias";    //armo la query
            consultarBase(sql);    //conecto la base

            ArrayList<Familias> familias = tablaFamilias(sql);    //recorrer el resultado

            return familias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar usuarios! (DAO)");
            
        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Familias> tablaFamilias(String sql) throws Exception {
        
        try {
            consultarBase(sql);

            Familias familia = null;
            ArrayList<Familias> familias = new ArrayList<>();    //recorrer el resultado

            while (resultado.next()) {
                familia = new Familias();

                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));

                familias.add(familia);
            }

            return familias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error en consulta! (DAO FAMILIAS)");

        } finally {
            desconectarBase();
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Familias> aaaa() throws Exception {
        
        //a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
        try {
            String sql = "SELECT * FROM Familias WHERE num_hijos <=3 AND edad_maxima <10;";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Familias> familias = tablaFamilias(sql);    //recorrer el resultado!

            return familias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error aaaa (DAO)");

        } finally {
            desconectarBase();
        }
    }

    public ArrayList<Familias> cccc() throws Exception {
        
        try {
            String sql = "SELECT * FROM estancias_exterior.familias WHERE familias.nombre LIKE '%y';";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Familias> familias = tablaFamilias(sql);    //el metodo consultaFamilia me devuelve el resultado de la búsqueda    //recorrer el resultado!

            return familias;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error cccc (DAO)");

        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Familias> dddd() throws Exception {
        
        try {
            String sql = "SELECT * FROM estancias_exterior.familias WHERE familias.email LIKE '%hotmail%';";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Familias> familias = tablaFamilias(sql);    //el metodo consultaFamilia me devuelve el resultado de la búsqueda    //recorrer el resultado!

            return familias;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error dddd (DAO)");

        } finally {
            desconectarBase();
        }
    }

//    public ArrayList<Familias> hotmail() throws Exception {
//        try {
//            String sql = "select * "
//                    + " from estancias_exterior.familias"
//                    + " where familias.email like '%hotmail%'";    //armo la query
//            
//            consultarBase(sql);    //Consulto la base de datos!
//
//            ArrayList<Familias> familias = tablaFamilias(sql);    //el metodo consultaFamilia me devuelve el resultado de la busqueda    //recorrer el resultado!
//
//            return familias;
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new Exception("Error listar usuarios! (DAO)");
//
//        } finally {
//            desconectarBase();
//        }
//    }
}
