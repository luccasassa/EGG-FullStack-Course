/*
Se plantea desarrollar un programa que permita representar la siguiente
situación.
Un polideportivo es al mismo tiempo una instalación deportiva y un edificio; y lo
que interesa conocer es la superficie que tiene y los tipos de polideportivos. Un
edificio de oficinas es un edificio; interesa conocer la superficie que tiene.
Para lograr esto vamos a tener que crear una interfaz InstalacionDeportiva con un
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

public class Oficina implements Edificio_Interface{    //es necesario para traer el método de "Edificio-Inteface"

    private Integer cantidadOficinas;
    private Integer base;
    private Integer altura;

    public Oficina() {
    }

    public Oficina(Integer cantidadOficinas, Integer base, Integer altura) {
        this.cantidadOficinas = cantidadOficinas;
        this.base = base;
        this.altura = altura;
    }

    public Integer getCantidadOficinas() {
        return cantidadOficinas;
    }

    public void setCantidadOficinas(Integer cantidadOficinas) {
        this.cantidadOficinas = cantidadOficinas;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    @Override
    public Integer superficieEdificio() {    //acá se plantea el método
        return base*altura;
    }
}
