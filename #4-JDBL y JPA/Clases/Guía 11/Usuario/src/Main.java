import servicios.UsuarioServicio;

public class Main {

    public static void main(String[] args) {
        UsuarioServicio serv = new UsuarioServicio();
        
        try {
            serv.imprimirUsuario();
        } catch (Exception e) {
            System.out.println("---YEYYY---");
        }
        
    }

}
