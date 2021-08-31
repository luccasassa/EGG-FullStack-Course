/*
Crear una clase Fecha con atributos para el día, mes y año. Se debe incluir al
menos los siguientes métodos:
• Constructor predeterminado con el 1-1-1900 como fecha por defecto
• Constructor parametrizado con día, mes y año ingresados por el usuario.
• Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a 2050).
• Método bisiesto() para indicar si el año es bisiesto o no.
• Método diasMes(int) para devolver el número de días del mes indicado (para el año
de la fecha).
• Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-12-
2050). Si el día no es correcto, se pondrá en 1; si el mes no es correcto se pondrá en
1; y si el año no es correcto lo pondrá en 1900. Esto último se realizará mediante los
métodos setters de cada atributo. Los setters también se llamarán en el constructor
parametrizado y en el método leer().
• Método diasTranscurridos() para devolver la cantidad de días transcurridos desde el
1-1-1900 hasta la fecha ingresada por el usuario.
• Método diasEntre(Fecha) para devolver el número de días entre la fecha ingresada
por el usuario y la proporcionada como parámetro.
• Método siguiente() para devolver el día siguiente del día de la fecha ingresada.
• Método anterior() para devolver el día anterior del día de la fecha ingresada
*/

package Ejercicioo10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean conf = false;
        
        Fecha fechaPred = new Fecha();
        fechaPred.setAño(1900);
        fechaPred.setMes(1);
        fechaPred.setDia(1);
        
        System.out.println("Ingrese año");
        Fecha fecha1 = new Fecha();
        do {
            fecha1.setAño(sc.nextInt());
            if (fecha1.getAño()>2050 || fecha1.getAño()<1900){
            System.err.println("El año tiene que estar entre 1900 y 2050, ingreselo nuevamente");
            }
        }while (fecha1.getAño()>2050 || fecha1.getAño()<1900);
        System.out.println("Ingrese mes");
        do {
            fecha1.setMes(sc.nextInt());
            if (fecha1.getMes()<1 || fecha1.getMes()>12){
                System.err.println("El mes tiene que estar entre 1 y 12, ingreselo nuevamente");
            }
        }while(fecha1.getMes()<1 || fecha1.getMes()>12);
        System.out.println("Ingrese dia");
        do {
            fecha1.setDia(sc.nextInt()); 
            switch(fecha1.getMes()){
                case 1:
                    if(fecha1.getDia()>31){
                        System.out.println("El dia tiene que ser menor a 31");
                    }else {
                        conf=true;
                        break;
                    }
                case 2:
                    if(fecha1.getDia()>29 && Servicios.acomodarAño(fecha1)==true){
                        System.out.println("El dia tiene que ser menor a 29");
                        break;
                    }else if (fecha1.getDia()>28){
                        System.out.println("El dia tiene que ser menor a 28");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 3:
                    if(fecha1.getDia()>31){
                        System.out.println("El dia tiene que ser menor a 31");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 4:
                    if(fecha1.getDia()>31){
                        System.out.println("El dia tiene que ser menor a 31");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 5:
                    if(fecha1.getDia()>30){
                        System.out.println("El dia tiene que ser menor a 30");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 6:
                    if(fecha1.getDia()>31){
                        System.out.println("El dia tiene que ser menor a 31");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 7:
                    if(fecha1.getDia()>30){
                        System.out.println("El dia tiene que ser menor a 30");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 8:
                    if(fecha1.getDia()>31){
                        System.out.println("El dia tiene que ser menor a 31");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 9:
                    if(fecha1.getDia()>30){
                        System.out.println("El dia tiene que ser menor a 30");
                    }else {
                        conf=true;
                        break;
                    }
                case 10:
                    if(fecha1.getDia()>31){
                        System.out.println("El dia tiene que ser menor a 31");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 11:
                    if(fecha1.getDia()>30){
                        System.out.println("El dia tiene que ser menor a 30");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
                case 12:    
                    if(fecha1.getDia()>31){
                        System.out.println("El dia tiene que ser menor a 31");
                        break;
                    }else {
                        conf=true;
                        break;
                    }
            }                               
        }while (conf==false);
        
        System.out.println(Servicios.diasTranscurridos(fecha1, fechaPred));
        System.out.println(Servicios.Anterior(fecha1));
        System.out.println(Servicios.Siguiente(fecha1));  
    }

}
