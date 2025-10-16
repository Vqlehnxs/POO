package Clase11.VersionB;

public class Almacen {
    public static void main(String[] args) {
        Producto producto1 = new Producto("F1239", "Lapto Alienwere", 32, 50000);
        System.out.println(producto1.toString());
        System.out.println("El subtotal del producto es: " + producto1.calcularSubtotal());
        System.out.println("El subtotal despues de aplicar el descuento es: " + producto1.aplicarDescuento(43));
        producto1.incrementarCantidad(5);
        System.out.println("La cantidad despues de incrementar es: " + producto1.getCantidad());
    }
    
}
