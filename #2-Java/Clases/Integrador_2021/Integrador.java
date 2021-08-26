package Integrador_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D","A", "C", "D", "A"}));
        
        System.out.println("Número Palíndromo:");
        System.out.println(practica.numeroCapicua(1221L));
        
        System.out.println("\nPrisionero Dulces:");
        System.out.println(practica.prisioneroDulce(5,10,5));
        
        System.out.println("\nMedias Amigas:");
        System.out.println(practica.mediasAmigas(medias));
        
        System.out.println("\nMedias Amigas 2:");
        System.out.println(practica.mediasAmigas(medias));
    }
}
