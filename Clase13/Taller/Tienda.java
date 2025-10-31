import java.util.Date;

public class Tienda {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(12345678, "María González");
        Foto foto = new Foto("1", "JPG", 140);
        Impresion impresion = new Impresion(1, "Impresión Premium", 45, true, "Color", foto, "A3");

        Pedido pedido = new Pedido(cliente, impresion, new Date(), 9653456, foto);

        pedido.informePedido();
        pedido.detallePedido();
        System.out.println("Total a pagar: $" + pedido.calcularTotal());
    }
}