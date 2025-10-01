import java.util.Scanner;

public class EjecutarOpeMat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, escoge una de las opciones.\n 1) Sumar \n 2) Restar \n 3) Multiplicar \n 4) Dividir \n 5) Elevar ");
        System.out.println("Digite el numero para realizar la operacion...");
        int p = sc.nextInt();
        if (p == 1){
            System.out.println("Digita el primer numero...");
            int a = sc.nextInt();
            System.out.println("Digite el segundo numero...");
            int b = sc.nextInt();
            OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
            System.out.println("El resultado de la suma es: " + objOp.sumar());

        } else if (p == 2){
            System.out.println("Digita el primer numero...");
            int a = sc.nextInt();
            System.out.println("Digite el segundo numero...");
            int b = sc.nextInt();
            OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
            System.out.println("El resultado de la resta es: " + objOp.restar());
        } else if (p == 3){
            System.out.println("Digita el primer numero...");
            int a = sc.nextInt();
            System.out.println("Digite el segundo numero...");
            int b = sc.nextInt();
            OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
            System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
        } else if (p == 4){
            System.out.println("Digita el primer numero...");
            int a = sc.nextInt();
            System.out.println("Digite el segundo numero...");
            int b = sc.nextInt();
            OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
            System.out.println("El resultado de la division es: " + objOp.dividir());
        } else if (p == 5){
            System.out.println("Escoge el metodo para elevar. \n 1) Al cuadrado \n 2) Al cubo \n 3) A la N");
            int x = sc.nextInt();
            if (x == 1){
                System.out.println("Digita el primer numero...");
                int a = sc.nextInt();
                int b = 0;
                OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
                System.out.println("El resultado de elevar al cuadrado es: " + objOp.elevarCuadrado());
            } else if (x == 2){
                System.out.println("Digita el primer numero...");
                int a = sc.nextInt();
                int b = 0;
                OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
                System.out.println("El resultado de elevar al cuadrado es: " + objOp.elevarCubo());
            } else if (x == 3){
                System.out.println("Digita el primer numero...");
                int a = sc.nextInt();
                System.out.println("Digite la cantidad que va a elevar...");
                int b = sc.nextInt();
                OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
                System.out.println("El resultado de elevar al cuadrado es: " + objOp.elevarN());
            } else {
                System.out.println("Error, no digito ninguna opcion");
            }
            
        } else{
            System.out.println("Error no digito ninguna opcion");
        }

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
