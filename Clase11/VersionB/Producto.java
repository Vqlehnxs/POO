package Clase11.VersionB;

public class Producto {
    
    //Atributos
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    //Constructor por defecto
    public Producto(){
        this.codigo = "0000";
        this.descripcion = "No hay descripcion";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }

    //Constructor parametrizado
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario){
        if (codigo == null || codigo.length() < 4) {
            throw new IllegalArgumentException("El codigo del producto debe tener 4 digitos");
        }
        if (descripcion == null || descripcion.isEmpty()){
            throw new IllegalArgumentException("Debe haber una descripcion del producto");
        }
        if (cantidad < 0){
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        if (precioUnitario < 0){
            throw new IllegalArgumentException("El precio unitario no puede ser negativo");
        }

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    //Getters y Setters
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        if (codigo == null || codigo.length() < 4) {
            throw new IllegalArgumentException("El codigo del producto debe tener 4 digitos");
        }
        this.codigo = codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        if (descripcion == null || descripcion.isEmpty()){
            throw new IllegalArgumentException("Debe haber una descripcion del producto");
        }
        this.descripcion = descripcion;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        if (cantidad < 0){
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.cantidad = cantidad;
    }
    public double getPrecioUnitario(){
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario){
        if (precioUnitario < 0){
            throw new IllegalArgumentException("El precio unitario no puede ser negativo");
        }
        this.precioUnitario = precioUnitario;
    }

    //Metodo para calcular el subtotal
    public double calcularSubtotal(){
        return cantidad * precioUnitario;
    }

    //Metodo de descuento aplica si o porcentaje 50%
    public double aplicarDescuento(double porcentaje){
        if (porcentaje < 0 || porcentaje > 100){
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100");
        }
        double descuento = (porcentaje / 100) * calcularSubtotal();
        return calcularSubtotal() - descuento;
    }

    //Metodo incrementar valor, aumenta si el valo > 0
    public void incrementarCantidad(int valor){
        if (valor > 0){
            this.cantidad += valor;
        } else {
            throw new IllegalArgumentException("El valor a incrementar debe ser mayor a 0");
        }
    }

    //Metodo toString
    @Override
    public String toString(){
        return "{ Codigo: " + codigo + ", Descripcion: " + descripcion + ", Cantidad: " + cantidad + ", Precio Unitario: $" + precioUnitario + " }";
    }
    
}
