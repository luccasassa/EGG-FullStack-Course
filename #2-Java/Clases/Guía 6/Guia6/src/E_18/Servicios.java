/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un
arreglo de 50 números reales, y el segundo, un arreglo de 20 números, también
reales. El programa deberá inicializar el arreglo con números aleatorios y
mostrarlo por pantalla. Luego, el arreglo se debe ordenar de menor a mayor y
copiar los primeros 10 números ordenados al segundo arreglo de 20 elementos,
y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos
resultantes: el ordenado de 50 elementos y el combinado de 20.

https://www.discoduroderoer.es/metodos-java-util-arrays-java/
*/

package E_18;
import java.util.Arrays;
public class Servicios {
    
    public void inicializarAleatoriamente(Arreglos objeto1){
        //for (int i = 0; i < objeto1.getArray1().length; i++) {
        //    objeto1.getArray1()[i]=  Math.round((Math.random()*10)*100d)/100d;     //MANERA 1  
        //}
        for (int i=0; i<objeto1.getArray1().length; i++){
            objeto1.getArray1()[i] = (double) Math.round(Math.random()*1000)/100;    //MANERA 2 (sin "d", y casteando) (100 para cifras decimales, 1000 para potenciar la división "/100")
        }
    }
    
    public void ordenar(Arreglos objeto1){
        Arrays.sort(objeto1.getArray1());
    }
    
    public void copiar(Arreglos objeto1){
        //objeto1.setArray2(Arrays.copyOfRange(0, 20));
        //Arrays.fill(objeto1.getArray2(),10,20,0.5);    
        for(int i=0; i<10; i++){
            objeto1.getArray2()[i] = objeto1.getArray1()[i];
        }
        for(int i=10; i<20; i++){
            objeto1.getArray2()[i] = 0.5;
        }
    }
    
    public void imprimir(Arreglos objeto1){
        System.out.println("Array 1");
        for (int i=0; i<objeto1.getArray1().length; i++) {
            System.out.print("["+objeto1.getArray1()[i]+"]");
        }
        System.out.println("");
        
        System.out.println("\nArray 2");
        for (int i=0; i<objeto1.getArray2().length; i++) {
            System.out.print("["+objeto1.getArray2()[i]+"]");
        }
        System.out.println("");
    }
}
