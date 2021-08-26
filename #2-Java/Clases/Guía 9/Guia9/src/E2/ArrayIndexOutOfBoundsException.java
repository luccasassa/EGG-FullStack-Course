/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de matriz fuera de rango).
*/

package E2;

public class ArrayIndexOutOfBoundsException {
    
    public static void main(String[] args) {
        
        int array [] = new int[5];
        
        try{
            array[0] = 0;
            array[1] = 1;
            array[2] = 2;
            array[3] = 3;
            array[4] = 4;
            array[5] = 5;
        }catch (Exception e) {
            //System.out.println(e.getClass().getSimpleName());
            System.err.println("Exception -> "+e.getClass());    //mostrar exception
        }finally{
            System.out.println("FINALLY TEXT");    //se muestra antes que la exception solamente por el "System.err.println..."
        }
    }
}
