public class Producto {

    private int id;
    private String nombre;
    private int precio;
    private boolean disponible;

    public Producto(int id, String nombre, int precio, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int valorProducto() {
        return precio;
    }

    public boolean estaDisponible() {
        return disponible;
    }
}
