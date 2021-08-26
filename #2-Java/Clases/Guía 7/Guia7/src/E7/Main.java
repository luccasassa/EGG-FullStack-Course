/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página: https://mapanet.eu/index.htm. 
Nota: Poner el código postal sin la letra,solo el numero.

• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos.
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Después editar el código postal que buscó el usuario.
• Muestra por pantalla los datos.
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos.
*/

package E7;

public class Main {
    
    public static void main(String[] args) {
        Servicios objeto0 = new Servicios();
        
        objeto0.menu();
    }
}
