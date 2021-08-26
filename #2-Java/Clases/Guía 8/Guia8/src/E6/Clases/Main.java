/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre y DNI del cliente, las fechas inicial y final de alquiler, la
posición del amarre y el barco que lo ocupará. Un Barco se caracteriza por: su
matrícula, su eslora en metros y año de fabricación. Un alquiler se calcula
multiplicando el número de días de ocupación (incluyendo los días inicial y final)
por un valor módulo de cada barco (obtenido simplemente multiplicando por 10
los metros de eslora) y por un valor fijo (2 es en la actualidad).
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros
• Potencia en CV para embarcaciones deportivas a motor
• Potencia en CV y número de camarotes para yates de lujo.
El módulo de los barcos de un tipo especial (ej. Velero) se obtiene como el
módulo normal más la suma de su atributo particular (ej. Número de mástiles)
Utilizando la herencia de forma apropiada, diseñe el diagrama de clases y sus
relaciones, con detalle de atributos y métodos necesarios. Luego, programe en
Java los métodos que permitan calcular el alquiler de cualquier tipo de barco.
*/

package E6.Clases;

public class Main {
    
    public static void main(String[] args) {
        
    }
}
