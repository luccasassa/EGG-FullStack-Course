
package Ejercicioo16;

public class Servicios {
    
    public static int devolverMayor(Matematica mate1){
        int mayor;
        if(mate1.getNum1()>mate1.getNum2()){
            mayor = mate1.getNum1();
        }else{
            mayor = mate1.getNum2();
        }
        return mayor;
    }
    
    public static int calcularPotencia(Matematica mate1){
        int potencia;
        if(mate1.getNum1()>mate1.getNum2()){
            potencia = (int) Math.pow(mate1.getNum1(), mate1.getNum2());
        }else{
            potencia = (int) Math.pow(mate1.getNum2(), mate1.getNum1());
        }
        return potencia;
    }
    
    public static double calcularRaiz(Matematica mate1){
        double raiz;
        if(mate1.getNum1()>mate1.getNum2()){
            if (mate1.getNum1()<0){
                raiz = Math.sqrt((mate1.getNum1())-(mate1.getNum1()*2));
            }else {
                raiz = Math.sqrt(mate1.getNum1());
            }
            
        }else{
            if (mate1.getNum2()<0){
                raiz = Math.sqrt((mate1.getNum2())-(mate1.getNum2()*2));
            }else {
                raiz = Math.sqrt(mate1.getNum2());
            }
        }               
        return raiz;
    }
    
    public static double sumarAngulos(Matematica mate1){
        double angulos;
        angulos = (Math.sin(mate1.getNum1())*Math.cos(mate1.getNum2()))+(Math.sin(mate1.getNum2())*Math.cos(mate1.getNum1()));       
        return angulos;
    }
}
