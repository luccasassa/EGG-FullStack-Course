package Persistencia;

import Entidades.Casas;
import java.util.ArrayList;

public class CasasDAO extends DAO {

    public ArrayList<Casas> listarCasas() throws Exception {
        
        try {
            String sql = "SELECT * FROM Casas";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Casas> casas = tablaCasas(sql);    //recorrer el resultado!
            
            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar usuarios! (DAO)");

        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Casas> tablaCasas(String sql) throws Exception {
        
        try {
            consultarBase(sql);    //Consulto la base de datos!

            Casas casa = null;
            ArrayList<Casas> casas = new ArrayList<>();    //recorrer el resultado!

            while (resultado.next()) {
                casa = new Casas();
                
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));

                casas.add(casa);
            }
            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar usuarios! (DAO)");

        } finally {
            desconectarBase();
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Casas> bbbb() throws Exception {
        
        //b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
        try {
            String sql = " SELECT *"
                    + " FROM estancias_exterior.casas"
                    + " WHERE casas.fecha_desde = date '2020/08/1'"
                    + " AND casas.fecha_hasta = date '2020/08/31'"
                    + " AND casas.pais = 'reino unido'";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Casas> casas = tablaCasas(sql);    //recorrer el resultado!
            
            return casas;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error bbbb (DAO)");

        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Casas> eeee(Integer dias) throws Exception {
        
        //e) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico.
        try {
            String sql = "SELECT * FROM estancias_exterior.casas WHERE casas.fecha_desde = date '2020/08/1' AND casas.tiempo_minimo <= '"+dias+"' AND casas.tiempo_maximo >= '"+dias+"'";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Casas> casas = tablaCasas(sql);    //recorrer el resultado!
            
            return casas;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error eeee (DAO)");

        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Casas> ffff() throws Exception {
        
        //b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
        try {
            String sql = "UPDATE estancias_exterior.casas"
                    + " SET casas.precio_habitacion = round(casas.precio_habitacion* 1.05,2)"
                    + " WHERE casas.id_casa != 7 AND 8"
                    + " AND pais IN ('reino unido');";    //armo la query
            insertarModificarEliminar(sql);    // aumentamos el precio un 5%
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Casas> casas = listarCasas();     //recorrer el resultado!
            
            return casas;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error ffff (DAO)");

        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Casas> gggg() throws Exception {
        
        //g) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
        try {
            String sql = "SELECT *"
                    + " FROM casas;";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Casas> casas = tablaCasas(sql);    //recorrer el resultado!
            
            return casas;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error gggg (DAO)");

        } finally {
            desconectarBase();
        }
    }
}
