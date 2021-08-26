/*
Se plantea desarrollar un programa que permita representar la siguiente
situación.
Un polideportivo es al mismo tiempo una instalación deportiva y un edificio; y lo
que interesa conocer es la superficie que tiene y los tipos de polideportivos. Un
edificio de oficinas es un edificio; interesa conocer la superficie que tiene.
Para lograr ésto vamos a tener que crear una interfaz Instalacion-Inteface con un
método int tipoDeInstalacion() y una interfaz Edificio con un metodo double
calcularSuperficie(). Luego crearemos una clase Polideportivo con sus atributos
largo, ancho, nombre y tipo de instalación que puede ser Techado o Abierto, esta
clase implementará las dos interfaces. Además, vamos a crear una clase
EdificioDeOficinas con sus atributos número de oficinas, ancho, largo y numero
de pisos. Esta clase solo implementará la interfaz Edificio.
Por ultimo, crear una clase Test con el método main y dos ArrayList. El primer
ArrayList debe contener tres polideportivos, y el segundo, dos edificios de
oficinas. Utilizar un iterator para recorrer las colecciones y utilizar el método
tipoDeInstalación() para saber cuantos polideportivos son techados y cuantos
abiertos. Además usaremos el método calcularSuperficie(), para calcular la
superficie de todos los polideportivos como de todos los edificios de oficina.
Una vez realizado el ejercicio responda: ¿Entre qué clases existe una relación que
se asemeja a la herencia múltiple?
¿Querés saber más de interfaces? link 1 – link 2
*/

package E7.Clases;

public class Polideportivo implements Instalacion_Interface{    //DATO: se pueden importar más de 1 interfaz

    private String nombre;

    public Polideportivo() {
    }

    public Polideportivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String tipoDeInstalacion() {
        return "Polideportivo ";
    }
}
