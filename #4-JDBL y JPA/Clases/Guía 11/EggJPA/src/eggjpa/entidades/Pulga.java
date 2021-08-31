package eggjpa.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pulga {

    @Id
    private String id;

    private String nombre;

    public Pulga() {
    }

    public Pulga(String nombre) {
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
        return "Pulga{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
