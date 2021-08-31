package Persistencia;

import Entidades.Clientes;
import java.util.ArrayList;

public class ClientesDAO extends DAO {
    
    public ArrayList<Clientes> listarClientes() throws Exception {
        
        try {
            String sql = "SELECT * FROM Clientes";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Clientes> casas = tablaClientes(sql);    //recorrer el resultado!
            
            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar usuarios! (DAO)");

        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Clientes> tablaClientes(String sql) throws Exception {
        
        try {
            consultarBase(sql);    //Consulto la base de datos!

            Clientes cliente = null;
            ArrayList<Clientes> clientes = new ArrayList<>();    //recorrer el resultado!

            while (resultado.next()) {
                cliente = new Clientes();
                
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigoPostal(resultado.getInt(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));

                clientes.add(cliente);
            }
            return clientes;

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
    
    
}
