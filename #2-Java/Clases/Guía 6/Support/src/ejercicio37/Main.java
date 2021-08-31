/*
Extender el ejercicio anterior incluyendo una clase que represente al centro
docente. Esa clase incluirá 3 contenedores, uno por cada tipo de persona
vinculada con el centro. En una primera fase deben incluirse los siguientes
métodos:    
• Uno para dar de alta una persona, que incorporará a la persona en la lista
correspondiente.
• Otro para dar de baja una persona, dado su DNI. Añada un método a la clase
persona para poder obtener el DNI de un objeto de esa clase.
• Uno último para imprimir toda la información de las personas vinculadas con el
centro.
Dado que hay múltiples alternativas a la hora de afrontar este problema, a
continuación, se explican las características de la solución implementada, aunque
el alumno podrá realizar el diseño que considere oportuno:
• Se usan como contenedores listos de estudiantes, profesores y personal de
servicio, respectivamente.
• El método de alta recibe como parámetro un objeto del tipo persona
correspondiente, existiendo, por tanto, tres versiones sobrecargadas del mismo.
• Cada versión del método crea un objeto del tipo que le corresponde y lo inserta
en la lista.
• El método de baja busca, en primer lugar, un objeto en las listas que tenga el DNI
recibido como parámetro. Una vez encontrado, lo elimina de la lista
 */
package ejercicio37;

import java.util.ArrayList;


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

        ArrayList<Persona> listaCompleta = MenuFacultad.crearListaDePersonas();
        MenuFacultad.menu(listaCompleta);
    } 
}
