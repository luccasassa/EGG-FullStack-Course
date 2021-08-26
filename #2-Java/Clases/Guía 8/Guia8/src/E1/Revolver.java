package E1;

public class Revolver {
    
    private Integer tambor;
    private Integer posicionActual;
    private Integer posicionBala;

    public Revolver() {
        this.tambor = 6;
    }

    public Revolver(Integer posicionActual, Integer posicionBala, Integer tambor) {
        this.posicionActual = posicionActual;
        this.posicionBala = posicionBala;
        this.tambor = tambor;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(Integer posicionBala) {
        this.posicionBala = posicionBala;
    }

    public Integer getTambor() {
        return tambor;
    }
   
    @Override
    public String toString() {
        return "Posicion Actual:" + posicionActual + "\nPosicion Bala:" + posicionBala + '}';
    }
}
