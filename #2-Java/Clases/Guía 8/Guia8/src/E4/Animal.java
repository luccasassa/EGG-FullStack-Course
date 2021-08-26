/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
Crear un método abstracto en la clase Animal a través del cual cada clase hija
deberá mostrar luego un mensaje por pantalla informando de que se alimenta.
Generar una clase Main que realice lo siguiente: "ejercicios_5_imagen.png".
*/

package E4;

public abstract class Animal {    //se coloca solo el "abstract" descpués de crear el método
    
    protected String nombre;    //"protected" para indicar que es una clase padre. También sirve para heredar sus atributos a sus clases hijas
    protected Integer edad;
    protected String raza;
    protected String alimento;

    public Animal() {
        
    }

    public Animal(String nombre, Integer edad, String raza, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.alimento = alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public abstract String Alimentarse();    //lo exige la consigna
    
}
