package Inicio_eggpoo1;
class Perro {           //Nombre de la clase: MAYUSCULA la primer letra de cada palabra, Y SINGULAR
    
    //ATRIBUTOS
    private String apodo;
    private int peso;    //int
    private Boolean cola;
    private String raza;

    //CONSTRUCTORES
    public Perro(String apodo, Integer peso, Boolean cola, String raza) {
        this.apodo = apodo;
        this.peso = peso;
        this.cola = cola;
        this.raza = raza;
    }

    Perro() {    //es necesario ya que el main me exige éste constructor
    }
    
    //SETTER
    public void setApodo(String apodo){    //SETEA(modifica) EL VALOR DEL ATRIBUTO APODO
        this.apodo = apodo;
    }
    //GETTER
    public String getApodo(){
        return apodo;
    }
    
    //------------------------------
    
    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    public int getPeso() {
        return peso;
    }
    
    //------------------------------
    
    public void setCola(Boolean cola) {
        this.cola = cola;
    }
    public Boolean getCola() {
        return cola;
    }
    
    //------------------------------
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    
    //------------------------------
    
    @Override
    public String toString() {
        return "Datos: " + "apodo=" + apodo + ", peso=" + peso + ", cola=" + cola + ", raza=" + raza;
    }
}
