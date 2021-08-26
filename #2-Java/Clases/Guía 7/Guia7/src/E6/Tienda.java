/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas, como introducir un elemento,
modificar su precio, eliminar un producto y mostrar los productos que tenemos
con su precio (Utilizar Hashmap).
*/

package E6;

public class Tienda {
    
    private String producto;
    private double precio;
    
    public Tienda(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }
    
    public Tienda() {
    }
    
    public String getProducto() {
        return producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
