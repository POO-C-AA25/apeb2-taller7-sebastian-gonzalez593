public abstract class Entrada {
    protected int id;
    protected Zona zona;
    protected String comprador;
    protected double precio;

    public Entrada(int id, Zona zona, String comprador, double precio) {
        this.id = id;
        this.zona = zona;
        this.comprador = comprador;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public Zona getZona() {
        return zona;
    }

    public String getComprador() {
        return comprador;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Entrada #" + id + " - Comprador: " + comprador +
               ", Zona: " + zona.getNombre() + ", Precio: $" + precio;
    }
}
