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
• Método anterior() para devolver el día anterior del día de la fecha ingresada.
*/

package E_10;
import java.util.Scanner;
public class Servicios {
    
    Scanner sc = new Scanner(System.in);
    public Fecha leer(){
        Fecha objeto1 = new Fecha();    //se puede crear un objeto en Service
        System.out.println("DÍA");
        objeto1.setDay(sc.nextInt());
        System.out.println("MES");
        objeto1.setMonth(sc.nextInt());
        System.out.println("AÑO");
        objeto1.setYear(sc.nextInt());
        return objeto1;
    }
    
    public boolean bisiesto(Fecha objeto1) {
        return (objeto1.getYear() % 4 == 0 && objeto1.getYear() % 100 != 0 || objeto1.getYear() % 400 == 0);
    }
    
    public int diaMes(Fecha objeto1) {
        int dias = 0;
        
        switch (objeto1.getMonth()) {
            case 1: dias=31;
            break;
            case 2:
                if(bisiesto(objeto1)){
                    dias = 29;
                }else{
                    dias = 28;
                }
            break;
            case 3: dias=31;
            break;
            case 4: dias=30;
            break;
            case 5: dias=31;
            break;
            case 6: dias=30;
            break;
            case 7: dias=31;
            break;
            case 8: dias=31;
            break;
            case 9: dias=30;
            break;
            case 10: dias=31;
            break;
            case 11: dias=30;
            break;
            case 12: dias=31;
            break;
        }
        return dias;
    }
    
    public boolean validar(Fecha objeto1){
        Boolean day=false,month=false,year=false,respuesta=false;
        if(objeto1.getYear()>1899 && objeto1.getYear()<2051){
            year=true;
        }
        if(objeto1.getMonth()>0 && objeto1.getMonth()<13){
            month=true;            
        }
        
        switch(objeto1.getMonth()){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(objeto1.getDay()>=1 && objeto1.getDay()<=31){
                    day=true;
                }
            break;
            case 2:
                if(bisiesto(objeto1)){
                    if(objeto1.getDay()>=1 && objeto1.getDay()<=29){
                        day=true;
                    }
                }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(objeto1.getDay()>=1 && objeto1.getDay()<=31){
                    day=true;
                }
            break;
        }
        if(day==false){
            objeto1.setDay(1);
        }
        if(month==false){
            objeto1.setDay(1);
        }
        if(year==false){
            objeto1.setYear(1900);
        }
        if(day==true && month==true && year==true){
            respuesta=true;
        }
        return respuesta;
    }
    
    public int diasTranscurridos(Fecha objeto1) {
        int respuesta = 0;
        
        for (int i=1900; i<= objeto1.getYear()-1; i++) {
            if(bisiesto(objeto1)){
                respuesta = respuesta + 366;    //(bisiesto)
            }else{
                respuesta = respuesta + 365;
            }
        }
        
        for (int i = 1; i<= objeto1.getMonth()-1; i++) {
            if (bisiesto(objeto1)==true) {
                if (objeto1.getMonth() == 1 || objeto1.getMonth() == 3 || objeto1.getMonth() == 5 || objeto1.getMonth() == 7 || objeto1.getMonth() == 8 || objeto1.getMonth() == 10 || objeto1.getMonth() == 12) {
                    respuesta = respuesta + 31;
                }
                if (objeto1.getMonth() == 2) {
                    respuesta = respuesta + 29;
                }
                if (objeto1.getMonth() == 4 || objeto1.getMonth() == 6 || objeto1.getMonth() == 9 || objeto1.getMonth() == 11) {
                    respuesta = respuesta + 30;
                }
            }else if(bisiesto(objeto1)==false){
                if (objeto1.getMonth() == 1 || objeto1.getMonth() == 3 || objeto1.getMonth() == 5 || objeto1.getMonth() == 7 || objeto1.getMonth() == 8 || objeto1.getMonth() == 10 || objeto1.getMonth() == 12) {
                    respuesta = respuesta + 31;
                }
                if (objeto1.getMonth() == 2) {
                    respuesta = respuesta + 28;
                }
                if (objeto1.getMonth() == 4 || objeto1.getMonth() == 6 || objeto1.getMonth() == 9 || objeto1.getMonth() == 11) {
                    respuesta = respuesta + 30;
                }
            }
        }
        respuesta = respuesta + objeto1.getDay();
        return respuesta;
    }
    
    public int diasEntre(Fecha objeto1){
        int respuesta=0;
        for (int i=objeto1.getYear(); i<1900; i--) {
            if(bisiesto(objeto1)){
                respuesta+=366;
            }else{
                respuesta+=365;
            }
        }
        
        int meses=objeto1.getMonth()-12;
        if(meses<=1){
            for (int i=meses; i<1; i--) {
                if(diaMes(objeto1)==30){
                    respuesta+=30;
                }else if(diaMes(objeto1)==28){
                    respuesta+=28;
                }else if(diaMes(objeto1)==29){
                    respuesta+=29;
                }else{
                    respuesta+=31;
                }
            }
        }
        int dias=objeto1.getDay()-31;
        respuesta+=dias;
        return respuesta;
    }
    
    public static String Siguiente(Fecha fecha1){
        String sig;
        if (fecha1.getDay()>30){
            if (fecha1.getMonth()>11){
                sig = "La fecha siguiente es 1/1/"+ (fecha1.getYear()+1);
            } else {
                sig = "La fecha siguiente es 1/" + (fecha1.getMonth()+1) + "/" + fecha1.getYear();
            }
        }else {
            sig = "La fecha siguiente es " + (fecha1.getDay()+1) + "/" + fecha1.getMonth() + "/" + fecha1.getYear();
        }
        return sig;
    }
    
    public static String Anterior(Fecha fecha1){
        String ant;
        if (fecha1.getDay()==1){
            if (fecha1.getMonth()==1){
                ant = "La fecha anterior es 31/12/"+ (fecha1.getYear()-1);
            } else {
                ant = "La fecha anterior es 31/" + (fecha1.getMonth()-1) + "/" + fecha1.getYear();
            }
        }else {
            ant = "La fecha anterior es " + (fecha1.getDay()-1) + "/" + fecha1.getMonth() + "/" + fecha1.getYear();
        }
        return ant;
    }
}
