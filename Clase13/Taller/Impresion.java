public class Impresion extends Producto {

    private String color;
    private Foto foto;
    private String tamanio;

    public Impresion(int id, String nombre, int precio, boolean disponible, String color, Foto foto, String tamanio){
        super(id, nombre, precio, disponible);
        this.color = color;
        this.foto = foto;
        this.tamanio = tamanio;
    }

    public void imprimir(){
        if (super.estaDisponible()){
            System.out.println("{ Imprimiendo foto en " + color + ", Tamaño: " + tamanio + " }");
            foto.print();
        } else {
            System.out.println("{Error: La impresora actualmente no se encuentra disponible}");
            
        }
    }
    
}
