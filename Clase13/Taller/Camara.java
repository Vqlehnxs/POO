public class Camara extends Producto {
    
    private String marca;
    private String modelo;
    private String resolucion;

    public Camara(int id, String nombre, int precio, boolean disponible, String marca, String modelo, String resolucion){
        super(id, nombre, precio, disponible);
        this.marca = marca;
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

    public void tomarFoto(String nombreArchivo){
        if (super.estaDisponible()){
            System.out.println("{ Foto tomado con " + marca + " " + modelo + " }");
            System.out.println("{ Archivo: " + nombreArchivo + " }");

        } else {
            System.out.println("{ Error: la camara no esta disponible }");
        }
    }
}
