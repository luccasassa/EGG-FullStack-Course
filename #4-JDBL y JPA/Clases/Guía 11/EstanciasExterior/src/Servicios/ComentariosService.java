package Servicios;

import Entidades.Comentarios;
import Persistencia.ComentariosDAO;
import java.util.ArrayList;

public class ComentariosService {
    
    private ComentariosDAO dao;
    
    public ComentariosService() {
        this.dao = new ComentariosDAO();
    }
    
    public void listarEImprimirhhhh() throws Exception {
        try {
            
            ArrayList<Comentarios> comentarios = dao.hhhh();
            System.out.println("\033[36m"+"h) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’.\n"+"\033[30m");

            if (comentarios.isEmpty()) {
                System.out.println("La lista está vacia");
            } else {
                for (Comentarios i : comentarios) {
                    System.out.println(i.toString());
                }
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service hhhh");

        }
    }
}
