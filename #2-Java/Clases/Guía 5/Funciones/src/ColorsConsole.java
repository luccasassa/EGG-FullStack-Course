public class ColorsConsole {

    public static void main(String[] args) {
        
        String b = "\u001B[0m"; //borrar //ejemplo: b+"|"+fazul+" "+b+"| |"
        String negro = "\033[30m";
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[33m";
        String azul = "\033[34m";
        String magenta = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
        
        System.out.println(negro+"Texto negro");
        System.out.println(rojo+"Texto rojo");
        System.out.println(verde+"Texto verde");
        System.out.println(amarillo+"Texto amarillo");
        System.out.println(azul+"Texto azul");
        System.out.println(magenta+"Texto magenta");
        System.out.println(celeste+"Texto celeste");
        System.out.println(blanco+"Texto blanco");
        
        String fRojo = "\033[41m";
        String fVerde = "\033[42m";
        String fAmarillo = "\033[43m";
        String fAzul = "\033[44m";
        String fMagenta = "\033[45m";
        String fCeleste = "\033[46m";
        String fGris = "\033[47m";
        
        System.out.println(fRojo+"Fondo rojo");
        System.out.println(fVerde+"Fondo verde");
        System.out.println(fAmarillo+"Fondo amarillo");
        System.out.println(fAzul+"Fondo azul");
        System.out.println(fMagenta+"Fondo magenta");
        System.out.println(fCeleste+"Fondo celeste");
        System.out.println(fGris+"Fondo gris");
        System.out.println("asdasda");
    }
}
//Facherito no?