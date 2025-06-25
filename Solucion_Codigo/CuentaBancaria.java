package Codigo.Problema6;

public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected String nombreCliente;
    protected double balance;

    public CuentaBancaria(String numeroCuenta, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.balance = 0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            balance += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto <= balance) {
            balance -= monto;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String toString() {
        return "Cuenta: " + numeroCuenta + ", Cliente: " + nombreCliente + ", Balance: $" + balance;
    }
}

