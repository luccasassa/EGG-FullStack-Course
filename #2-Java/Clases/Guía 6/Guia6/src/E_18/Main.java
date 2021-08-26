/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un
arreglo de 50 números reales, y el segundo, un arreglo de 20 números, también
reales. El programa deberá inicializar el arreglo con números aleatorios y
mostrarlo por pantalla. Luego, el arreglo se debe ordenar de menor a mayor y
copiar los primeros 10 números ordenados al segundo arreglo de 20 elementos,
y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos
resultantes: el ordenado de 50 elementos y el combinado de 20.
*/

package E_18;

public class Main {
    
    public static void main(String[] args) {
        Arreglos objeto1 = new Arreglos();
        Servicios objeto2 = new Servicios();
        
        objeto2.inicializarAleatoriamente(objeto1);
        objeto2.ordenar(objeto1);
        objeto2.copiar(objeto1);
        objeto2.imprimir(objeto1);
    }
}
