/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
Crear un método abstracto en la clase Animal a través del cual cada clase hija
deberá mostrar luego un mensaje por pantalla informando de que se alimenta.
Generar una clase Main que realice lo siguiente:
 */
package ejercicio30;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal perro = new Perro("Stich",15,"Doberman","Carnivoro");
        System.out.println("Soy "+perro.getNombre()+". Soy un perro de raza "+perro.getRaza()+". Tengo "+perro.getEdad()+" años. "+perro.Alimentarse());
        
        Perro perro1 = new Perro("Teddy",10,"Chihuahua","Croquetas");
        System.out.println("Soy "+perro1.getNombre()+". Soy un perro de raza "+perro1.getRaza()+". Tengo "+perro1.getEdad()+" años. "+ perro1.Alimentarse());
        
        Animal gato = new Gato("Pelusa",15,"Siames","Galletas");
        System.out.println("Soy "+gato.getNombre()+". Soy un gato de raza "+gato.getRaza()+". Tengo "+gato.getEdad()+" años. "+ gato.Alimentarse());
        
        Animal caballo = new Caballo("Spark",25,"Fino","Pasto");
        System.out.println("Soy "+caballo.getNombre()+". Soy un caballo del tipo "+caballo.getRaza()+". Tengo "+caballo.getEdad()+" años. "+ caballo.Alimentarse());
    }
    
}
