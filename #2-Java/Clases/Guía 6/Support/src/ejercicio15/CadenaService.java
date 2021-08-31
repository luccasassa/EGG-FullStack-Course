/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio15;


public class CadenaService {

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
    tiene la frase ingresada.*/
    public void mostrarVocables(Cadena frase) {
        String fraseMinus=frase.getFrase().toLowerCase();
        Integer cont=0;
        for (int i = 0; i < frase.getLongitud(); i++) {
//            if (fraseMinus.substring(i, i+1).equals('a')) cont ++; //esta bien            
            if (fraseMinus.charAt(i)=='a' ||fraseMinus.charAt(i)=='e'||fraseMinus.charAt(i)=='i'||fraseMinus.charAt(i)=='o'||fraseMinus.charAt(i)=='u') {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales.");
    }
    
    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrar la 
    frase invertida por pantalla. Por ejemplo: Entrada: "casa blanca", 
    Salida: "acnalb asac".*/
    public void invertirFrase(Cadena frase) {
        //String invertida="";
        System.out.print("La frase invertida queda asi: ");
        for (int i = frase.getLongitud()-1; i >= 0 ; i--) {
           //invertida = frase.getFrase().substring(i-1, i);
            System.out.print(frase.getFrase().substring(i, i+1));
        }
        System.out.println("");
    }

    /*Método vecesRepetido(), deberá recibir por parámetro un carácter 
    ingresado por el usuario y contabilizar cuántas veces se repite el carácter 
    en la frase, por ejemplo: Entrada: frase = "casa blanca", car = 'a', 
    Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(Cadena frase, char n) {
        int cont=0;
        for (int i = 0; i < frase.getFrase().length() ; i++) {
            //como el if no tiene else no necesita {}
            if (frase.getFrase().charAt(i)==n) cont++; 
            
        }
        System.out.println("El caracter " + n + " se repite " + cont + " veces.");
    }
    
    /*Método compararLongitud(), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.*/
    public Boolean compararLongitud(Cadena frase, Cadena frase2) {
        
        return (frase.getLongitud() == frase2.getLongitud());
    }
    
    /* Método unirFrases(), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase 
resultante.*/
    public String unirFrases(Cadena frase, Cadena frase2) {
        String unirFrases=frase.getFrase().concat(frase2.getFrase());
        return unirFrases;
    }
    /* Método reemplazar(), deberá reemplazar todas las letras “a” que se 
    encuentren en la frase, por algún otro carácter seleccionado por el usuario.*/
    public String reemplazar(Cadena frase, char n) {
        String minus=frase.getFrase().toLowerCase();
        String nuevaFrase = "";
        for (int i = 0; i < frase.getFrase().length(); i++) {
            //if (minus.substring(i, i+1).equals('a')) {
                nuevaFrase = minus.replace('a', n);
            //}
        }
        return nuevaFrase;
    }
}
