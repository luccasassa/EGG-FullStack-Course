package Persistencia;

import Entidades.Comentarios;
import Entidades.Estancias;
import java.util.ArrayList;

public class EstanciasDAO extends DAO {
    
    public ArrayList<Estancias> listarEstancias() throws Exception {
        
        try {
            String sql = "SELECT * FROM Estancias";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Estancias> estancias = tablaEstancias(sql);    //recorrer el resultado!
            
            return estancias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar usuarios! (DAO)");

        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Estancias> tablaEstancias(String sql) throws Exception {
        
        try {
            consultarBase(sql);    //Consulto la base de datos!

            Estancias estancia = null;
            ArrayList<Estancias> estancias = new ArrayList<>();    //recorrer el resultado!

            while (resultado.next()) {
                estancia = new Estancias();
                
                estancia.setIdEstancia(resultado.getInt(1));
                estancia.setIdCliente(resultado.getInt(2));
                estancia.setIdCasa(resultado.getInt(3));
                estancia.setNombreHuesped(resultado.getString(4));
                estancia.setFechaDesde(resultado.getDate(5));
                estancia.setFechaHasta(resultado.getDate(6));

                estancias.add(estancia);
            }
            return estancias;

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
    
    public ArrayList<Estancias> iiii() throws Exception {
        
        //i) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
        try {
            String sql = "SELECT *"
                    + " FROM estancias_exterior.casas"
                    + " WHERE casas.fecha_desde = date '2020/08/1'"
                    + " AND casas.fecha_hasta = date '2020/08/31'"
                    + " AND casas.pais = 'reino unido'";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Estancias> estancias = tablaEstancias(sql);    //recorrer el resultado!
            
            return estancias;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error iiii (DAO)");

        } finally {
            desconectarBase();
        }
    }
}
