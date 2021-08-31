package eggjpa.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mascota {

    @Id
//    @GeneratedValue
    private String id;

    private String nombre;

    @OneToMany
    private List<Pulga> pulgas;

    public Mascota() {
    }

    public Mascota(String id, String nombre, List<Pulga> pulgas) {
        this.id = id;
        this.nombre = nombre;
        this.pulgas = pulgas;
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

    public List<Pulga> getPulgas() {
        return pulgas;
    }

    public void setPulgas(List<Pulga> pulgas) {
        this.pulgas = pulgas;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", pulgas=" + pulgas + '}';
    }

}
