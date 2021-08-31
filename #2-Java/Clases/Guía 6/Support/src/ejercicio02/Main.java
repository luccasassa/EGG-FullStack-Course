/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Radio para calcular su area y perímetro");
        double n = leer.nextDouble();

        Circunferencia circunf = new Circunferencia(n);

        circunf.setRadio(n);
        System.out.println("Radio Ingresado: " + circunf.getRadio());
        System.out.println("Su Area es: " + circunf.calcularArea());
        System.out.println("Su Perimetro: " + circunf.calcularPerim());

    }

}
