/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
Crear un método abstracto en la clase Animal a través del cual cada clase hija
deberá mostrar luego un mensaje por pantalla informando de que se alimenta.
Generar una clase Main que realice lo siguiente: "ejercicios_5_imagen.png".
*/

package E4;

public class Perro extends Animal{    //clase hija hereda los atributos de la clase padre (se debe crear un constructor de los mismos acá también)
    
    public Perro(String nombre, Integer edad, String raza, String alimento) {    //borrar el constructor vacío y dejar éste
        super(nombre, edad, raza, alimento);
    }

    @Override
    public String Alimentarse() {    //se genera solo a partir del método en la clase Animal
        return alimento;    //al ser atributo "protected" no necesita el get ni el set para invocarlo
    }
}
