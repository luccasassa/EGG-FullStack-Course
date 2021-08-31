/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio19;

import java.util.Calendar;
import java.util.Date;

public class PersonaService {
    //Metodo para convertir Date to calendar
    private Calendar dateToCalendar(Date fechaNac) {
        Calendar fechaN = Calendar.getInstance();
        fechaN.setTime(fechaNac);
        return fechaN;
    }
    
    public int calcularEdad(Persona p) {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(p.getFechaNac()); //convierto DATE a Calendar
        Calendar today = Calendar.getInstance();  //obtengo la fecha de hoy
        //resto al año de hoy, el año dado por el usuario
        p.setEdad(today.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR));
        return p.getEdad();
    }
    
    public Boolean menorQue(Persona p) {
      return true;  
    }

}
