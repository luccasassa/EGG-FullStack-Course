package ejercicio28;

import java.util.Comparator;

public class Asiento {

    private Integer numero;
    private String letra;
    private Boolean ocupado;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(Integer numero, String letra, Boolean ocupado, Espectador espectador) {
        this.numero = numero;
        this.letra = letra;
        this.ocupado = ocupado;
        this.espectador = espectador;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public static Comparator<Asiento> ordenNum = new Comparator<Asiento>() {
        @Override
        public int compare(Asiento o1, Asiento o2) {
            return o2.getNumero().compareTo(o1.getNumero());
        }
    };

    @Override
    public String toString() {
        return "Asiento{" + "numero=" + numero + ", letra=" + letra + ", ocupado=" + ocupado + ", espectador=" + espectador + '}';
    }
}
