/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio14;


public class Persona {
    
    private String nombre;
    private Integer edad;
    private char sexo;
    private double peso;
    private double altura;
    
    //Un constructor por defecto.
    public Persona() {
        this.nombre = "Persona 3";
        this.edad = 31;
        this.sexo = 'M';
        this.peso=66;
        this.altura=1.75;
    }
    
    //Un constructor con el nombre, edad y sexo recibidos como parámetro; y 
    //el resto de los atributos se inicializarán con valores por defecto.
    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso=55;
        this.altura=1.75;
    }
    
    // Un constructor con todos los atributos como parámetro.

    public Persona(String nombre, Integer edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
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
    
    /*Método calcularIMC(): calculara si la persona está en su peso ideal 
    (peso en kg/(altura^2 en m)). Si esta fórmula da por resultado un
    valor menor que 20, la función devuelve un -1. Si la fórmula da por 
    resultado un número entre 20 y 25 (incluidos), significa que el peso está
    por debajo de su peso ideal y la función devuelve un 0. Finalmente, 
    si el resultado de la fórmula es un valor mayor que 25 significa que 
    la persona tiene sobrepeso, y la función devuelve un 1. Se
    recomienda hacer uso de constantes para devolver estos valores.
    */
    public int calcularIMC() {
        double calcularIMC = peso / (altura*altura);
        Integer imc;
        if (calcularIMC < 20) {
            imc=-1;
        } else if (calcularIMC <= 20 && calcularIMC >= 25) {
            imc=0;
        } else {
            imc=1;
        }
        return imc;
    }
    
    //Método esMayorDeEdad(): indica si la persona es mayor de edad.
    //La función devuelve un booleano.
    public Boolean esMayorDeEdad() {
        return (edad > 18); 
    }
    
    /* Método comprobarSexo(char sexo): comprueba que el sexo introducido sea
correcto, es decir, H M ó O. Si no es correcto se deberá mostrar un mensaje.
*/
    public void comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M' || sexo == 'O') {

        } else {
            System.out.println("El sexo ingresado es incorrecto.");
        }
    }
    
    public void imprimirPersona(Persona a) {
        System.out.println(toString());
        a.comprobarSexo(sexo);
        switch (a.calcularIMC()) {
            case -1:
                System.out.println("Su IMC es menor a 20,  está en bajo peso!");
                break;
            case 0:
                System.out.println("Su IMC está entre 20 y 25, su peso esta bien!");
                break;
            case 1:
                System.out.println("Su IMC es superior a 25, usted está en sobrepeso");
                break;
        }
        
        if (a.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Aún eres menor");
        }
        
    }

    @Override
    public String toString() {
        return "Persona " + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura;
    }
    

}
