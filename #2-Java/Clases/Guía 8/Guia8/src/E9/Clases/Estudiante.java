/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad
que gestione la información sobre las personas vinculadas con la misma y que se
pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. A
continuación, se detalla qué tipo de información debe gestionar esta aplicación:

• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
de identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta
aplicación. A continuación, debe programar las clases definidas en las que,
además de los constructores, hay que desarrollar los métodos correspondientes
a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa
de prueba que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
*/

package E9.Clases;

import java.util.Scanner;

public class Estudiante extends Persona{
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private String curso;
    
    public Estudiante() {    //agregar super();
        super();
    }

    public Estudiante(String curso) {    //respectivo constructor de la clase
        this.curso = curso;
    }

    public Estudiante(String curso, String nombreYapellido, Integer id, String estadoCivil) {    //constructor con atributos padre
        super(nombreYapellido, id, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Estudiante matriculacionEstudiante(){    //puse "Integer" y no es compatible con el retorno, por lo tanto se corrige con "public Estudiante...."
        System.out.print("Ingrese nombre y apellido del estudiante -> ");
        nombreYapellido = sc.next();
        System.out.print("Ingrese el ID del estudiante -> ");
        id = sc.nextInt();
        System.out.print("Ingrese el estado civil del estudiante -> ");
        estadoCivil = sc.next();
        System.out.print("Ingrese el curso del estudiante -> ");
        curso = sc.next();
        
        lista.add(this);
        
        return this;
    }

    @Override
    public String toString() {
        super.toString();
        return "\nSECCION ESTUDIANTES"+"\n"
             +"Nombre y apellido: "+nombreYapellido+"\n"
             + "ID: "+id+"\n"
             + "Curso: "+curso;
    }
}
