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

package E8.Clases;

public class Hotel_4 extends Hotel_3{
    
    protected String gym;
    protected String nombreRestaurante;
    protected Integer capRestaurante;

    public Hotel_4() {    //agregar super();
        super();
    }

    public Hotel_4(String gym, String nombreRestaurante, Integer capRestaurante) {
        this.gym = gym;
        this.nombreRestaurante = nombreRestaurante;
        this.capRestaurante = capRestaurante;
    }

    public Hotel_4(String gym, String nombreRestaurante, Integer capRestaurante, Integer cantHabitaciones, Integer cantCamas, Integer pisos, Integer precioHabitacion) {
        super(cantHabitaciones, cantCamas, pisos, precioHabitacion);
        this.gym = gym;
        this.nombreRestaurante = nombreRestaurante;
        this.capRestaurante = capRestaurante;
    }

    public Hotel_4(String gym, String nombreRestaurante, Integer capRestaurante, Integer cantHabitaciones, Integer cantCamas, Integer pisos, Integer precioHabitacion, String nombreAlojamiento, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, pisos, precioHabitacion, nombreAlojamiento, direccion, localidad, gerente);
        this.gym = gym;
        this.nombreRestaurante = nombreRestaurante;
        this.capRestaurante = capRestaurante;
    }
    
    public Integer valorAgregadoRestaurante(){
        if (capRestaurante < 30) {
          return 10;   
        } else if (capRestaurante >=30 && capRestaurante <= 50) {
            return 30;
        } else {
            return 50;
        }
    }
    
    public Integer valorAgregadoGym(){
        if ("a".equals(gym)) {
            return 50;
        } else {
            return 30;
        }
    }
    
    public Integer calcularPrecioHabitacion(){
        precioHabitacion = 50 + (1 * cantCamas) + valorAgregadoRestaurante() + valorAgregadoGym();
        return precioHabitacion;
    }

    @Override
    public String toString() {
        return "\nSEGUNDA SECCION DE HOTELES"+"\n"
              +"Tiene gym? -> "+gym+"\n"
              +"Nombre del restaurante: "+nombreRestaurante+"\n"
              +"Capacidad del restaurante: "+capRestaurante;
    }
    
}
