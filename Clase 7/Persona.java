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
    //Metodos get y set
    public int getIndentificacion() {
        return indentificacion;
    }
    public void setIndentificacion(int indentificacion) {
        this.indentificacion = indentificacion;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
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
    @Override
    public String toString() {
        return "El nombre es: " + nombres + ", Su apellido es: " + apellido + ", Su edad: " + edad + ", Su altura: " + altura +
        ", su peso es: " + peso;
    }

    //Tarea Consultar sobre el metodo toString
    // Hecho
}