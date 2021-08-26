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

public class Alumnos {
    
    private String nombre;
    private String apellido;
    private Integer legajo;
    private String sexo;
    private String condicion;
    private Integer notafinal;

    public Alumnos(String nombre, String apellido, Integer legajo, String sexo, String condicion, Integer notafinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.sexo = sexo;
        this.condicion = condicion;
        this.notafinal = notafinal;
    }

    Alumnos() {
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

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(Integer notafinal) {
        this.notafinal = notafinal;
    }
    
    
}
