/*

 */

package Ejercicioo10;

public class Servicios {
    
    public static boolean acomodarAño(Fecha fecha1){
        boolean ano;
        ano = (fecha1.getAño()%4)%4==0 && (fecha1.getAño()%100)==0;        
        return ano;
    }
    
    public static String diasTranscurridos(Fecha fecha1, Fecha fechaPred){
        String diferencia;
        diferencia = "Transcurrieron " + (fecha1.getDia()-fechaPred.getDia())+" dias, "+(fecha1.getMes()-fechaPred.getMes())
                +" meses y "+(fecha1.getAño()-fechaPred.getAño()) + " años desde la fecha predeterminada.";       
        return diferencia;
    }
    
    public static String Siguiente(Fecha fecha1){
        String sig;
        if (fecha1.getDia()>30){
            if (fecha1.getMes()>11){
                sig = "La fecha siguiente es 1/1/"+ (fecha1.getAño()+1);
            } else {
                sig = "La fecha siguiente es 1/" + (fecha1.getMes()+1) + "/" + fecha1.getAño();
            }
        }else {
            sig = "La fecha siguiente es " + (fecha1.getDia()+1) + "/" + fecha1.getMes() + "/" + fecha1.getAño();
        }               
        return sig;
    }
    
    public static String Anterior(Fecha fecha1){
        String ant;
        if (fecha1.getDia()==1){
            if (fecha1.getMes()==1){
                ant = "La fecha anterior es 31/12/"+ (fecha1.getAño()-1);
            } else {
                ant = "La fecha anterior es 31/" + (fecha1.getMes()-1) + "/" + fecha1.getAño();
            }
        }else {
            ant = "La fecha anterior es " + (fecha1.getDia()-1) + "/" + fecha1.getMes() + "/" + fecha1.getAño();
        }               
        return ant;                
    }
}
