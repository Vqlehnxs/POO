public class PracticaCondicionales{

public static void main(String[] args) {
    /*Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua” sino visualizar el mensaje “por
    debajo del punto de ebullición del agua”. */
    int temp = 100;
    if (temp > 100){
        System.out.println("Por encima del punto de ebullicion del agua");
    }
    else{
        System.out.println("Debajo del punto de ebullicion del agua");
    }
    
    /* Si el número es positivo, sumar el número a total
    de positivos, sino sumar al total de negativos. */
    int numero = -6;
    int totalPositivos = 0;
    int totalNegativos = 0;
    if (numero > 0){
        totalPositivos += numero;
    }
    else{
        totalNegativos += numero;
    }
    System.out.println("Total de positivos:  " + totalPositivos);
    System.out.println(" Total de negativos: " + totalNegativos);
    /*  Si x es mayor que y, y z es menor que 20, leer
    un valor para p */
    int x = 7;
    int y = 5;
    int z = 15;
    int p = 0;
    if (x > y && z < 20){
        System.out.println("El valor de P es: " + p);
    }
    else{
        System.out.println("No se cumple la condicion");
    }
    /* Si distancia es mayor que 20 y menos que 35,
    leer un valor para tiempo. */
    int distancia = 27;
    int tiempo = 0;
    if (distancia > 20 && distancia < 35){
        System.out.println("El valor de tiempo es: " + tiempo);
    }
    
}





}