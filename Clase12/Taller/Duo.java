public class Duo extends Menu{

    private int sandwhich;

    public Duo(String combo, int sandwhich) {
        super(combo);
        this.sandwhich = sandwhich;
    }

    @Override
    public void descuento(){
        precio = 49.900 * 0.75; 
    }

    @Override
    public String info(){
        return " Esta pidiendo un " + combo + " (" + sandwhich + " Sandwhich deluxe) con un precio de " + precio + " Pesos colombianos. Con un descuento del 25%! ";
    }
}