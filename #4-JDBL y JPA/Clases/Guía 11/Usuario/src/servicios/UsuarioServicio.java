package servicios;

import entidades.Usuario;
import persistencia.UsuarioDAO;
import java.util.ArrayList;

public class UsuarioServicio {

    //Hacemos el llamado a UsuarioDAO
    private UsuarioDAO dao;

    //constructor para inicializarlo
    public UsuarioServicio() {
        this.dao = new UsuarioDAO();
    }

    public ArrayList<Usuario> listarUsuario() throws Exception {
        try {

            ArrayList<Usuario> usuarios = dao.listarUsuario();

            return usuarios;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

    public void imprimirUsuario() throws Exception {
        try {
            ArrayList<Usuario> usuarios = listarUsuario();
            if (usuarios.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                System.out.println("Usuarios: ");
                for (Usuario u : usuarios) {
                    System.out.println(u.getClave() + ", ");
                    System.out.println(u.getNombre() + ", ");
                    System.out.println(u.getCorreoElectronico() + ", ");
                    System.out.println(u.getEdad() + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
