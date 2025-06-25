package Codigo.Problema4;

public class FijoMensual extends Trabajador {
    private double sueldoMensual;

    public FijoMensual(String nombre, String apellidos, String direccion, String dni, double sueldo) {
        super(nombre, apellidos, direccion, dni);
        this.sueldoMensual = sueldo;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
}
