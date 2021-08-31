/*

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

package Ejercicioo14;

public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private String otro;

    public Persona(String nombre, int edad, String sexo, double peso, double altura, String otro) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.otro = otro;
    }
    
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", otro=" + otro + '}';
    }
       
}
