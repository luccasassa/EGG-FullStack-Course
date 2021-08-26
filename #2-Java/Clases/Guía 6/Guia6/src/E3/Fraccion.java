/*
Crear una clase llamada Fraccion que contenga métodos para sumar, restar,
multiplicar y dividir fracciones. Los argumentos de cada método son el
numerador y denominador según corresponda. La clase también debe contener
un método constructor con parámetros.
*/

package E3;
public class Fraccion {
    
    //ATRIBUTOS
    private final int numerador;    //me agrega "final" automáticamente
    private final int denominador;    //me agrega "final" automáticamente
    
    //BOB EL CONSTRUCTOR
    public Fraccion(int numerador,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    
    //SETTER
    public int setNumerador(){
        return numerador;
    }
    //GETTER
    public int getNumerador(){
        return numerador;
    }
    //SETTER
    public int setDenominador(){
        return denominador;
    }
    //GETTER
    public int getDenominador(){
        return denominador;
    }
    
    //OPERACIONES
    public static String sumar(Fraccion cosa1,Fraccion cosa2){
        String resultado;
        int num,den;
        num = ((cosa1.getNumerador()*cosa2.getDenominador())+(cosa1.getDenominador()*cosa2.getNumerador()));
        den = cosa1.getDenominador()*cosa2.getDenominador();
        double simp = num/den;
        resultado=num+"/"+den+" = "+simp;
        return resultado;
    }
    
    public static String restar(Fraccion cosa1,Fraccion cosa2){
        String resultado;
        int num,den;
        num = ((cosa1.getNumerador()*cosa2.getDenominador())-(cosa1.getDenominador()*cosa2.getNumerador()));
        den = cosa1.getDenominador()*cosa2.getDenominador();
        double simp = num/den;
        resultado=num+"/"+den+" = "+simp;
        return resultado;
    }
    
    public static String multiplicar(Fraccion cosa1,Fraccion cosa2){
        String resultado;
        int num,den;
        num = ((cosa1.getNumerador()*cosa2.getNumerador()));
        den = cosa1.getDenominador()*cosa2.getDenominador();
        double simp = num/den;
        resultado=num+"/"+den+" = "+simp;
        return resultado;
    }
    
    public static String dividir(Fraccion cosa1,Fraccion cosa2){
        String resultado;
        int num,den;
        num = ((cosa1.getNumerador()*cosa2.getDenominador()));
        den = cosa2.getDenominador()*cosa1.getNumerador();
        double simp = num/den;
        resultado=num+"/"+den+" = "+simp;
        return resultado;
    }
}
