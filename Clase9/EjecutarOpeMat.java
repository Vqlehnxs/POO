import java.util.Scanner;

public class EjecutarOpeMat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer numero...");
        int a = sc.nextInt();
        System.out.print("Digite el segundo numero...");
        int b = sc.nextInt();
        sc.close();
        /*Para leer enteros: nextInt() o nextLong()
         * Para leer reales: nextDouble() o nextFloat()
         * Para leer cadenas: next() o nextLine()
         * Para leer booleanos: nextBoolean()
         */
        
        OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);

        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta es: " + objOp.restar());
        System.out.println("El resultado de la multiplicar es: " + objOp.multiplicar());
        System.out.println("El resultado de la dividir es: " + objOp.dividir());
        
        /*Tarea implementar los metodos elevar al cuadrado, al cubo, a la n, sacar raiz cuadrada, raiz cubica y sacar la raiz 
        *n. todo lo anterior con un menu
        */
    }
    
}
