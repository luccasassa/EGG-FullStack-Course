/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos
constructores: un constructor vacío y otro con la hora, minutos y segundos
ingresado por el usuario. Deberá definir además, los métodos getters y setters
correspondientes, y el método imprimirHoraCompleta().
*/

package E5;

public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;
    
    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public Tiempo() {
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getHora() {
        return hora;
    }
    
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getMinutos() {
        return minutos;
    }
    
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public int getSegundos() {
        return segundos;
    }    
    
    public static String imprimirHoraCompleta(Tiempo objeto1){
        String resultado;
        int hs = objeto1.getHora();
        int min = objeto1.getMinutos();
        int seg = objeto1.getSegundos();
        resultado = hs+":"+min+":"+seg;
        return resultado;
    }
}
