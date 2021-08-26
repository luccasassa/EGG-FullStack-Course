/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir
algún otro atributo, puede hacerlo.
Se implementarán tres constructores:
• Un constructor por defecto.
• Un constructor con el nombre, edad y sexo recibidos como parámetro; y el resto de
los atributos se inicializarán con valores por defecto.
• Un constructor con todos los atributos como parámetro.
Los métodos que se implementarán son:
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en m)). Si esta fórmula da por resultado un valor menor que 20, la función
devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que el peso está por debajo de su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la
persona tiene sobrepeso, y la función devuelve un 1. Se recomienda hacer uso de
constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
• Método comprobarSexo(char sexo): comprueba que el sexo introducido sea
correcto, es decir, H M ó O. Si no es correcto se deberá mostrar un mensaje.
• Métodos getters y setters de cada atributo.
A continuación, crear una clase ejecutable que haga lo siguiente:
Pedir por teclado el nombre, la edad, sexo, peso y altura. Luego se crearán 3 objetos de
la clase Persona de la siguiente manera: el primer objeto obtendrá los valores pedidos
por teclado, el segundo objeto obtendrá del usuario todos los atributos menos el peso y
la altura, y el tercer objeto será inicializado con valores por defecto. Para este último
utiliza los métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso
o está por debajo de su peso ideal. Mostrar un mensaje.
Indicar para cada objeto si la persona es mayor de edad.
Por último, se debe mostrar la información completa de cada objeto, es decir, los valores
de todos sus atributos.
Clases de Utilidad en Java
Los métodos disponibles para las clases de utilidad String, Integer, Math, Array, Date,
Calendar y GregorianCalendar se pueden consultar el “Apéndice B”.
*/

package E_14;

public class Servicios {
    
    public void calcularIMC(Persona objeto1){
        double calculo = (objeto1.getPeso()/Math.pow(objeto1.getAltura(), 2));
        
        if(calculo<20){
            System.out.println("IMC -1 (menor a 20) -> BAJO PESO");
        }
        if(calculo>=20 && calculo<=25){
            System.out.println("IMC 0 (entre 20 y 25) -> PESO NORMAL");
        }
        if(calculo>25){
            System.out.println("IMC 1 (superior a 25) -> SOBREPESO");
        }
    }
    
    public boolean comprobarEdad(Persona objeto1){
        return objeto1.getEdad()>18;
    }
    
    public void comprobarSexo(Persona objeto1){
        if("h".equals(objeto1.getSexo().toLowerCase()) || "m".equals(objeto1.getSexo().toLowerCase())){
            System.out.println("El sexo ingresado es correcto");
        }else{
            System.out.println("El sexo ingresado es incorrecto");
        }
    }
    
    public void imprimirPersona(Persona objeto1){
        System.out.println("Nombre: "+objeto1.getNombre()+"\n"
        +"Edad: "+objeto1.getEdad()+"\n"
        +"Sexo: "+objeto1.getSexo()+"\n"
        +"Peso: "+objeto1.getPeso()+"\n"
        +"Altura: "+objeto1.getAltura()+"\n");
        
        calcularIMC(objeto1);
        comprobarSexo(objeto1);
        System.out.println("Es mayor de edad? -> "+comprobarEdad(objeto1));
        System.out.println("--------------------------------------");
    }
}
