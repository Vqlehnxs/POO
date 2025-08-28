import java.util.Scanner;

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
    /* Escribir un programa que solicite al usuario introducir
    dos números. Si el primer número introducido es mayor que el segundo número, el programa debe imprimir el mensaje El primer número es el mayor,
    en caso contrario el programa debe imprimir el mensaje El primer número es el más pequeño.
    Considerar el caso de que ambos números sean iguales e imprimir el correspondiente mensaje. */
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el primer numero: ");
    int num1 = sc.nextInt();
    System.out.println("Introduce el segundo numero: ");
    int num2 = sc.nextInt();
    if (num1 > num2){
        System.out.println("El primer numero es el mayor");
    }
    else if (num1 < num2){
        System.out.println("El primer numero es el mas pequeno");
    }
    else{
        System.out.println("Ambos numeros son iguales");
    }
    sc.close();
    /* Dados tres números deducir cuál es el central. */
    int a = 7;
    int b = 5;
    int c = 9;
    if ((a > b && a < c) || (a < b && a > c)){
        System.out.println("El numero central es: " + a);
    }
    else if ((b > a && b < c) || (b < a && b > c)){
        System.out.println("El numero central es: " + b);
    }
    else{
        System.out.println("El numero central es: " + c);
    }
    /* Calcular la raíz cuadrada de un número y escribir su
    resultado. Considerando el caso en que el número sea
    negativo. */
    int numeroRaiz = -4;
    if (numeroRaiz >= 0){
        double raiz = Math.sqrt(numeroRaiz);
        System.out.println("La raiz cuadrada de " + numeroRaiz + " es: " + raiz);
    }
    else{
        System.out.println("No se puede calcular la raiz cuadrada de un numero negativo");
    }
    /* Escribir los diferentes métodos para deducir si una
    variable o expresión numérica es par. */
    int numeroPar = 8;
    if (numeroPar % 2 == 0){
        System.out.println("El numero " + numeroPar + " es par");
    }
    else{
        System.out.println("El numero " + numeroPar + " es impar");
    }
    /* Diseñar un programa en el que a partir de una fecha
    introducida por teclado con el formato DIA, MES,
    AÑO se obtenga la fecha del día siguiente. */
    /*Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el dia: ");
    int dia = scanner.nextInt();
    System.out.println("Introduce el mes: ");
    int mes = scanner.nextInt();
    System.out.println("Introduce el año: ");
    int anio = scanner.nextInt();
    int[] diasEnMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
        diasEnMes[1] = 29; // Año bisiesto
    }
    dia++;
    if (dia > diasEnMes[mes - 1]){
        dia = 1;
        mes++;
        if (mes > 12){
            mes = 1;
            anio++;
        }
    }
    System.out.println("La fecha del dia siguiente es: " + dia + "/" + mes + "/" + anio);
    scanner.close();
    /*  Se desea realizar una estadística de los pesos de los
    alumnos de un colegio de acuerdo a la siguiente tabla:
    Alumnos de menos de 40 kg.
    Alumnos entre 40 y 50 kg.
    Alumnos de más de 50 kg y menos de 60 kg.
    Alumnos de más o igual a 60 kg. */
    int peso = 55;
    if (peso < 40){
        System.out.println("Alumno de menos de 40 kg");
    }
    else if (peso >= 40 && peso < 50){
        System.out.println("Alumno entre 40 y 50 kg");
    }
    else if (peso >= 50 && peso < 60){
        System.out.println("Alumno de mas de 50 kg y menos de 60 kg");
    }
    else{
        System.out.println("Alumno de mas o igual a 60 kg");
    }
    /*  Realizar un algoritmo que averigüe si dados dos números introducidos por teclado uno es divisor del otro.*/
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el primer numero: ");
    int numero1 = teclado.nextInt();
    System.out.println("Introduce el segundo numero: ");
    int numero2 = teclado.nextInt();
    if (numero1 % numero2 == 0){
        System.out.println(numero1 + " es divisor de " + numero2);
    }
    else if (numero2 % numero1 == 0){
        System.out.println(numero2 + " es divisor de " + numero1);
    }
    else{
        System.out.println("Ninguno de los dos numeros es divisor del otro");
    }
    teclado.close();
    /* Un ángulo se considera agudo si es menor de 90
    grados, obtuso si es mayor de 90 grados y recto si
    es igual a 90 grados. Utilizando esta información,
    escribir un algoritmo que acepte un ángulo en grados
    y visualice el tipo de ángulo correspondiente a los
    grados introducidos. */
    int angulo = 85;
    if (angulo < 90){
        System.out.println("El angulo es agudo");
    }
    else if (angulo > 90){
        System.out.println("El angulo es obtuso");
    }
    else{
        System.out.println("El angulo es recto");
    }
    /* El sistema de calificación americano (de Estados Unidos) se suele calcular de acuerdo al siguiente cuadro:
    mayor o igual a 90  A
    Menor de 90 pero mayor o igual a 80 B
    Menor de 80 pero mayor o igual a 70 C
    Menor de 70 pero mayor o igual a 69 D
    Menor de 69 F
    Utilizando esta información, escribir un algoritmo que acepte una calificación numérica del estudiante (0-100), convierta esta calificación a su
    equivalente en letra y visualice la calificación correspondiente en letra.
    */
    int calificacion = 85;
    if (calificacion >= 90){
        System.out.println("La calificacion es A");
    }
    else if (calificacion >= 80){
        System.out.println("La calificacion es B");
    }
    else if (calificacion >= 70){
        System.out.println("La calificacion es C");
    }
    else if (calificacion >= 60){
        System.out.println("La calificacion es D");
    }
    else{
        System.out.println("La calificacion es F");
    }
    /* Escribir un programa que seleccione la operación
    aritmética a ejecutar entre dos números dependiendo
    del valor de una variable denominada seleccionOp. */
    int numA = 10;
    int numB = 5;
    int resultado = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Selecciona la operacion a realizar (+, -, *, /): ");
    char seleccionOp = input.next().charAt(0);
    input.close();
    if (seleccionOp == '+'){
        resultado = numA + numB;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    else if (seleccionOp == '-'){
        resultado = numA - numB;
        System.out.println("El resultado de la resta es: " + resultado);
    }
    else if (seleccionOp == '*'){
        resultado = numA * numB;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }
    else if (seleccionOp == '/'){
        if (numB != 0){
            resultado = numA / numB;
            System.out.println("El resultado de la division es: " + resultado);
        }
        else{
            System.out.println("No se puede dividir entre cero");
        }
    }
    else{
        System.out.println("Operacion no valida");
    }
}





}