public class Balde extends Menu{

    private int alas;

    public Balde(String combo, int alas) {
        super(combo);
        this.alas = alas;
    }

    @Override
    public void descuento(){
        precio = 69.900 * 0.85;
        double precioRedondeado = Math.round(precio * 1000.0) / 1000.0;
        precio = precioRedondeado;
    }

    @Override
    public String info(){
        return " Esta pidiendo un " + combo + " (" + alas + " Alitas picantes) con un precio de " + precio + " Pesos colombianos. Con un descuento del 10%! ";
    }
}