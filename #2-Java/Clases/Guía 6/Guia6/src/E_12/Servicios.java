/*
Dígito Verificador. Crear una clase Letra que se usará para mantener DNIs con su
correspondiente letra. Los atributos serán el número de DNI (entero largo) y la
letra que le corresponde. La clase dispondrá de los siguientes métodos:
• Constructor predeterminado que inicialice el nº de DNI a 0 y la letra a espacio en
blanco (será un NIF no válido).
• Constructor que reciba el DNI y establezca la letra que le corresponde.
• Métodos getters y setters para el número de DNI (que ajuste también
automáticamente la letra).
• Método leer(): para pedir el número de DNI (ajustando automáticamente la letra)
• Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en mayúscula;
por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a través de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente.
*/

package E_12;

public class Servicios {
    
    public int leer(Letra objeto1){
        return objeto1.getDni();
    }
    
    public char nifLetra(Letra objeto1){
        Integer resto = objeto1.getDni()%23;
        char[] array = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return array[resto];
    }
    
    public void nifCeros(Letra objeto1){
        String id = objeto1.getDni().toString();
        if(id.length() < 8){
            int diferencia = 8 - id.length();
            for(int i=0; i<diferencia; i++){
                System.out.print("0");
            }
        }
    }
}
