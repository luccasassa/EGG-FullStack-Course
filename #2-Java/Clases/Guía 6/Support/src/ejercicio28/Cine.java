package ejercicio28;

public class Cine {
    
    private Pelicula pelicula;
    private Double precio;
    //private String[][] asientos; 
    //private Map<String, Espectador> sala = AsientoService.crearSala();

    public Cine() {
    }

    public Cine(Pelicula pelicula, Double precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

//    public Map<String, Espectador> getSala() {
//        return sala;
//    }
//
//    public void setSala(Map<String, Espectador> sala) {
//        this.sala = sala;
//    }
    
}