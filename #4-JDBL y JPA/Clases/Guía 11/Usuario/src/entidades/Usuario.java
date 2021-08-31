package entidades;

public class Usuario {

    private Integer clave;
    private String nombre;
    private String correoElectronico;
    private Integer edad;

    public Usuario(Integer clave, String nombre, String correoElectronico, Integer edad) {
        this.clave = clave;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
    }

    public Usuario() {
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "clave=" + clave + ", nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", edad=" + edad + '}';
    }

}
