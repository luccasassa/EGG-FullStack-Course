package Entidades;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long isbn;
    private String titulo;
    private Integer year;
    private Integer ejemplares;
    private Integer prestados;
    
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String titulo, Integer year, Integer ejemplares, Integer prestados, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.year = year;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "ISBN del libro: "+isbn+"\n"
             + "Título del libro: "+titulo+"\n"
             + "Año del libro: "+year+"\n"
             + "Ejemplares: "+ejemplares+"\n"
             + "Prestados: "+prestados+"\n"
             + "Autor: "+autor+"\n"
             + "Editorial: "+editorial;
    }
    
}
