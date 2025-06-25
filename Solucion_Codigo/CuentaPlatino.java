package Codigo.Problema6;

public class CuentaPlatino extends CuentaBancaria {
    public CuentaPlatino(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularInteres() {
        double interes = balance * 0.10;
        balance += interes;
    }
}
