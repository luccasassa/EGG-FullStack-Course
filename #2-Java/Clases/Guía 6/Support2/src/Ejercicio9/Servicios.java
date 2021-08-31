/*

 */

package Ejercicio9;

public class Servicios {
    
    public static double Discriminante(Raices raiz1){
        double raiz;
        raiz = Math.pow(raiz1.getB(),2)-(4*raiz1.getA()*raiz1.getC());
        return raiz;
    }
    
    public static boolean tieneRaices(Raices raiz1){
        boolean boo;
        double raiz = Math.pow(raiz1.getB(),2)-(4*raiz1.getA()*raiz1.getC());
        boo = raiz>=0;        
        return boo;
    }
    
    public static boolean tieneRaiz(Raices raiz1){
        boolean cero;
        double raiz = Math.pow(raiz1.getB(),2)-(4*raiz1.getA()*raiz1.getC());
        cero = raiz == 0;
        return cero;
    }
    
    public static String obtenerRaices(Raices raiz1){
        String resu;
        double resultado1=(-raiz1.getB())+Math.sqrt(((Math.pow(raiz1.getB(),2))-(4*raiz1.getA()*raiz1.getB()))/(2*raiz1.getA()));
        double resultado2=(-raiz1.getB())-Math.sqrt(((Math.pow(raiz1.getB(),2))-(4*raiz1.getA()*raiz1.getB()))/(2*raiz1.getA()));       
        resu = "Resultado con positivo: " + resultado1 + " resultado con negativo: " + resultado2;
        return resu;
    }
    
    public static double obtenerRaiz(Raices raiz1){
        double resultado=(-raiz1.getB())+Math.sqrt(((Math.pow(raiz1.getB(),2))-(4*raiz1.getA()*raiz1.getB()))/(2*raiz1.getA()));       
        return resultado;
    }
}
