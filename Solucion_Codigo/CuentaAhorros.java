package Codigo.Problema6;

public class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    @Override
    public boolean retirar(double monto) {
        if (monto <= balance) {
            balance -= monto;
            return true;
        }
        return false;
    }

    public void calcularInteres() {
        double interes = balance * 0.03;
        balance += interes;
    }
}