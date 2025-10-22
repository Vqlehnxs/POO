public class Duo extends Menu{

    private int sandwich;

    public Duo(String combo, int sandwich) {
        super(combo);
        this.sandwich = sandwich;
    }

    @Override
    public void descuento(){
        precio = 49.900 * 0.75; 
    }

    @Override
    public String info(){
        return " Esta pidiendo un " + combo + " (" + sandwich + " Sandwich deluxe) con un precio de " + precio + " Pesos colombianos. Con un descuento del 25%! ";
    }
}