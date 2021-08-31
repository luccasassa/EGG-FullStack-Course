package Persistencia;

import Entidades.Comentarios;
import java.util.ArrayList;

public class ComentariosDAO extends DAO{
    
    
    public ArrayList<Comentarios> listarComentarios() throws Exception {
        
        try {
            String sql = "SELECT * FROM Comentarios";    //armo la query
            consultarBase(sql);    //Consulto la base de datos!

            ArrayList<Comentarios> comentarios = tablaComentarios(sql);    //recorrer el resultado!
            
            return comentarios;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Comentarios (DAO)");

        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Comentarios> tablaComentarios(String sql) throws Exception {
        
        try {
            consultarBase(sql);

            Comentarios comentario = null;
            ArrayList<Comentarios> comentarios = new ArrayList<>();    //recorrer el resultado

            while (resultado.next()) {
                comentario = new Comentarios();
                
                comentario.setIdCasa(resultado.getInt(1));
                comentario.setCalle(resultado.getString(2));
                comentario.setNumero(resultado.getInt(3));
                comentario.setCodigoPostal(resultado.getInt(4));
                comentario.setCiudad(resultado.getString(5));
                comentario.setPais(resultado.getString(6));
                comentario.setFechaDesde(resultado.getDate(7));
                comentario.setFechaHasta(resultado.getDate(8));
                comentario.setTiempoMinimo(resultado.getInt(9));
                comentario.setTiempoMaximo(resultado.getInt(10));
                comentario.setPrecioHabitacion(resultado.getDouble(11));
                comentario.setTipoVivienda(resultado.getString(12));
                comentario.setIdComentario(resultado.getInt(13));
                comentario.setIdCasa(resultado.getInt(14));
                comentario.setComentario(resultado.getString(15));

                comentarios.add(comentario);
            }

            return comentarios;

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
    
    public ArrayList<Comentarios> hhhh() throws Exception {
        
        try {
            String sql = "select * "
                    + " from casas "
                    + " inner join comentarios "
                    + " on comentarios.id_casa=casas.id_casa "
                    + " where comentarios.comentario like '%limpia%' "
                    + " and casas.pais like '%reino unido%';";
            consultarBase(sql);    //conecto la base

            ArrayList<Comentarios> comentarios = tablaComentarios(sql);    //recorrer el resultado

            return comentarios;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar usuarios! (DAO)");
            
        } finally {
            desconectarBase();
        }
    }
}
