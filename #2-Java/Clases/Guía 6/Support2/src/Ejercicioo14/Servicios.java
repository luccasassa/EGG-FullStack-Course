/*

 */

package Ejercicioo14;

public class Servicios {
    
    public static double CalcularIMC(Persona persona1){
        double IMC;
        int resu;
        IMC=persona1.getPeso()/(Math.pow(persona1.getAltura(),2));
        if (IMC<20){
            resu=-1;
            System.out.println("Vas bien, segui asi!");
        }else if (IMC>=20 && IMC<=25){
            resu=0;
            System.out.println("Estas flquito che!");
        }else {
            resu=1;
            System.out.println("Estas gordito loco!");
        }
        return resu;
    }
    
    public static boolean esMayorDeEdad(Persona persona1){
        String mayor;
        boolean boo;
        if(persona1.getEdad()>=18){
            mayor = "Es mayor de edad";
            boo = true;
        }else {
            mayor = "Es menor de edad";
            boo = false;
        }
        System.out.println(mayor);
        return boo;
    }   
    
    public static boolean comprobarSexo(Persona persona1){
        boolean sex;
        if("m".equals(persona1.getSexo().toLowerCase())){
            sex=true;
        }else if("o".equals(persona1.getSexo().toLowerCase())){
            sex=true;
        }else if("f".equals(persona1.getSexo().toLowerCase())){
            sex=true;
        }else {        
            System.out.println("Solo se permite M, F y O. Ingreselo nuevamente");
            sex=false;
        }
        return sex;
    }
}
