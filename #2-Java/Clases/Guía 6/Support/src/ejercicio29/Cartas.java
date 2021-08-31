package ejercicio29;

import java.util.Comparator;

public class Cartas {
    
    private Integer numero;
    private String palo;

    public Cartas() {
    }

    public Cartas(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public static Comparator<Cartas> ordenNum = new Comparator<Cartas>() {
        @Override
        public int compare(Cartas o1, Cartas o2) {
            return o2.getNumero().compareTo(o1.getNumero());
        }
    };
    @Override
    public String toString() {
        return "Numero=" + numero + " Palo=" + palo;
    }
    
    
}
