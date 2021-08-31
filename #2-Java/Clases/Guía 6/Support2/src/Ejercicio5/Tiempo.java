/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos
constructores: un constructor vacío y otro con la hora, minutos y segundos
ingresado por el usuario. Deberá definir además, los métodos getters y setters
correspondientes, y el método imprimirHoraCompleta().
 */

package Ejercicio5;

public class Tiempo {

    
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Tiempo() {
    }
    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public String imprimirHoraCompleta(){
        String horacompleta;
        horacompleta = horas + ":" + minutos + ":" + segundos;
        return horacompleta;
    }
    
}
