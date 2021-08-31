package ejercicio20;

public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        PalabraService.crearPalabra("mundo");
        PalabraService.crearPalabra("hola");
        PalabraService.crearPalabra("hello");
        PalabraService.crearPalabra("estacionamiento");
        PalabraService.crearPalabra("cantidad");
        PalabraService.crearPalabra("calidad");
        PalabraService.crearPalabra("agua");
        PalabraService.crearPalabra("bebe");
        PalabraService.crearPalabra("algo");
        PalabraService.crearPalabra("caca");
        PalabraService.buscar();
        System.out.println("Lista completa: ");
        PalabraService.imprimirLista(PalabraService.getLista());
    }
}
