/*
Crear una superclase llamada Electrodomestico con los siguientes atributos:
precio base, color, consumo energético (letras entre A y F) y peso. Por defecto, el
color será blanco, el consumo energético sera F, el precioBase de $1000 y el peso
de 5 kg. Los colores disponibles para los electrodomésticos son blanco, negro,
rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.

Los constructores que se deben implementar son los siguientes:
• Un constructor por defecto.
• Un constructor con el precio y peso. El resto de los atributos por defecto.
• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumo: comprueba que la letra es correcta, sino es correcta usara la letra por defecto. 
Este método se debe invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color por defecto. Este método se invocará al crear el objeto
y no será visible.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el precio. 

Esta es la lista de precios:
LETRA PRECIO      ||     TAMAÑO PRECIO
A $1000           ||     Entre 0 y 19 kg $100
B $800            ||     Entre 20 y 49 kg $500
C $600            ||     Entre 50 y 79 kg $800
D $500            ||     Mayor que 80 kg $1000
E $300            ||
F $100            ||
----
A continuación, se debe crear una subclase llamada Lavadora con el atributo
carga, además de los atributos heredados. Por defecto, la carga es de 5 kg.
Los constructores que se implementarán serán:
• Un constructor por defecto.
• Un constructor con el precio y peso. El resto por defecto.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método precioFinal(): si tiene una carga mayor de 30 kg, aumentará el precio
en $500, si la carga es menor o igual, no se incrementará el precio. Este
método debe llamar al método padre y añadir el código necesario. Recuerda
que las condiciones que hemos visto en la clase Electrodoméstico también
deben afectar al precio.
----
• Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
los atributos heredados. Por defecto, la resolución será de 20 pulgadas y el
sintonizador será false.

Los constructores que se implementarán serán:
• Un constructor por defecto.
• Un constructor con el precio y peso. El resto por defecto.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método precioFinal(): si el televisor tiene una resolución mayor de 40
pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT
incorporado, aumentará $500. Recuerda que las condiciones que hemos visto
en la clase Electrodomestico también deben afectar al precio.
----
Finalmente, se debe crear una clase ElectrodomesticoService que realice lo siguiente:
Crear un array de Electrodomesticos de 10 posiciones. Asignar a cada posición
un objeto de las clases anteriores con los valores que desees.
Luego, recorrer este array y ejecutar el método precioFinal(). Se deberá también
mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores, por un lado, el de las lavadoras por otro, y la suma de todos los
Electrodomesticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/

package E5.Clases;

public class Lavadora extends Electrodomestico{
    
    private Integer carga;
    
    //creamos los mismos 3 constructores de la super clase pero con herencia (alt+ins), Y LE AGREGAMOS EL ATRIBUTO CARGA A LOS MISMOS!!!
    //también getter y setter del nuevo atributo (SÓLO DE ESE)

    public Lavadora() {
        super();    //agregar también ya que no viene por defercto (creo que no es necesario, preguntar)
        this.carga = 5;    //lo nuevo que se les agrega
    }

    public Lavadora(Integer carga, Integer precioBase, Integer peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(Integer carga, Integer precioBase, String color, String consumo, Integer peso) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public Integer getPrecioFinal() {
        
        Integer precio = super.getPrecioFinal();
        
        if (this.carga > 30) {
            this.precioFinal = precio + 500;
        } else if (this.carga <= 30) {
            this.precioFinal = precio;
        }
        
        return this.precioFinal;
    }
    
}
