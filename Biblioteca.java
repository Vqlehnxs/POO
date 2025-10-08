import Clase10.Libro;

public class Biblioteca {
    public static void main(String[] args) {
        //Creacion del primer objeto
        System.out.println("--- Creacion de 'Cien Años de Soledad' ---");
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 496);
        
        //Uso del toString y un getter
        System.out.println("Datos iniciales: " + libro1);
        System.out.println("El autor del libro es: " + libro1.getAutor());

        //uso de un setter y un metodo de negocio
        libro1.setAniodepublicacion(1970);
        libro1.prestar();

        //Verificar estado con toString
        System.out.println("Datos actualizados: " + libro1);

        //Creacion de un segundo objeto
        System.out.println("\n--- Agregando 'La iliada' ---");
        Libro libro2 = new Libro("La iliada", "Homero", -750, 600);
        libro2.prestar();
    }
    
}
