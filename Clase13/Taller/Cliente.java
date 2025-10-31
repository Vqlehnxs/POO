public class Cliente {

    private int cedula;
    private String nombre;

    public Cliente(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "{ Nombre del cliente: " + nombre + ", Cedula: " + cedula + " }";
    }
}