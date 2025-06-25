package Codigo.Problema4;

public class Comisionista extends Trabajador {
    private double totalVentas;
    private double porcentaje;

    public Comisionista(String nombre, String apellidos, String direccion, String dni, double porcentaje) {
        super(nombre, apellidos, direccion, dni);
        this.porcentaje = porcentaje;
    }

    public void registrarVentas(double ventas) {
        this.totalVentas = ventas;
    }

    @Override
    public double calcularSueldo() {
        return totalVentas * porcentaje;
    }
}
