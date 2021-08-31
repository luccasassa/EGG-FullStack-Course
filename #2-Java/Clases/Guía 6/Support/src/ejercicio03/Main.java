/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);

        System.out.println("Fracción 1");
        System.out.println("Ingrese el numerador");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el denominador");
        int den1 = leer.nextInt();

        System.out.println("Fracción 2");
        System.out.println("Ingrese el numerador");
        int num2 = leer.nextInt();

        System.out.println("Ingrese el denominador");
        int den2 = leer.nextInt();

        Fraccion fraccion1 = new Fraccion(num1, den1);
        Fraccion fraccion2 = new Fraccion(num2, den2);

        Fraccion resultado = sumar(fraccion1, fraccion2);

        System.out.println("Suma "+ fraccion1.getNum() +"/"+ fraccion1.getDen() +" + "
                + fraccion2.getNum()+"/"+ fraccion2.getDen()+" = " + resultado.getNum() + "/" + resultado.getDen());

        resultado = restar(fraccion1, fraccion2);

        System.out.println("Resta "+ fraccion1.getNum() +"/"+ fraccion1.getDen() +" - "
                + fraccion2.getNum()+"/"+ fraccion2.getDen()+" = " + resultado.getNum() + "/" + resultado.getDen());

        resultado = multiplicar(fraccion1, fraccion2);
        
        System.out.println("Multiplicación "+ fraccion1.getNum() +"/"+ fraccion1.getDen() +" * "
                + fraccion2.getNum()+"/"+ fraccion2.getDen()+" = " + resultado.getNum() + "/" + resultado.getDen());

        resultado = division(fraccion1, fraccion2);
        System.out.println("Division "+ fraccion1.getNum() +"/"+ fraccion1.getDen() +" % "
                + fraccion2.getNum()+"/"+ fraccion2.getDen()+" = " + resultado.getNum() + "/" + resultado.getDen());
    }

    public static Fraccion sumar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        //Resultado.getNum()
        if (a.getDen() != b.getDen()) {
            c.setNum(a.getNum() * b.getDen() + b.getNum() * a.getDen());
            c.setDen(a.getDen() * b.getDen());
            return c;
        } else {
            c.setNum(a.getNum() + b.getNum());
            c.setDen(a.getDen());
            return c;
        }
    }

    public static Fraccion restar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        //Resultado.getNum()
        if (a.getDen() != b.getDen()) {
            c.setNum(a.getNum() * b.getDen() - b.getNum() * a.getDen());
            c.setDen(a.getDen() * b.getDen());
            return c;
        } else {
            c.setNum(a.getNum() - b.getNum());
            c.setDen(a.getDen());
            return c;
        }
    }

    public static Fraccion multiplicar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        //Resultado.getNum()
        c.setNum(a.getNum() * b.getNum());
        c.setDen(a.getDen() * b.getDen());
        return c;
    }

    public static Fraccion division(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        //Resultado.getNum()
        c.setNum(a.getNum() * b.getDen());
        c.setDen(a.getDen() * b.getNum());
        return c;
    }
}
