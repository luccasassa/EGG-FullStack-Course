package Entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Curso {
    
    @Id
    private Integer id;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    private Integer costo;
    
    @OneToOne
    private Profesor profesor;
    @OneToMany
    private List<Alumno> alumno;

    public Curso() {
    }

    public Curso(Integer id, String nombre, Date fechaFin, Date fechaInicio, Integer costo, Profesor profesor, List<Alumno> alumno) {
        this.id = id;
        this.nombre = nombre;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.costo = costo;
        this.profesor = profesor;
        this.alumno = alumno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(List<Alumno> alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", fechaFin=" + fechaFin + ", fechaInicio=" + fechaInicio + ", costo=" + costo + ", profesor=" + profesor + ", alumno=" + alumno + '}';
    }
}
