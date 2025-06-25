public class Zona {
    private String nombre;
    private int numLocalidades;
    private double precioNormal;
    private double precioAbonado;
    private int entradasVendidas;

    public Zona(String nombre, int numLocalidades, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.numLocalidades = numLocalidades;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
        this.entradasVendidas = 0;
    }

    public boolean hayLugar() {
        return entradasVendidas < numLocalidades;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    public String getNombre() {
        return nombre;
    }

    public void incrementarEntradasVendidas() {
        entradasVendidas++;
    }

    @Override
    public String toString() {
        return nombre + " (" + entradasVendidas + "/" + numLocalidades + ")";
    }
}