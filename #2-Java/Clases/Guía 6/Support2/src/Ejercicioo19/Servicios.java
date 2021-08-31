/*


 */

package Ejercicioo19;

import java.util.Scanner;

public class Servicios {
    Scanner sc =  new Scanner(System.in).useDelimiter("\n");
    
    public static String calcularEdad(Persona persona1, Persona personaHoy){
        String edad;
        int año, mes, dia;
        año = 0;
        mes = 0;
        dia = 0;
        do {
            if (personaHoy.getDia()<persona1.getDia()){
                persona1.setMes(persona1.getMes()-1);
                persona1.setDia(persona1.getDia() + 30);
            }
        }while (personaHoy.getDia()<persona1.getDia());
        do {
            if (personaHoy.getMes()<persona1.getMes()){
                persona1.setAño(persona1.getAño()-1);
                persona1.setMes(persona1.getMes()+12);                
            }
        }while(personaHoy.getMes()<persona1.getMes());
        
        año = personaHoy.getAño()-persona1.getAño();
        mes = personaHoy.getMes()-persona1.getMes();
        dia = personaHoy.getDia()-persona1.getDia();
        edad = "Tiene " + año + " años, " + mes + " meses y " + dia + " dias.";
        return edad;
    }
    
    public static boolean menorQue(Persona persona1, Persona persona2){
        boolean resp;
        if (persona1.getAño()>persona2.getAño()){
            resp = true;
        }else{
            if(persona1.getMes()>persona2.getMes()){
                resp = true;
            }else{
                if(persona1.getDia()>persona2.getDia()){
                    resp = true;
                }else{
                    resp = false;
                }
            }
        }               
        return resp;
    }
    
}
