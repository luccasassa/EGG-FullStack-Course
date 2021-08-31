/*
Crear una clase Fecha con atributos para el día, mes y año. Se debe incluir al
menos los siguientes métodos:
• Constructor predeterminado con el 1-1-1900 como fecha por defecto
• Constructor parametrizado con día, mes y año ingresados por el usuario.
• Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a
2050).
• Método bisiesto() para indicar si el año es bisiesto o no.
• Método diasMes(int) para devolver el número de días del mes indicado (para el
año de la fecha).
• Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-
12-2050). Si el día no es correcto, se pondrá en 1; si el mes no es correcto se
pondrá en 1; y si el año no es correcto lo pondrá en 1900. Esto último se realizará
mediante los métodos setters de cada atributo. Los setters también se llamarán en
el constructor parametrizado y en el método leer().
• Método diasTranscurridos() para devolver la cantidad de días transcurridos desde
el 1-1-1900 hasta la fecha ingresada por el usuario.
• Método diasEntre(Fecha) para devolver el número de días entre la fecha ingresada
por el usuario y la proporcionada como parámetro.
• Método siguiente() para devolver el día siguiente del día de la fecha ingresada.
• Método anterior() para devolver el día anterior del día de la fecha ingresada.
 */
package ejercicio10;

public class Main {

    public static void main(String[] args) {
        //  Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Dame una fecha y te saco altos calculos...");
        
        Fecha fecha = new Fecha();
        fecha.leer();
        if (fecha.validar()){
            System.out.println("La fecha es valida!");
        }else{
            System.out.println("La fecha es invalida, pillin!"+ fecha.getDia()+ "/" +fecha.getMes()+ "/" +fecha.getAnio());
        }
        
        System.out.println("Es bisiesto?? -"+fecha.bisiesto());
        
        System.out.println("Cuantos dias tiene tu mes? "+ fecha.diaMes(fecha.getMes()));
        
        System.out.println("Sabias que? Desde el 1/1/1900 hasta tu fecha, hay: "+ fecha.diasTranscurridos(fecha)+ " dias!");
        
        System.out.println("Y esto mejora! Desde tu fecha hasta el 1/1/1900, hay: "+fecha.diasEntre(fecha)+ "...(que sorpresa no?)");
        
        System.out.println("La fecha siguiente es: "+ fecha.siguiente(fecha));   
        System.out.println("La fecha anterior es: "+ fecha.anterior(fecha));
        
        System.out.println("Lo vemo!");
        
    }
    
}
