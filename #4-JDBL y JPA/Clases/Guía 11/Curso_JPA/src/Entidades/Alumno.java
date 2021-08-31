package Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alumno {
    
    @Id
    private Integer documento;
    private String nombre;
    private String apellido;
    private Integer edad;

    public Alumno() {
    }

    public Alumno(Integer documento, String nombre, String apellido, Integer edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Documento: "+documento+"\n"
             + "Nombre: "+nombre+"\n"
             + "Apellido: "+apellido+"\n"
             + "Edad: "+edad;
    }
}
