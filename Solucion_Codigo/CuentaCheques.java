package Codigo.Problema6;

public class CuentaCheques extends CuentaBancaria {
    public CuentaCheques(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    @Override
    public boolean retirar(double monto) {
        balance -= monto;
        return true;
    }
}