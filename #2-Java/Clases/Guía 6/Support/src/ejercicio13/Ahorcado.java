/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
contener un vector con la palabra a buscar y la cantidad jugadas máximas que
puede realizar el usuario. Definir los siguientes métodos con los parámetros que
sean necesarios:
• Un método para mostrar la longitud de la palabra que se debe encontrar.
• Un método para buscar si una letra ingresada por el usuario es parte de la palabra
o no.
• Un método para informar error o acierto.
• Un método para mostrar cuantas oportunidades le queda al jugador.
• Un método que al pedir ingresar una letra muestre que letras han sido encontradas
y en qué posición. Además, se debe mostrar también cuántas oportunidades
quedan.
• Un método para buscar si se encontró la palabra completa.
• En el método main() se deberá pedir al usuario una letra hasta que el usuario haya
gastado todas sus oportunidades o bien hasta que encuentre la palabra.
Un ejemplo de salida puede ser así:
*/

package ejercicio13;

import java.util.Scanner;

public class Ahorcado {
    
    private String[] palabra;
    private int jugadasMax;
    
    //private int encontrado;
    public Ahorcado() {
    }
    
    public Ahorcado(String palabra, int jugadasMax) {
        this.palabra = new String[palabra.length()];
        this.jugadasMax = jugadasMax;
        
        for (int i = 0; i < palabra.length(); i++) {
            this.palabra[i] = palabra.substring(i, i + 1);
        }
    }
    
    public String[] getPalabra() {
        return palabra;
    }
    
    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }
    
    public int getJugadasMax() {
        return jugadasMax;
    }
    
    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    //Un método para mostrar la longitud de la palabra que se debe encontrar.
    public void mostraraLongitud() {
        System.out.println("La palabra tiene " + palabra.length + " letras.");
    }
    
    //Un método para buscar si una letra ingresada por el usuario es parte de 
    //la palabra o no.
    public boolean buscar(String n) {
        boolean encontrado = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(n)) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }
    
    //Un método para informar error o acierto
    public void aciertos(String n) {
        if (buscar(n)) {
            System.out.println("Acertaste!");
        } else {
            System.out.println("Erraste!");
            jugadasMax--;
        }
    }
    
    //Un método para mostrar cuantas oportunidades le queda al jugador.
    public void oportunidades() {
        System.out.println("Oportunidades Restantes: " + jugadasMax);
    }
    
    //Un método que al pedir ingresar una letra muestre que letras han sido
    //encontradas y en qué posición. Además, se debe mostrar también cuántas
    //oportunidades quedan.
    //public void encontrado(String n) {
        
//        int encontradas = 0;
//        int faltantes = 0;
//        for (int i = 0; i < palabra.length; i++) {
//            if (buscar(n)) {
//                encontradas++;
//            } else {
//                faltantes++;
//            }
//        }
//        System.out.print(encontradas + "/" + faltantes);
//        System.out.println("");
//        System.out.print("Estado Actual: ");
//        for (int i = 0; i < palabra.length; i++) {
//            if (buscar(n)) {
//              System.out.print(palabra[i]);
//              break;
//          } else {
//              System.out.println("_");
//
//          }
//      }
//      oportunidades();
    //}
    
    //Un método para buscar si se encontró la palabra completa.
    public boolean completa(String[] n) {
        boolean completa = false;
        int cont = 0;
        for (int i = 0; i < n.length; i++) {
            cont = n[i].equals("_") ? cont : cont++;
        }
        completa = cont == n.length;
        return completa;
    }
    
    public void ingresar() {
        Scanner leer = new Scanner(System.in);
        String n;
        int hay = 0;
        int faltantes = 0;
        String[] encontradas = new String[palabra.length];
        for (int i = 0; i < encontradas.length; i++) {
            encontradas[i] = "_";
        }
        do {
            System.out.println("Ingrese una letra");
            n = leer.nextLine();
            aciertos(n);
            hay = 0;
            faltantes = 0;
            for (int i = 0; i < palabra.length; i++) {
                if (palabra[i].equals(n)) {
                    encontradas[i] = palabra[i];
                    //encontrado(l);
                    hay++;
                } else {
                    //encontradas[i] = "_ ";
                    // encontrado(l);
                    faltantes++;
                }
            }
            System.out.println("Encontradas/faltantes: " + hay + "/" + faltantes);
//            for (int i = 0; i < palabra.length; i++) {
//                if (buscar(l)) {
//                    hay++;
//                } else {
//                    faltantes++;
//                }
//            }
//            System.out.print(hay + "/" + faltantes);
            System.out.print("Estado Actual: ");
            for (int i = 0; i < palabra.length; i++) {
//                if (buscar(l)) {
                    System.out.print(encontradas[i]+" ");
                    //break;
//                } else {
//                    System.out.println("_");
//                }
            }
            System.out.println("");
            oportunidades();
            completa(encontradas);
        } while (jugadasMax > 0 || completa(encontradas) == false);

        if (completa(encontradas)) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Lo siento no mas oportunidades");
        }
    }
}
