/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio25;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Producto {
    
    private Integer isbn;
    private String producto;
    private Double precio;

    public Producto() {
    }

    public Producto(Integer isbn, String producto, Double precio) {
        this.isbn = isbn;
        this.producto = producto;
        this.precio = precio;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "isbn=" + isbn + ", producto=" + producto + ", precio=" + precio + '}';
    }
    
    

}
