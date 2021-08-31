/*
 Crear una clase llamada ListaCantantesFamosos que disponga de un atributo
ArrayList que contenga objetos de tipo CantanteFamoso.
La clase debe tener un método que permita añadir objetos de tipo
CantanteFamoso a la lista. La clase CantanteFamoso tendrá como atributos el
nombre y discoConMasVentas, y los métodos getters y setters.
Se debe además crear una clase Test con el método main que inicialice un objeto
ListaCantantesFamosos y agregue manualmente 5 objetos de tipo
CantanteFamoso a la la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con más ventas por pantalla. Además, se debe pedir al usuario
un nombre y disco con más ventas de otro cantante famoso, y una vez
introducidos los datos mostrar la lista actualizada. Una vez mostrada la lista
actualizada, se debe dar opción a elegir entre volver a introducir los datos de otro
cantante o salir del programa. Se podrán introducir tantos datos de cantantes
como se desee.
 */
package ejercicio22;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaCantantesFamosos obj = new ListaCantantesFamosos();
        obj.crearCantante("1", "Que se yo1");
        obj.crearCantante("2", "Que se yo2");
        obj.crearCantante("3", "Que se yo3");
        obj.crearCantante("4", "Que se yo4");
        obj.crearCantante("5", "Que se yo5");
        System.out.println("Esta es la lista actual");
        obj.mostrarLista();
        obj.pedirUsuario();
    }

}
