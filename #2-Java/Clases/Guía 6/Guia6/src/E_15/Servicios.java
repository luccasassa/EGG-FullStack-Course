/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
de String) y su longitud. La clase deber tener un constructor mediante el cual se
inicialice la frase, con una o más palabras ingresadas por el usuario (separadas
entre sí por un espacio en blanco) y se inicialice de manera automática su
longitud. Deberá además implementar los siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(), deberá recibir por parámetro un carácter ingresado por el
usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca", car = 'a', Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(), deberá comparar la longitud de la frase que compone
la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(), deberá unir la frase contenida en la clase Cadena con una
nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(), deberá reemplazar todas las letras “a” que se encuentren en la
frase, por algún otro carácter seleccionado por el usuario.
*/

package E_15;

public class Servicios {
    
    public void mostrarVocales(Cadena objeto1){
        String buscarVocal=objeto1.getFrase1().toLowerCase();
        int c = 0;
        System.out.println("\nConteo de vocales ¬");
        
        for (int i = 0; i < objeto1.getFrase1().length(); i++) {
            if (buscarVocal.charAt(i)=='a' || buscarVocal.charAt(i)=='e' || buscarVocal.charAt(i)=='i' || buscarVocal.charAt(i)=='o' || buscarVocal.charAt(i)=='u'){
                c++;
            }
        }
        System.out.println("Hay un total de "+c+" vocales en la frase");
    }
    
    public void invertirFrase(Cadena objeto1){
        int longitud = objeto1.getFrase1().length();
        System.out.println("\nFrase invertida ¬");
        
        for (int i=longitud-1; i>=0; i--) {
            System.out.print(objeto1.getFrase1().substring(i,i+1));
        }
        System.out.println("");
    }
    
    public int vecesRepetido(Cadena objeto1, char letra){
        int c = 0;
        for (int i = 0; i < objeto1.getFrase1().length(); i++) {
            if(objeto1.getFrase1().charAt(i)==letra){
                c++;
            }
        }
        return c;
    }
    
    public void compararLongitud(Cadena objeto1){
        int longitud1 = objeto1.getFrase1().length();
        int longitud2 = objeto1.getFrase2().length();
        
        System.out.println("\nComparando longitudes ¬");
        System.out.println("'"+objeto1.getFrase1()+"' contiene ("+longitud1+") caracteres");
        System.out.println("'"+objeto1.getFrase2()+"' contiene ("+longitud2+") caracteres");
        
        if(longitud1>longitud2){
            System.out.println("Por lo tanto la primera frase es más larga que la segunda");
        }else if(longitud2>longitud1){
            System.out.println("Por lo tanto la segunda frase es más larga que la primera");
        }else if(longitud1==longitud2){
            System.out.println("Por lo tanto ambas frases son igual de largas");
        }
    }
    
    public void unirFrases(Cadena objeto1){
        System.out.println("Uniendo frases ¬");
        System.out.println(objeto1.getFrase1().concat(objeto1.getFrase2()));
    }
    
    public void reemplazar(Cadena objeto1, String simbolo){
        String minus = objeto1.getFrase1().toLowerCase();
        String reemplazo = "";
        for (int i = 0; i <objeto1.getFrase1().length(); i++) {
            reemplazo = minus.replace("a", simbolo);
        }
        System.out.println("'"+reemplazo+"'");
    }
}
