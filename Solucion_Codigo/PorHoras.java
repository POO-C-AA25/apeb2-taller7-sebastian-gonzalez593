package Codigo.Problema4;

public class PorHoras extends Trabajador {
    private int horasTrabajadas;
    private double tarifaBase;
    private double tarifaExtra;

    public PorHoras(String nombre, String apellidos, String direccion, String dni, double tarifaBase, double tarifaExtra) {
        super(nombre, apellidos, direccion, dni);
        this.tarifaBase = tarifaBase;
        this.tarifaExtra = tarifaExtra;
    }

    public void registrarHoras(int horas) {
        this.horasTrabajadas = horas;
    }

    @Override
    public double calcularSueldo() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaBase;
        } else {
            return 40 * tarifaBase + (horasTrabajadas - 40) * tarifaExtra;
        }
    }
}
