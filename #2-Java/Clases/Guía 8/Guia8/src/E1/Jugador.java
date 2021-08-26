package E1;

public class Jugador {
   
    private Integer jugadores;
    private Integer id;
    private String nombre;
    private Boolean vivo;

    public Jugador() {
        this.jugadores = 6;
        this.vivo = true;
        this.nombre = "No llegó a disparar";
    }

    public Jugador(Integer jugadores, Integer id, String nombre, Boolean vivo) {
        this.jugadores = jugadores;
        this.id = id;
        this.nombre = nombre;
        this.vivo = vivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        this.nombre = "Jugador - " + this.id;
        return nombre;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public Integer getJugadores() {
        return jugadores;
    }

    @Override
    public String toString() {
        return nombre+" - "+(vivo ? "Vivo":"\033[31m"+"Muerto");
    }
}
