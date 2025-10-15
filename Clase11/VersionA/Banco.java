package Clase11.VersionA;

public class Banco {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Alexis Hernandez", "A1257", 150000); //Cuenta valida
        CuentaBancaria cuenta2 = new CuentaBancaria("Cristian Pasuy", "B2345", -65000); //Cuenta no valida
        //tener algo en cuenta al yo usar el throw new IllegalArgumentException, lo que hace esto, es que si hay un error dentro del codigo, lo detiene completamente, no sigue a la otra linea, detiene el codigo y muestra el mensaje.
        //Por lo tanto, si quiere ejecutar el codigo, arreglar el error, y luego volver a ejecutar el codigo.
        System.out.println(cuenta1.toString());

        cuenta1.depositar(50000);
        System.out.println("Despues de depositar 50000, el saldo es: " + cuenta1.getSaldo());
        cuenta1.retirar(20000);
        System.out.println("Despues de retirar 20000, el saldo es: " + cuenta1.getSaldo());
    }
    
}
