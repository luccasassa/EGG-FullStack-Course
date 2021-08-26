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

public class Residencias extends ExtraHoteleros{
    
    private Integer habitantes;
    private Boolean gremio;
    private Boolean campoDeportivo;

    public Residencias() {    //siempre agregar el super(); ya que no se coloca solo
        super();
    }

    public Residencias(Integer habitantes, Boolean gremio, Boolean campoDeportivo) {    //respectivo constructor de la clase sin heredar nada
        this.habitantes = habitantes;
        this.gremio = gremio;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(Integer habitantes, Boolean gremio, Boolean campoDeportivo, Boolean privado, Integer mts2) {
        super(privado, mts2);
        this.habitantes = habitantes;    //sumado atributos padre
        this.gremio = gremio;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(Integer habitantes, Boolean gremio, Boolean campoDeportivo, Boolean privado, Integer mts2, String nombreAlojamiento, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombreAlojamiento, direccion, localidad, gerente);
        this.habitantes = habitantes;
        this.gremio = gremio;
        this.campoDeportivo = campoDeportivo;    //sumado atributos abuelo
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }

    public Boolean getGremio() {
        return gremio;
    }

    public void setGremio(Boolean gremio) {
        this.gremio = gremio;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "\nSECCION RESIDENCIAL"+"\n"
              +"Habitantes: "+habitantes+"\n"
              +"Tiene gremio? -> "+gremio+"\n"
              +"Tiene campo deportivo -> "+campoDeportivo;
    }
}
