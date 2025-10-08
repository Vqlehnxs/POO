import java.util.Scanner;

public class EjecutarOpeMat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                int opcion;
        
        do {
        System.out.print("ingrese el primer numero...");
        int a = sc.nextInt();
        System.out.print("ingrese el segundo numero...");
        int b = sc.nextInt();
        OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
         
            System.out.println("===== CALCULADORA =====");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Elevar a la potencia de 2");
            System.out.println("6) Elevar a la 3");
            System.out.println("7) Elevar a un numero deseado");
            System.out.println("8) Salir");
            System.out.println("=======================");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            
    
            switch (opcion) {
                case 1:
                    System.out.println("\nHa seleccionado: Sumar");
                    System.out.println("El resultado de la suma es: " + objOp.sumar());
                 
                    break;
                    
                case 2:
                    System.out.println("\nHa seleccionado: Restar");
                    System.out.println("El resultado de la resta es: " + objOp.restar());
                 
                    break;
                    
                case 3:
                    System.out.println("\nHa seleccionado: Multiplicar");
                    System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
              
                    break;
                    
                case 4:
                    System.out.println("\nHa seleccionado: Dividir");
                     System.out.println("el resultado de la division es: " + objOp.dividir());
                 
                    break;
                    
                case 5:
                    System.out.println("\nHa seleccionado: Elevar a la potencia de 2");
                     System.out.println("el resultado de elevar el primer numero al cuadrado es: " + objOp.elevarCuadrado());
                  
                    break;

                                case 6:
                    System.out.println("\nHa seleccionado: Elevar al cubo");
                    System.out.println("el resultado de elevar al cubo es " + objOp.elevarCubo());
                   
                    break;
                    
                case 7:
                    System.out.println("\nHa seleccionado: Elevar a la n");
                    System.out.println("el resultado de esta potencia del primer numero es " + objOp.elevarN());

                    break;

                case 8:
                    System.out.println("\nHasta luego!");
                    break;
                    
                default:
                    System.out.println("\nERROR. Ingrese una opcion valida.");

            
                    
            }
            
        } while (opcion != 8);

        sc.close();

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer numero...");
        int a = sc.nextInt();
        System.out.print("Digite el segundo numero...");
        int b = sc.nextInt();
        sc.close();
        */
        /*Para leer enteros: nextInt() o nextLong()
         * Para leer reales: nextDouble() o nextFloat()
         * Para leer cadenas: next() o nextLine()
         * Para leer booleanos: nextBoolean()
         */
        
        /*OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);

        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta es: " + objOp.restar());
        System.out.println("El resultado de la multiplicar es: " + objOp.multiplicar());
        System.out.println("El resultado de la dividir es: " + objOp.dividir());
        
        /*Tarea implementar los metodos elevar al cuadrado, al cubo, a la n, sacar raiz cuadrada, raiz cubica y sacar la raiz 
        *n. todo lo anterior con un menu
        */
    }
    
}
