/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.Comparator;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Libro {

    private String titulo;
    private String autor;
    private Integer total;
    private Integer prestados;

    public Libro() {
        this.prestados = 0;
    }

    public Libro(String titulo, String autor, Integer total, Integer prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.total = total;
        this.prestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    public static Comparator<Libro> compararTitulo = new Comparator<Libro>() {
            @Override
        public int compare(Libro o1, Libro o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", total=" + total + ", prestados=" + prestados + '}';
    }

}
