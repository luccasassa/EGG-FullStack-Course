/*
Se necesita implementar un sistema en el que se puedan cargar alumnos, a los
cuales los caracterizan el nombre y apellido, el número de legajo, el sexo,
condición (regular o condicional) y la nota final. Estos alumnos se deben cargar
en una asignatura, llamada Curso Programación Egg. Implemente las clases y
métodos necesarios para esta situación, teniendo en cuenta lo que se pide a
continuación:
• Mostrar en pantalla todos los alumnos que se encuentren en la asignatura.
• Mostrar en pantalla los alumnos que se encuentren como condicional y su
cantidad.
• Ordenar los alumnos de acuerdo a su nota (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar los alumnos de acuerdo a su nota (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar los alumnos por nombre y apellido y mostrarlo en pantalla

Nota: para los ordenamientos utilizar las facilidades provistas por la plataforma
Java.
*/

package E4;

public class Main {
    
    public static void main(String[] args){
        Servicios objeto2 = new Servicios();
        
        objeto2.menu();
    }
}
