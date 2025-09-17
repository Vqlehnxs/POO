public class EjecutarPersona {
    public static void main(String[] args) {
        
        //Creacion del objeto
        //El operador "new" me permite instaciar el objeto
        Persona objPersona1; 
        objPersona1 = new Persona(1114323, "Jose manuel", "Pedrito de la cruz", 32, 1.73, 65);
        Persona objPersona2;
        objPersona2 = new Persona(1234435, "Rikishi", "Castillo", 25, 1.76, 87);
        System.out.println(objPersona2.estudiar("Ingenieria en Sistemas"));
        //Implementar los metodos get  y set en la clase persona
        //dichos metodos utilizarlos en la clase EjecutarPersona
    }
}
