/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento, por lo que debe ser posible pedirle su nombre, fecha de nacimiento y edad.
• Métodos get y set para llenar el objeto en el Main.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe conocer la fecha actual.
• Agregar a la clase el método menorQue(Persona persona) que recibe como
parámetro a otra persona y retorna true en caso de que el receptor tenga menor
edad que la persona que se recibe como parámetro, o false en caso contrario.
• Agregar un método de creación del objeto que respete la siguiente firma:
Persona(String nombre, Date fechaNacimiento). Este método recibe como
parámetros el nombre y la fecha de nacimiento de la persona a crear y retorna un objeto inicializado con los valores recibidos como parámetro.
*/

package E_19;

public class Servicios {
    public void calcularEdad(Persona objeto1){
        int año=0, mes=0, dia=0;
        
        do {
            if (26<objeto1.getDay()){
                objeto1.setMonth(objeto1.getMonth()-1);
                objeto1.setDay(objeto1.getDay() + 30);
            }
        }while (26<objeto1.getDay());
        do {
            if (4<objeto1.getMonth()){
                objeto1.setYear(objeto1.getYear()-1);
                objeto1.setMonth(objeto1.getMonth()+12);
            }
        }while(4<objeto1.getMonth());
        
        año = 2021 - objeto1.getYear();
        mes = 4 - objeto1.getMonth();
        dia = objeto1.getDay() - 18;
        
        System.out.println("Tenés "+año+" año/s, "+ mes+" mes/es y "+dia+" dia/s de viejo.");
    }
    
    public void menorQue(Persona objeto1, Persona objeto2){
        boolean mayormenor;
        
        if(objeto1.getYear()>objeto2.getYear()){
            mayormenor=true;
        }else{
            if(objeto1.getMonth()>objeto2.getMonth()){
                mayormenor=true;
            }else{
                if(objeto1.getDay()<objeto2.getDay()){
                    mayormenor=true;
                }else{
                    mayormenor=false;
                }
            }
        }
        
        if(mayormenor){
            System.out.println("Según los cálculos: sos mayor que "+objeto2.getNombre());
        }else{
            System.out.println("Según los cálculos: sos menor que "+objeto2.getNombre());
        }   
    }
}
