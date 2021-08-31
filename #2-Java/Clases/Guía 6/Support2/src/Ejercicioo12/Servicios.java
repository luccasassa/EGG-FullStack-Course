
package Ejercicioo12;

public class Servicios {
    
    public static String AsignarLetra(Letra letra1){
        String[] array = new String[22];
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        for(int i=0;i<22;i++){
            array[i]=letras.substring(i,i+1);
        }
        
        //int num;
        //num = letra1.getDNI()%23;
        String asigna = array[letra1.getDNI()%23];
        return asigna;
    }
    
}
