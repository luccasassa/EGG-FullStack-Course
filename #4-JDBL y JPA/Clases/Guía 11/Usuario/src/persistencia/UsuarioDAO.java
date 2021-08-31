package persistencia;

import entidades.Usuario;
import java.util.ArrayList;

public class UsuarioDAO extends DAO {

    public ArrayList<Usuario> listarUsuario() throws Exception {
        try {
            //armo la query
            String sql = "SELECT clave,nombre,correoElectronico,edad"
                        + " FROM Usuario";
            //Consulto la base de datos!
            consultarBase(sql);

            //recorrer el resultado!
            Usuario usuario = null;
            ArrayList<Usuario> usuarios = new ArrayList<>();

            while (resultado.next()) {
                usuario = new Usuario();

                usuario.setClave(resultado.getInt(1));
                usuario.setNombre(resultado.getString(2));
                usuario.setCorreoElectronico(resultado.getString(3));
                usuario.setEdad(resultado.getInt(4));
                
                usuarios.add(usuario);
            }
            
            return usuarios;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar usuarios! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }
    
    
}
