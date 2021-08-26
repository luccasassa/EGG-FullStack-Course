public class Funciones_String {

    public static void main(String[] args) {

        String frase = "Hola mundo";
        String frase2 = "Adios mundo";
        String frase3 = "hola mundo";

        System.out.println("CharAt:");
        System.out.println("La letra que se encuentra en la posicion " + 0
                + " de la frase " + frase + " es " + frase.charAt(0));
        
        System.out.println("------------------------------------------------------");
        System.out.println("Equals: ");
        System.out.println("La frase " + frase + " es igual a Hola mundo "
                + "/ Resultado: " + frase.equals("Hola mundo"));
       
        System.out.println("------------------------------------------------------");
        System.out.println("CompareTo: ");
        System.out.println("La frase " + frase + " comparada con " + frase2
                + " para saber si son iguales dio un resultado de " + frase.compareTo(frase2));

        System.out.println("------------------------------------------------------");
        System.out.println("CompareToIgnoreCase: ");
        System.out.println("La frase " + frase + " comparada con " + frase3
                + " para saber si son iguales dio un resultado de " + frase.compareToIgnoreCase(frase3));

        System.out.println("------------------------------------------------------");
        System.out.println("Concat: ");
        System.out.println("La frase " + frase + " concatenada con ! : " + frase.concat("!"));

        System.out.println("------------------------------------------------------");
        System.out.println("Contains: ");
        System.out.println("Para saber si en la frase " + frase
                + " esta la letra " + "'" + "a" + "'" + " dio un resultado de: " + frase.contains("a"));

        System.out.println("------------------------------------------------------");
        System.out.println("EndsWith: ");
        System.out.println("Para saber si en la frase " + frase
                + " termina con la letra " + "'" + "o" + "'" + " dio un resultado de: " + frase.endsWith("a"));

        System.out.println("------------------------------------------------------");
        System.out.println("StartsWith: ");
        System.out.println("Para saber si en la frase " + frase
                + " empieza con la letra " + "'" + "H" + "'" + " dio un resultado de: " + frase.startsWith("H"));

        System.out.println("------------------------------------------------------");
        System.out.println("IndexOf: ");
        System.out.println("La letra " + "'" + "a" + "'" + " en la cadena "
                + frase + " se encuentra en la posicion " + frase.indexOf("a"));

        System.out.println("------------------------------------------------------");
        System.out.println("Length: ");
        System.out.println("La longitud de la " + frase + " es: " + frase.length());

        System.out.println("------------------------------------------------------");
        System.out.println("Replace: ");
        System.out.println("La frase " + frase + " cuando la reemplazamos todas las " + "'" + "o" + "'" + " por "
                + "'" + "a" + "'" + " la frase queda asi: " + frase.replace("o", "a"));

        System.out.println("------------------------------------------------------");
        System.out.println("Split: ");
        System.out.println("Separamos la frase " + frase
                + " en el espacio vacio, lo guardamos en un vector y quedo asi: ");
        String[] vector = frase.split(" ", 3); // Separamos la frase en dos en el espacio vacio

        System.out.println("Frase uno: " + vector[0]);
        System.out.println("Frase dos: " + vector[1]);

        System.out.println("------------------------------------------------------");
        System.out.println("Substring: ");
        System.out.println("La letra que devuelve separar la cadena " + frase
                + " en la posicion 0,1 es: " + frase.substring(0, 1));

        System.out.println("------------------------------------------------------");
        System.out.println("toUpperCase: ");
        System.out.println("La frase " + frase + "toda en mayusculas es " + frase.toUpperCase());

        System.out.println("------------------------------------------------------");
        System.out.println("toLowerCase: ");
        System.out.println("La frase " + frase + "toda en minusculas es " + frase.toLowerCase());
        
        System.out.println("------------------------------------------------------");
        System.out.println("valueOf: ");
        String numero = " ";
                
        numero = numero.valueOf(1234);
        
        System.out.println("El numero 1234 transformado a cadena queda: " + numero);

    }

}
