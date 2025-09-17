public class Persona{

    //Atributos
    private int indentificacion; 
    private String nombres;
    private String apellido;
    private int edad;
    private double altura;
    private double peso;
    
    //Metodo constructor de la clase se reconoce por que tiene el mismo nombre de la clase
    //El constructor me permite inicializar la clase
    //La palabra reservada "This" me permite referenciar los atributos de la clase
    public Persona(int indentificacion, String nombres, String apellidos, int edad, double estatura, double peso){
        this.indentificacion = indentificacion;
        this.nombres = nombres;
        this.apellido = apellidos;
        this.edad = edad;
        this.altura = estatura;
        this.peso = peso;
    }
    //Metodos
    public void caminar(){
        System.out.println("Caminar");
    }
    public boolean jugar(){
        return true;
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public String estudiar(String carrera){
        return "Usted esta estudiando: " + carrera;
    }

    //Tarea Consultar sobre el metodo toString
}