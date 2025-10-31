import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private Date fecha;
    private int numeroTarjeta;
    private Foto foto;

    public Pedido(Cliente cliente, Producto producto, Date fecha, int numeroTarjeta, Foto foto) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjeta = numeroTarjeta;
        this.foto = foto;
    }



    public void informePedido() {
        System.out.println("=== INFORMACIÓN DEL PEDIDO === \n Cliente: " + cliente.getNombre() + " \n Producto: " + producto.getNombre() + " \n Precio: $" + producto.valorProducto() + "\n Fecha: " + fecha + "\n Tarjeta: "+ numeroTarjeta);
    }

    public void detallePedido(){
        System.out.println("=== DETALLES DEL PEDIDO === \n Cedula del cliente: " + cliente.getCedula() + "\n Id de producto: " + producto.getId() + "\n === DETALLES DE LA FOTO == ");
        foto.print();
    }

    public int calcularTotal() {
        return producto.valorProducto();
    }
}
