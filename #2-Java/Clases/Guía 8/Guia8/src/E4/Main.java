/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
Crear un método abstracto en la clase Animal a través del cual cada clase hija
deberá mostrar luego un mensaje por pantalla informando de que se alimenta.
Generar una clase Main que realice lo siguiente: "ejercicios_5_imagen.png".
*/

package E4;

public class Main {
    
    public static void main(String[] args) {
        
        Animal caballo = new Caballo("Spirit", 10, "Fino", "Hierbas y vegetales");    //necesario completar para que reconozca el constructor
        System.out.println("Animal: Caballo\n"
        +"Nombre: "+caballo.getNombre()+"\n"
        +"Edad: "+caballo.getEdad()+" años\n"
        +"Raza: "+caballo.getRaza()+"\n"
        +"Alimento: "+caballo.Alimentarse()+"\n");    //llamo al método encargado de la alimentación
        
        Animal gato = new Gato("Spirit", 2, "Siamés", "Carne vacuna y pescado");
        System.out.println("Animal: Gato\n"
        +"Nombre: "+gato.getNombre()+"\n"
        +"Edad: "+gato.getEdad()+" años\n"
        +"Raza: "+gato.getRaza()+"\n"
        +"Alimento: "+gato.Alimentarse()+"\n");
        
        Animal perro = new Perro("Apolo", 3, "Boxer", "Omnívoro");
        System.out.println("Animal: Perro\n"
        +"Nombre: "+perro.getNombre()+"\n"
        +"Edad: "+perro.getEdad()+" años\n"
        +"Raza: "+perro.getRaza()+"\n"
        +"Alimento: "+perro.Alimentarse());
        
        //NOTA: Se puede crear el objeto también -> Caballo caballo = new Caballo(...);
    }
}
