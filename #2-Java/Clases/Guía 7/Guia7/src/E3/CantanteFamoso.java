/*
Crear una clase llamada CantanteFamoso, esta clase guardará cantantes
famosos y tendrá como atributos el nombre y discoConMasVentas, y los
métodos getters y setters.
Se debe además crear una clase Test con el método main que inicialice un
arrayList listaCantantesFamosos y agregue manualmente 5 objetos de tipo
CantanteFamoso a la la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con más ventas por pantalla.

Además, se debe pedir al usuario un nombre y disco con más ventas de otro
cantante famoso, y una vez introducidos los datos mostrar la lista actualizada.
Una vez mostrada la lista actualizada, se debe dar opción a elegir entre volver a
introducir los datos de otro cantante, editar un cantante, eliminar un cantante o
salir del programa. Se podrán introducir tantos datos de cantantes como se
desee.
*/

package E3;

public class CantanteFamoso {
    
    private String nombre;
    private String disco;

    public CantanteFamoso(String nombre, String disco) {
        this.nombre = nombre;
        this.disco = disco;
    }

    public CantanteFamoso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
}
