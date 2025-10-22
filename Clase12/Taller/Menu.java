public class Menu {
    
    protected String combo;
    protected double precio;

    public Menu(String combo){
        this.combo = combo;
        this.precio = 0;
    }

    public void descuento(){
        precio *= 0.85; 
    }

    public String info(){
        return " Esta pidiendo un " + combo + " con un precio de " + precio + " Con un descuento del xx%! ";
    }
}
