package Codigo.Problema6;

public class Problema6_Banco {
     public static void main(String[] args) {
        Banco banco = new Banco();

        CuentaBancaria c1 = new CuentaCheques("001", "Luis Perez");
        CuentaBancaria c2 = new CuentaAhorros("002", "Ana Torres");
        CuentaBancaria c3 = new CuentaPlatino("003", "Carlos Ruiz");

        c1.depositar(500);
        c1.retirar(600); 

        c2.depositar(1000);
        c2.retirar(300);
        ((CuentaAhorros)c2).calcularInteres();

        c3.depositar(2000);
        ((CuentaPlatino)c3).calcularInteres();

        banco.agregarCuenta(c1);
        banco.agregarCuenta(c2);
        banco.agregarCuenta(c3);

        banco.mostrarSaldos();
    }
}
