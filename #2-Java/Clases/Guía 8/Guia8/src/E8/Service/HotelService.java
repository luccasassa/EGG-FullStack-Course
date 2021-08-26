/*
Una compañía de promociones turísticas desea mantener información sobre la
infraestructura de alojamiento para turistas, de forma tal que los clientes puedan
planear sus vacaciones de acuerdo a sus posibilidades. Los alojamientos se
identifican por un nombre, una dirección, una localidad y un gerente encargado
del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles y
Alojamientos Extrahoteleros.
Los Hoteles pueden ser de tres, cuatro o cinco estrellas. Las características de
las distintas categorías son las siguientes:
• Hotel *** Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos,
Precio de Habitaciones.
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
de las Habitaciones.
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
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas. Realizar un sistema de consulta que le permite al
usuario consultar por diferentes criterios:
• todos los alojamientos
• todos los hoteles de una determinada localidad
• todos los campings de una determinada localidad
*/

package E8.Service;

import E8.Clases.Alojamiento;
import E8.Clases.Camping;
import E8.Clases.Hotel_3;
import E8.Clases.Hotel_4;
import E8.Clases.Hotel_5;
import E8.Clases.Residencias;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelService {
    
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private static List<Alojamiento> lista = new ArrayList<>();
    
    public static void menu(){
        int opcion = 123;
        
        do{
            System.out.print("----------------------------------------\n"
            +"HOTEL? TRIVAGO ahre:\n"  
            +"1. Mostrar todos los alojamientos.\n"
            +"2. Mostrar todos los hoteles de una localidad.\n"
            +"3. Mostrar todos los campings de una localidad.\n"
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: mostrarTodo();
                break;
                case 2: mostrarHoteles();
                break;
                case 3: mostrarCampings();
                break;
                case 0: System.out.println("");
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }while(opcion!=0);
    }
    
    public static void creadorHoteles(){
        
        //(Hotel 3) habitaciones / camas / pisos / precioHab.
        //(Alojamiento) nombreAlojam / direccion / localidad / gerente.
        Hotel_3 hotel1 = new Hotel_3(30, 50, 3, 0, "Hotel 3E - 1", "Av. El Mirador - Altura 951", "Mendoza", "Pepito Fangione");
        hotel1.calcularPrecioHabitacion();
        lista.add(hotel1);
        
        //(Hotel 4) gym / nombreRest / capacidadRest.
        //(Hotel 3) habitaciones / camas / pisos / precioHab.
        //(Alojamiento) nombreAlojam / direccion / localidad / gerente.
        Hotel_4 hotel2 = new Hotel_4("a", "Restó 1", 20, 20, 26, 3, 0, "Hotel 4E - 1", "Ruta 46 - Altura 717", "Mendoza", "Gustavo López");
        hotel2.calcularPrecioHabitacion();
        lista.add(hotel2);
        
        //(Hotel 5) cantSalones / cantSuites / cantLimosnas.
        //(Hotel 4) gym / nombreRest / capacidadRest.
        //(Hotel 3) habitaciones / camas / pisos / precioHab.
        //(Alojamiento) nombreAlojam / direccion / localidad / gerente.
        Hotel_5 hotel3 = new Hotel_5(10, 40, 5, "b", "Restó 4", 80, 400, 500, 40, 0, "Hotel 5E - 1 ", "Ruta 11 - Altura 682", "Mendoza", "Máximo Bonadeo");
        hotel3.calcularPrecioHabitacion();
        lista.add(hotel3);
        
        //-----------------------------------------------------------------------------------------------------------------------
        
        //(Camping) capMax / capBaños / restaurante?.
        //(ExtraHoteleros) privado? / mts2.
        //(Alojamiento) nombreAlojam / direccion / localidad / gerente.
        Camping camping = new Camping(30, 20, true, true, 100, "Camping 'Las Toninas'", "Ruta 42 - Altura 123", "Mendoza", "Aristóbulo Amadeus");
        lista.add(camping);
        
        //-----------------------------------------------------------------------------------------------------------------------
        
        //(Residencias) habitantes / gremio? / campoDeportivo?.
        //(ExtraHoteleros) privado? / mts2.
        //(Alojamiento) nombreAlojam / direccion / localidad / gerente.
        Residencias residencia = new Residencias(5, false, true, true, 100, "Residencia 'Paseo Stare'", "Ruta 23 - Altura 381", "Mendoza", "José Aldo Lobos");
        lista.add(residencia);
    }
    
    public static void mostrarTodo(){
        Integer h = 0;
        
        for (Alojamiento i : lista) {
            h++;
            System.out.println(i);
        }
    }
    
    public static void mostrarHoteles(){
        System.out.print("\033[33m"+"Digite la localidad: ");
        String localidad = sc.next();
        
        for (Alojamiento i : lista) {
            if (i instanceof Hotel_3) {
                Hotel_3 hotel3 = (Hotel_3) i;
                if (hotel3.getLocalidad().equals(localidad))               
                System.out.println(hotel3);    //escribir el tostring manual o crear toString correspondiente en la clase
            }
            if (i instanceof Hotel_4) {
                Hotel_4 hotel4 = (Hotel_4) i;
                if (hotel4.getLocalidad().equals(localidad))                
                System.out.println(hotel4);    //escribir el tostring manual o crear toString correspondiente en la clase
            }
            if (i instanceof Hotel_5) {
                Hotel_5 hotel5 = (Hotel_5) i;
                if (hotel5.getLocalidad().equals(localidad))                
                System.out.println(hotel5);    //escribir el tostring manual o crear toString correspondiente en la clase
            }
        }
    }
    
    public static void mostrarCampings(){
        System.out.print("\033[33m"+"Digite la localidad: ");
        String localidad = sc.next();
        
        for (Alojamiento i : lista) {
            if (i instanceof Camping) {
                
                Camping camping = (Camping) i;
                if (camping.getLocalidad().equals(localidad)) {
                    System.out.println(camping);    //escribir el tostring manual o crear toString correspondiente en la clase
                }
            }
        }
    }
}
