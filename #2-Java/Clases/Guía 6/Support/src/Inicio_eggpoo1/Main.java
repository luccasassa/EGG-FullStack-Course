package Inicio_eggpoo1;

public class Main {
    
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("perro1: "+"Chiquito", 18, true, "Caniche");    //método simple + SET y GET
        //setteamos en el mismo objeto
        System.out.println("\nperro1 "+ perro1.getApodo()+" Tiene Cola? "+perro1.getCola()); //get para traer el dato
        
        //--------------------
        
        Perro perro2 = new Perro();    //método SET y GET
        perro2.setApodo("Cartucho");   //seteamos el nombre (modificamos)
        perro2.setCola(false);
        System.out.println("perro2: "+ perro2.getApodo()+" Tiene Cola? "+perro2.getCola());
        
        //--------------------
        
        Perro perro3 = new Perro();
        crearPerro(perro3);
        System.out.println("perro3: "+ perro3.toString());     //método .toString
        //de ésta forma se retornan los sets(en caso de rellenarlos en una funcion)
    }
    
    public static Perro crearPerro(Perro perro3){
             
        perro3.setApodo("Choco");
        perro3.setCola(true);
        perro3.setPeso(18);
        perro3.setRaza("Boxer");
        
        return perro3;
    }
}
