package Codigo.Problema2;

public class VHS extends Pelicula {
    private String tipoCinta;

    public VHS(String titulo, String autor, int anio, double precioBase, String tipoCinta) {
        super(titulo, autor, anio, precioBase);
        this.tipoCinta = tipoCinta;
    }

    public String getTipoCinta() {
        return tipoCinta;
    }

    @Override
    public double calcularPrecioAlquiler() {
        return precioBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de cinta: " + tipoCinta + ", Precio alquiler: $" + calcularPrecioAlquiler();
    }
}
