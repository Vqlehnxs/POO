
public class OperacionesMatematicas {

    //Atributos
    private int n1;
    private int n2;

    //Constructor de la clase
    //Tiene el mismo nombre de la clase
    /*
     * Firma del constructor
     * Visibilidad publico
     * nombre; OperacionMatematica
     * Cuantos parametros: 2
     */
    public OperacionesMatematicas(int n1, int n2){
        this.n1 = n1; //This. significa una referencia a la clase
        this.n2 = n2;
    }

    //Metodos

    public int sumar(){
        return n1 + n2;
    }
}
