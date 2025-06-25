package Codigo.Problema6;

import java.util.ArrayList;

public class Banco {
    private ArrayList<CuentaBancaria> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void mostrarSaldos() {
        for (CuentaBancaria c : cuentas) {
            System.out.println(c);
        }
    }
}
