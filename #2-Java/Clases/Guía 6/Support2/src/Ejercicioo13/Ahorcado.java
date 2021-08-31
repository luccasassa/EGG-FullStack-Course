/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
contener un vector con la palabra a buscar y la cantidad jugadas máximas que
puede realizar el usuario. Definir los siguientes métodos con los parámetros que
sean necesarios:
• Un método para mostrar la longitud de la palabra que se debe encontrar.
• Un método para buscar si una letra ingresada por el usuario es parte de la palabra o
no.
• Un método para informar error o acierto.
• Un método para mostrar cuantas oportunidades le queda al jugador.
• Un método que al pedir ingresar una letra muestre que letras han sido encontradas y
en qué posición. Además, se debe mostrar también cuántas oportunidades quedan.
• Un método para buscar si se encontró la palabra completa.
• En el método main() se deberá pedir al usuario una letra hasta que el usuario haya
gastado todas sus oportunidades o bien hasta que encuentre la palabra.

 */

package Ejercicioo13;

public class Ahorcado {
    
    private String palabra;
    private String[] buscar;
    private int jugadas;
    private String letra;
    private int faltantes;
    private int encontradas;
    

    public Ahorcado(String[] buscar, int jugadas, String palabra, String letra) {
        this.buscar = buscar;
        this.jugadas = jugadas;
        this.palabra = palabra;
        this.letra = letra;
    }
    
    public Ahorcado(int faltantes, int encontradas) {
        this.faltantes = faltantes;
        this.encontradas = encontradas;
    }
    
    public Ahorcado(){    
    }
    
    public String[] getBuscar() {
        return buscar;
    }
    
    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }
    
    public int getJugadas() {
        return jugadas;
    }
    
    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
        this.buscar = new String[palabra.length()];
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(int faltantes) {
        this.faltantes = faltantes;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }
    
}
