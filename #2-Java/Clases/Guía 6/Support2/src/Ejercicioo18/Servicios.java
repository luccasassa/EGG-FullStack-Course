/*

copiar los primeros 10 números ordenados al segundo arreglo de 20 elementos,
y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos
resultantes: el ordenado de 50 elementos y el combinado de 20.
 */

package Ejercicioo18;

public class Servicios {
    
    public static void Rellenar(Arreglos arrays){        
        for (int i=0;i<50;i++){
            arrays.getArray1()[i]=(int) (Math.random()*100);
        }
        for (int i=0;i<20;i++){
            arrays.getArray2()[i]=(int) (Math.random()*100);
        }
    }
    
    public static void Mostrar(Arreglos arrays){
        for (int i=0;i<50;i++){
            System.out.print(arrays.getArray1()[i] + ", ");
        }
        System.out.println("");
        for (int i=0;i<20;i++){
            System.out.print(arrays.getArray2()[i] + ", ");
        }       
    }
    
    public static void Ordenar(Arreglos arrays){
        for (int i=0;i<50;i++){
            for (int k=1;k<50;k++){
                if (arrays.getArray1()[k]<arrays.getArray1()[k-1]){
                    int guardar = arrays.getArray1()[k-1];
                    arrays.getArray1()[k-1]=arrays.getArray1()[k];
                    arrays.getArray1()[k]=guardar;
                }
            }            
        } 
        for (int i=0;i<20;i++){
            for (int k=1;k<20;k++){
                if (arrays.getArray2()[k]<arrays.getArray2()[k-1]){
                    double guardar = arrays.getArray2()[k-1];
                    arrays.getArray2()[k-1]=arrays.getArray2()[k];
                    arrays.getArray2()[k]=guardar;
                }
            }            
        }
    }
    
    public static void MostrarOrden(Arreglos arrays){
        System.out.println("");
        for (int i=0;i<50;i++){            
            System.out.print(arrays.getArray1()[i] + ", ");
        }
        System.out.println("");
        for (int i=0;i<20;i++){            
            System.out.print(arrays.getArray2()[i] + ", ");
        }
    }
    
    public static void Reemplazar(Arreglos arrays){
        for (int i=0;i<10;i++){
            arrays.getArray2()[i]=arrays.getArray1()[i];
        }
        for (int i=10;i<20;i++){
            arrays.getArray2()[i]=0.5;
        }
        System.out.println("vector de 20 reemplazado");
        for (int i=0;i<20;i++){
            System.out.print(arrays.getArray2()[i] + ", ");
        }
        System.out.println("");
    }
    
}
