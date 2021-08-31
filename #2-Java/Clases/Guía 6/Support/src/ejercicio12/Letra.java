/*
Dígito Verificador. Crear una clase Letra que se usará para mantener DNIs con su
correspondiente letra. Los atributos serán el número de DNI (entero largo) y la letra
que le corresponde. La clase dispondrá de los siguientes métodos:
• Constructor predeterminado que inicialice el nº de DNI a 0 y la letra a espacio en
blanco (será un NIF no válido).
• Constructor que reciba el DNI y establezca la letra que le corresponde.
• Métodos getters y setters para el número de DNI (que ajuste también
automáticamente la letra).
• Método leer(): para pedir el número de DNI (ajustando automáticamente la letra)
• Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a través de un método
que funciona de la siguiente manera: Para calcular la letra se toma el resto de
dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El
método debe buscar en un array de caracteres la posición que corresponda al
resto de la división para obtener la letra correspondiente. La tabla de caracteres
es la siguiente:
POSICIÓN LETRA
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E
 */

package ejercicio12;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Letra {
    
    private Integer dni;
    private char letter;

    public Letra() {
        dni=0;
        letter=' ';
    }

    public Letra(Integer dni) {
        this.dni = dni;
        this.letter=digitoVerificador();
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = digitoVerificador();
    }
    
    public char digitoVerificador() {
        Integer resto=dni%23;
        char[] vectorL = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        //letter = 
        return vectorL[resto];
        
        //return letter;
    }
    
    public void leer() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un DNI");
        dni = leer.nextInt();
        letter = digitoVerificador();
    }
    
    public void nif() {
        String nif = dni.toString();    //getDni()
        if (nif.length() < 8) {
            int dif = 8 - nif.length();
            for (int i = 0; i < dif; i++) {
                System.out.print("0");
            }
            System.out.print(nif + "-" + letter);
            //456.345 = 00456345-(char)  
        } else {
            System.out.println(nif + "-" + letter);
        } 
        System.out.println("");
    }
}
