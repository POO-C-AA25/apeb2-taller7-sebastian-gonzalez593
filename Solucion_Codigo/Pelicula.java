package Codigo.Problema2;

public abstract class Pelicula {
    protected String titulo;
    protected String autor;
    protected int anio;
    protected double precioBase;

    public Pelicula(String titulo, String autor, int anio, double precioBase) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioAlquiler();

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnio() { return anio; }
    public double getPrecioBase() { return precioBase; }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + anio + ", Precio base: $" + precioBase;
    }
}
