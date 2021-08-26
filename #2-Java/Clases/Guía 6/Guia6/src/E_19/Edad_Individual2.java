package E_19;
import java.util.Calendar;
import java.util.GregorianCalendar;
 
public class Edad_Individual2 {
    
    public static void main(String[] args) {
        // Mostramos el resultado de llamar a la función calcular pasando
        // como parametro la fecha de nacimiento YYYY-MM-DD
        System.out.println(calcular(new GregorianCalendar(2001,01,25)));
    }
 
    public static int calcular(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();
 
        // Cálculo de las diferencias.
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
 
        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.
 
        if(months < 0 // Aún no es el mes de su cumpleaños
           || (months==0 && days < 0)) { // o es el mes pero no ha llegado el día.
            years--;
        }
        return years;
    }
}
