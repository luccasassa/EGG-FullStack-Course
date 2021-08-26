package E1;

public class RevolverServicio {
    
    private Revolver objeto1 = new Revolver();
    
    public Revolver llenarRevolver(){
        objeto1.setPosicionBala((int)(Math.random()*(objeto1.getTambor())+1)); //6 balas
        return objeto1;
    }
    
    public Boolean disparar(Integer posicion){
        objeto1.setPosicionActual(posicion);
        return !(objeto1.getPosicionBala() == objeto1.getPosicionActual());
    }
    
    //gira tambor
    public Integer siguienteBala(){
        objeto1.setPosicionActual((int)(Math.random()*(objeto1.getTambor())+1));
        //se puede modificar a que solo sea sin girar el tambor
        return objeto1.getPosicionActual();
    }
    
    public void mostrarLugar(){
        System.out.println(objeto1.toString());
    }
}