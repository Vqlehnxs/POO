public class Box extends Menu{

    private int pop;

    public Box(String combo, int pop) {
        super(combo);
        this.pop = pop;
    }

    @Override
    public void descuento(){
        precio = 27.900 * 0.95; 
    }

    @Override
    public String info(){
        return " Esta pidiendo un " + combo + " (" + pop + " Pop Corn Pequeño) con un precio de " + precio + " Pesos colombianos. Con un descuento del 5%! ";
    }
}