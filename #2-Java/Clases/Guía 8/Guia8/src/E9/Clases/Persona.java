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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {    //clase abuelo
    
    protected String nombreYapellido;
    protected Integer id;
    protected String estadoCivil;
    protected List<Persona> lista = new ArrayList<>();
    
    protected Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombreYapellido, Integer id, String estadoCivil) {
        this.nombreYapellido = nombreYapellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
    
    public String cambioEstadoCivil(){
        System.out.print("Ingrese el nuevo estado civil -> ");
        estadoCivil = sc.next();
        
        return estadoCivil;
    }

    @Override
    public String toString() {
        return "\nDATOS PERSONALES"+"\n"
              +"Nombre y Apellido: "+nombreYapellido+"\n"
              +"ID: "+id+"\n"
              +"Estado Civil: "+estadoCivil;
    }
}
