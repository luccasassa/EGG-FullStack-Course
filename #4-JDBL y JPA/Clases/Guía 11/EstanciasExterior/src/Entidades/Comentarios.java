package Entidades;

import java.util.Date;

public class Comentarios extends Casas{
    
    private Integer idComentario;
    private Integer idCasa;
    private String comentario;

    public Comentarios() {
        super();
    }
    
    public Comentarios(Integer idCasa, String calle, Integer numero, Integer codigoPostal, String ciudad, String pais, Date fechaDesde, Date fechaHasta, Integer tiempoMinimo, Integer tiempoMaximo, Double precioHabitacion, String tipoVivienda) {
        super(idCasa, calle, numero, codigoPostal, ciudad, pais, fechaDesde, fechaHasta, tiempoMinimo, tiempoMaximo, precioHabitacion, tipoVivienda);
    }

    public Comentarios(Integer idComentario, Integer idCasa, String comentario) {
        this.idComentario = idComentario;
        this.idCasa = idCasa;
        this.comentario = comentario;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "**COMENTARIOS**\n"
                + "idComentario= " + idComentario
                + ", comentario= " + comentario
                + "\n idCasa= " + idCasa
                + "Calle= " + calle
                + "num= " + numero
                + "codPos= " + codigoPostal
                + "ciudad= " + ciudad
                + "Pais= " + pais
                + "Fecha desde= " + fechaDesde
                + "Fecha Hasta= " + fechaHasta
                + "min= " + tiempoMinimo
                + "max=" + tiempoMaximo
                + "Precio x dia= " + precioHabitacion
                + "tipo de vivienda=" + tipoVivienda;
    }  
}
