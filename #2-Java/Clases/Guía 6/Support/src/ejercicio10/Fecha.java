/*
Crear una clase Fecha con atributos para el día, mes y año. Se debe incluir al
menos los siguientes métodos:
• Constructor predeterminado con el 1-1-1900 como fecha por defecto
• Constructor parametrizado con día, mes y año ingresados por el usuario.
• Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a
2050).
• Método bisiesto() para indicar si el año es bisiesto o no.
• Método diasMes(int) para devolver el número de días del mes indicado (para el
año de la fecha).
• Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-
12-2050). Si el día no es correcto, se pondrá en 1; si el mes no es correcto se
pondrá en 1; y si el año no es correcto lo pondrá en 1900. Esto último se realizará
mediante los métodos setters de cada atributo. Los setters también se llamarán en
el constructor parametrizado y en el método leer().
• Método diasTranscurridos() para devolver la cantidad de días transcurridos desde
el 1-1-1900 hasta la fecha ingresada por el usuario.
• Método diasEntre(Fecha) para devolver el número de días entre la fecha ingresada
por el usuario y la proporcionada como parámetro.
• Método siguiente() para devolver el día siguiente del día de la fecha ingresada.
• Método anterior() para devolver el día anterior del día de la fecha ingresada.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    //private Boolean bisiesto = false;

    // Constructor predeterminado con el 1-1-1900 como fecha por defecto    
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    //Constructor parametrizado con día, mes y año ingresados por el usuario.
    public Fecha(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año 
    //(1900 a 2050).
    public void leer() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();

    }

    //Método bisiesto() para indicar si el año es bisiesto o no.
    public boolean bisiesto() {
//        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
//            System.out.println("El año es bisiesto");
//            bisiesto = true;
//            
//        } else {
//            System.out.println("El año no es bisiesto");
//            bisiesto = false;
//        } 
// EL RETURN ME DA LO MISMO QUE EL IF DE ARRIBA
        return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
    }

    // Método diasMes(int) para devolver el número de días del mes indicado (para el
    //año de la fecha) 
    public int diaMes(int mes) {
        int numDias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 2:
                //bisiesto();
                if (bisiesto()) {
                    numDias = 29;
                } else {
                    numDias = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
        }
        return numDias;
    }

    /* Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 
    y el 31-12-2050). Si el día no es correcto, se pondrá en 1; si el mes no es 
    correcto se pondrá en 1; y si el año no es correcto lo pondrá en 1900. Esto 
    último se realizará mediante los métodos setters de cada atributo. 
    Los setters también se llamarán en el constructor parametrizado y en el
    método leer().
     */
    public boolean validar() {
        Boolean diaOk, mesOk, anioOk, todoBien;
        todoBien = false;
        diaOk = false;
        mesOk = false;
        anioOk = false;
         if (anio>= 1900 && anio <= 2050){
             //System.out.println("Es verdadero");
             anioOk = true;
         }
             
         if(mes >= 1 && mes <= 12){
             //System.out.println("Es verdadero");
             mesOk = true;
        }
        switch (mes) {
            
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(dia >= 1 && dia <= 31){
                   // System.out.println("Hola");
                    diaOk =true;
                }
                break;
            case 2:
                //bisiesto();
                if (bisiesto()) {
                     if(dia >= 1 && dia <= 29){
                         //System.out.println("Hola");
                         diaOk = true;
                     }
                } else {
                     if(dia >= 1 && dia <= 28){
                        // System.out.println("Hola");
                         diaOk = true;
                     }
                }

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                 if(dia >= 1 && dia <= 30){
                     //System.out.println("Hola");
                     diaOk = true;
                 }
                break;
        }
        if (diaOk==false ) {
            setDia(1);
        }
        if (mesOk ==false) {
            setMes(1);
        }
        if (anioOk ==false) {
            setAnio(1900);
        }
        if(diaOk && mesOk && anioOk){
            //System.out.println("Hola");
            todoBien = true;  
        }
        return todoBien;
    }
    // Método diasTranscurridos() para devolver la cantidad de días transcurridos
    //desde el 1-1-1900 hasta la fecha ingresada por el usuario.
    public int diasTranscurridos(Fecha a) {
        Fecha autom = new Fecha();
        int diasTranscurridos = 0;
        //int años = a.getAño() - autom.getAño();
        for (int i = autom.getAnio(); i < a.getAnio(); i++) {
            if (bisiesto()) {
                diasTranscurridos = 365 + 1 + diasTranscurridos;
            } else {
                diasTranscurridos = 365 + diasTranscurridos; //conviertoo años en dias
            }
        }
        int meses = a.getMes() - autom.getMes();
        if (meses <= 1) {
            for (int i = 1; i <= meses; i++) {
                if (diaMes(i) == 30) {
                    diasTranscurridos += 30;

                } else if (diaMes(i) == 28) {
                    diasTranscurridos += 28;

                } else if (diaMes(i) == 29) {
                    diasTranscurridos += 29;

                } else {
                    diasTranscurridos += 31;
                }
            }
        }
        int dias = a.getDia() - autom.getDia(); //diferencia en dia
        diasTranscurridos += dias;

        return diasTranscurridos;
    }

    public int diasEntre(Fecha a) {
        Fecha autom = new Fecha();
        int diasEntre = 0;
        //int años = a.getAño() - autom.getAño();
        for (int i = a.getAnio(); i > autom.getAnio(); i--) {
            if (bisiesto()) {
                diasEntre = 365 + 1 + diasEntre;
            } else {
                diasEntre = 365 + diasEntre; //conviertoo años en dias
            }
        }
        int meses = a.getMes() - autom.getMes();
        if (meses <= 1) { /// AVISAR A MARIELA CAMBIO i >= 1
            for (int i = meses; i >= 1; i--) {
                if (diaMes(i) == 30) {
                    diasEntre += 30;
                } else if (diaMes(i) == 28) {
                    diasEntre += 28;
                } else if (diaMes(i) == 29) {
                   diasEntre += 29;
                } else {
                    diasEntre += 31;
                }
            }
        }
        int dias = a.getDia() - autom.getDia(); //diferencia en dia
        diasEntre += dias;

        return diasEntre;
    }
    
    public Fecha siguiente(Fecha a) {
        Fecha siguiente = new Fecha();
        if (a.getDia() == 31 && a.getMes() == 12) {
            siguiente.setDia(1);
            siguiente.setMes(1);        
            siguiente.setAnio(a.getAnio()+1); 
            
        } else if (a.getDia() == 30 || a.getDia() == 31 || a.getDia() == 29 || a.getDia() == 28 && a.getMes()!=12) {
            siguiente.setDia(1);
            siguiente.setMes(a.getMes()+1);
            siguiente.setAnio(a.getAnio()); 
  
        } else {
            siguiente.setDia(a.getDia()+1);
            siguiente.setMes(a.getMes());
            siguiente.setAnio(a.getAnio());
        }
        
        return siguiente;
    }
    
        public Fecha anterior(Fecha a) {
        Fecha anterior = new Fecha();
//        if ((diaMes(a.getMes()) == 30) || (diaMes(a.getMes()) == 31) ||  diaMes(a.getMes()) == 28 ||  diaMes(a.getMes()) == 29) {
            //anterior.setMes(a.getMes()-1);
         if (a.getDia() == 1 && a.getMes()>1) {
            switch (diaMes(a.getMes()-1)) {
                case 30:
                    anterior.setDia(30);
                    anterior.setMes(a.getMes()-1);
                    anterior.setAnio(a.getAnio());
                    break;
                case 31:
                    anterior.setDia(31);
                    anterior.setMes(a.getMes()-1);
                    anterior.setAnio(a.getAnio());
                    break;
                case 28:
                    anterior.setDia(28);
                    anterior.setMes(a.getMes()-1); 
                    anterior.setAnio(a.getAnio());
                    break;
                case 29:
                    anterior.setDia(29);
                    anterior.setMes(a.getMes()-1);
                    anterior.setAnio(a.getAnio());
                    break;
            }
            
        } else if (a.getDia() == 1 && a.getMes() == 1) {
            anterior.setDia(31);
            anterior.setMes(12);
            anterior.setAnio(a.getAnio()-1);
        } else {
            anterior.setDia(a.getDia()-1);
            anterior.setMes(a.getMes());
            anterior.setAnio(a.getAnio());
        }
            
        
        return anterior;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
    
}
