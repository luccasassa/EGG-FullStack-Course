package ejercicio27;

public class Revolver {

    private Integer posTambor;
    private Integer posBala;
    
    public Boolean disparar() {
        return (posTambor == posBala);
    }
    
    public Integer siguienteBala() {
        return posTambor++;
    }

    public Integer getPosTambor() {
        return posTambor;
    }

    public void setPosTambor(Integer posTambor) {
        this.posTambor = posTambor;
    }

    public Integer getPosBala() {
        return posBala;
    }

    public void setPosBala(Integer posBala) {
        this.posBala = posBala;
    }

    
    @Override
    public String toString() {
        return "Revolver{" + "Posicionn del tambor=" + posTambor + ", Posicion de la Bala=" + posBala + '}';
    }
    
    
}
