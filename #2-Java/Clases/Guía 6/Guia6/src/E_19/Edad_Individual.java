/*
Calcular edad con fecha de nacimiento.
*/

package E_19;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Edad_Individual {
    
    public static void main(String[] args) {
        
        Calendar fechaNac = new GregorianCalendar(2001,01,25);
        Calendar Hoy = Calendar.getInstance();
        
        int yearNac = fechaNac.get(Calendar.YEAR);
        int monthNac = fechaNac.get(Calendar.MONTH);
        int dayNac = fechaNac.get(Calendar.DAY_OF_MONTH);
        
        int yearHoy = Hoy.get(Calendar.YEAR);
        int monthHoy = Hoy.get(Calendar.MONTH);
        int dayHoy = Hoy.get(Calendar.DAY_OF_MONTH);
        
        System.out.println("Años de viejo: "+(yearHoy - yearNac)+"\n"
                        +"Meses de viejo: "+(monthHoy - monthNac)+"\n"
                        +"Días de viejo: "+(dayNac - dayHoy));
    }
}
