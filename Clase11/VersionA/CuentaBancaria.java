package Clase11.VersionA;

public class CuentaBancaria {
    //Atributos

    private String titular;
    private String numeroCuenta;
    private double saldo;

    //Constructor por defecto
    public CuentaBancaria(){
        this.titular = "Sin titular";
        this.numeroCuenta = "00000";
        this.saldo = 0.0;
    }

    //Constructor parametrizado
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío");
        }
        if (numeroCuenta == null || numeroCuenta.length() < 5) {
            throw new IllegalArgumentException("El número de cuenta debe tener 5 dígitos");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser menor a 0");
        }
        
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

        //Getters y Setters

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        if (titular == null || titular.isEmpty()){
            throw new IllegalArgumentException("El titular no puede ir vacio");
        }
        this.titular = titular;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta){
        if (numeroCuenta == null || numeroCuenta.length() < 5){
            throw new IllegalArgumentException("El numero de cuenta debe tener al menos 5 digitos");
        }
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if (saldo < 0){
            throw new IllegalArgumentException("El saldo no puede ser menor a 0");
        }
        this.saldo = saldo;
    }

    //Metodo depositar

    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
        } else {
            throw new IllegalArgumentException("El monto que desea depositar debe ser positivo");
        }
    }

    //Metodo retirar
    public void retirar(double monto){
        if (monto > 0 && monto <= saldo){
            saldo -= monto;
        } else {
            throw new IllegalArgumentException("El monto que desea retirar debe ser positivo y no puede exceder el saldo actual");
        }
    }

    //Metodo toString
    @Override
    public String toString(){
        return "{ Titular: " + titular + ", Numero de Cuenta: " + numeroCuenta + ", Saldo: $" + saldo + " }";
    }



    
}
