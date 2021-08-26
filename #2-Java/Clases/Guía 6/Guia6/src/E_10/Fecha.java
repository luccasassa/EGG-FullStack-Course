/*
Crear una clase Fecha con atributos para el día, mes y año. Se debe incluir al
menos los siguientes métodos:

• Constructor predeterminado con el 1-1-1900 como fecha por defecto
• Constructor parametrizado con día, mes y año ingresados por el usuario.
• Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a 2050).
• Método bisiesto() para indicar si el año es bisiesto o no.
• Método diasMes(int) para devolver el número de días del mes indicado (para el año
de la fecha).
• Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-12-
2050). Si el día no es correcto, se pondrá en 1; si el mes no es correcto se pondrá en
1; y si el año no es correcto lo pondrá en 1900. Esto último se realizará mediante los
métodos setters de cada atributo. Los setters también se llamarán en el constructor
parametrizado y en el método leer().
• Método diasTranscurridos() para devolver la cantidad de días transcurridos desde el
1-1-1900 hasta la fecha ingresada por el usuario.
• Método diasEntre(Fecha) para devolver el número de días entre la fecha ingresada
por el usuario y la proporcionada como parámetro.
• Método siguiente() para devolver el día siguiente del día de la fecha ingresada.
• Método anterior() para devolver el día anterior del día de la fecha ingresada.
*/

package E_10;

public class Fecha {
    private int day;
    private int month;
    private int year;
    
    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public Fecha() {
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }
    
}
