package ejercicio34;

public class Polideportivo implements InstalacionDeportiva, Edificio {
    
    private String nombre;

    public Polideportivo() {
    }

    public Polideportivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTipoDeInstalacion() {
        return "Polideportivo";
    }

    @Override
    public Double getSuperficieEdificio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
