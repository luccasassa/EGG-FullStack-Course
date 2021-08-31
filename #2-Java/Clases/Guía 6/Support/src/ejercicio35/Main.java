/*
 Una compañía de promociones turísticas desea mantener información sobre la
infraestructura de alojamiento para turistas, de forma tal que los clientes puedan
planear sus vacaciones de acuerdo a sus posibilidades. Los alojamientos se
identifican por un nombre, una dirección, una localidad y un gerente
encargado del lugar. La compañía trabaja con dos tipos de alojamientos:
Hoteles y Alojamientos Extrahoteleros.
Los Hoteles pueden ser de tres, cuatro o cinco estrellas. Las características de las
distintas categorías son las siguientes:
• Hotel *** Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos, Precio
de Habitaciones.
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones
de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las
Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
“B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
limosinas tenga el hotel, más caro será.
El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así como
la cantidad de metros cuadrados que ocupa. Existen dos tipos de alojamientos
extrahoteleros: los Camping y las Residencias. Para los Camping se indica la
capacidad máxima de carpas, la cantidad de baños disponibles y si posee o no
un restaurante dentro de las instalaciones. Para las residencias se indica la
cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o
no campo deportivo. Realizar un programa en el que se representen todas las
relaciones descriptas. Realizar un sistema de consulta que le permite al usuario
consultar por diferentes criterios:
• todos los alojamientos
• todos los hoteles de una determinada localidad
• todos los campings de una determinada localidad
 */
package ejercicio35;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Alojamiento> lista = new ArrayList();
        
        Hotel3 h1 = new Hotel3(30, 50, 3, 0, "Hotel 3E - 1", "Av. El Mirador", "Santiago", "Nahuel Bullon");
        h1.calcularPrecioHab();
        Hotel3 h2 = new Hotel3(100, 160, 10, 0, "Hotel 3E - 2", "Av. Alem", "San Juan", "Tincho Oviedo");
        h2.calcularPrecioHab();
        Hotel3 h3 = new Hotel3(200, 280, 20, 0, "Hotel 3E - 3", "Av. San Martin", "Mendoza", "Agustin Fiorde");
        h3.calcularPrecioHab();
        
        Hotel4 h4 = new Hotel4('A', "Restó 1", 20, 200, 260, 20, 0, "Hotel 4E - 1", "Vicuña Mackena", "Santiago", "Belen Lima");
        h4.calcularPrecioHab();
        Hotel4 h5 = new Hotel4('B', "Restó 2", 30, 150, 200, 15, 0, "Hotel 4E - 2", "25 de mayo", "San Juan", "Fede Seguí");
        h5.calcularPrecioHab();
        Hotel4 h6 = new Hotel4('A', "Restó 3", 60, 300, 360, 30, 1100, "Hotel 4E - 3", "Av SM", "Mendoza", "Agustin Fiorde");
        h6.calcularPrecioHab();
        
        Hotel5 h7 = new Hotel5(10, 40, 5, 'B', "Restó 4", 80, 400, 500, 40, 0, "Hotel 5E - 1 ", "Q se io", "Santiago", "Belen Lima");
        h7.calcularPrecioHab();
        Hotel5 h8 = new Hotel5(5, 10, 6, 'A', "Restó 5", 50, 200, 300, 40, 0, "Hotel 5E - 2 ", "Q se io", "San Juan", "Fede Seguí");
        h8.calcularPrecioHab();
        Hotel5 h9 = new Hotel5(15, 20, 15, 'A', "Resto 6", 60, 400, 500, 40, 0, "Hotel 5E - 1", "Que se io", "Mendoza", "Tincho Oviedo");
        h9.calcularPrecioHab();
        
        lista.add(h1);
        lista.add(h2);
        lista.add(h3);
        lista.add(h4);
        lista.add(h5);
        lista.add(h6);
        lista.add(h7);
        lista.add(h8);
        lista.add(h9);
        
        Camping c1 = new Camping(30, 20, true, true, 100, "Camping 1", "No sabo", "San Juan", "Tincho");
        Camping c2 = new Camping(60, 25, true, false, 200, "Camping 2", "No sabo", "Mendoza", "Agus");
        Camping c3 = new Camping(40, 25, true, false, 200, "Camping 3", "No sabo", "Santiago", "Belen");
        
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        
        Residencias r1 = new Residencias(5, false, true, true, 100, "Residencia 1", "No sabo", "San Juan", "Tincho");
        Residencias r2 = new Residencias(5, false, true, true, 100, "Residencia 1",  "No sabo", "Mendoza", "Agus");
        Residencias r3 = new Residencias(5, false, true, true, 100, "Residencia 1",  "No sabo", "Santiago", "Belen");
        
        lista.add(r1);
        lista.add(r2);
        lista.add(r3);
        //menu();
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opc = 99;
        while (opc != 0) {
            System.out.println("Elija una opcion");
            System.out.println("1. Mostrar todos los alojamientos");
            System.out.println("2. Mostrar todos los hoteles de una localidad");
            System.out.println("3. Mostrar todos los campings de una localidad");
            opc = sc.nextInt();
            
            switch (opc) {
                case 1:
                    mostrarTodo(lista);
                    break;
                case 2:
                    mostrarHotel(lista);
                    break;
                case 3:
                    mostrarCamping(lista);
                    break;
                case 0: 
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    
    public static void mostrarTodo(ArrayList<Alojamiento> lista) { 
        for (Alojamiento obj : lista) {
            System.out.println(obj);
        }
    }
    
    public static void mostrarHotel(ArrayList<Alojamiento> lista) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿En que localidad desea buscar?");
        String localidad = sc.next();
        
        for (Alojamiento alojamiento : lista) {
            if (alojamiento instanceof Hotel3) {
                Hotel3 hotel = (Hotel3) alojamiento;
                if (hotel.getLocalidad().equals(localidad))               
                System.out.println(hotel); 
            }
            if (alojamiento instanceof Hotel4) {
                Hotel4 hotel = (Hotel4) alojamiento;
                if (hotel.getLocalidad().equals(localidad))                
                System.out.println(hotel);    
            }
            if (alojamiento instanceof Hotel5) {
                Hotel5 hotel = (Hotel5) alojamiento;
                if (hotel.getLocalidad().equals(localidad))                
                System.out.println(hotel);
            }
        }
    }
    
    public static void mostrarCamping(ArrayList<Alojamiento> lista) {
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿En que localidad desea buscar?");
        String localidad = sc.next();
        for (Alojamiento alojamiento : lista) {
            if (alojamiento instanceof Camping) {
                
                Camping camping = (Camping) alojamiento;
                if (camping.getLocalidad().equals(localidad)) {
                    System.out.println(camping);
                }
                
            }
        }
    }
}
