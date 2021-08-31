package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nombre;
    
    public Autor() {
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ID del Autor: "+id+"\n"
             + "Nombre del Autor: "+nombre;
    }
    
}
