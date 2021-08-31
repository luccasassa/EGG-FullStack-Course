
package Ejercicioo15;

public class Servicios {
    
    public static int mostrarVocales(Cadena cadena1){
        int vocales;
        vocales=0;
        int largcad = cadena1.getLongitud();
        for (int i=0;i<largcad;i++){
            if("a".equals(cadena1.getFrase().substring(i,i+1).toLowerCase())){
                vocales=vocales+1;
            }else if("e".equals(cadena1.getFrase().substring(i,i+1).toLowerCase())){
                vocales=vocales+1;
            }else if("i".equals(cadena1.getFrase().substring(i,i+1).toLowerCase())){
                vocales=vocales+1;
            }else if("o".equals(cadena1.getFrase().substring(i,i+1).toLowerCase())){
                vocales=vocales+1;
            }else if("u".equals(cadena1.getFrase().substring(i,i+1).toLowerCase())){
                vocales=vocales+1;
            }else{
                vocales=vocales+0;
            }
        }
        return vocales;
    }
    
    public static String invertirFrase(Cadena cadena1){
        String invert="";
        for(int i=(cadena1.getLongitud()-1);i>=0;i--){           
            invert=invert+cadena1.getFrase().substring(i,i+1);
        }
        return invert;
    }
    
    public static int vecesRepetido(Cadena cadena1){
        int car;
        car=0;
        for (int i=0;i<cadena1.getLongitud()-1;i++){
            if (cadena1.getFrase().substring(i,i+1).equals(cadena1.getCaracter())){
                car=car+1;
            }
        }
        return car;
    }
    
    public static int compararLongitud(Cadena cadena1, Cadena cadena2){
        int total;
        if (cadena1.getFrase().length()>cadena2.getFrase().length()){
            total = cadena1.getFrase().length() - cadena2.getFrase().length();
        }else {
            total =  cadena2.getFrase().length() - cadena1.getFrase().length();
        }           
        return total;
    }
    
    public static String unirFrases(Cadena cadena1, Cadena cadena2){
        String unidas;
        unidas = cadena1.getFrase() + " " + cadena2.getFrase();
        return unidas;
    }
    
    public static String reemplazar(Cadena cadena1, Cadena cadena2){
        String reem = "";
        String full = cadena1.getFrase() + " " + cadena2.getFrase();
        for(int i=0;i<full.length();i++){
            if (full.substring(i,i+1).equals(cadena2.getCara())){
                reem = reem + cadena2.getCara();
            }else{
                reem = reem + full.substring(i,i+1);
            }
        }
        return reem;       
    }
}
