public class Funciones_Math {

    public static void main(String[] args) {

        double numReal = -10.5;
        int numEntero = - 10;
        int num1 = 40;
        int num2 = 10;
        double numReal2 = 10.666;

        System.out.println("El valor absoluto de " + numReal + " es " + Math.abs(numReal));
        System.out.println("El valor absoluto de " + numEntero + " es " + Math.abs(numEntero));
        System.out.println("El maximo de " + num1 + " y " + num2 + " es " + Math.max(num1, num2));
        System.out.println("El minimo de " + num1 + " y " + num2 + " es " + Math.min(num1, num2));
        System.out.println("La potencia de " + num2 + " al cuadradro es " + Math.pow(num2, 2));
        System.out.println("El redondeo para arriba de " + numReal2 + " es " + Math.round(numReal2));
        System.out.println("El redondeo para abajo de " + numReal2 + " es " + Math.floor(numReal2));
        System.out.println("La raiz cuadrada de " + num2 + " es " + Math.sqrt(num2));
        
        System.out.println("--------------------------------------------");
        
        //Math Random
        
        int numeroAzar = (int) (Math.random() * 10);
        System.out.println("El numero aleatorio generado es: " + numeroAzar);
    }
}
