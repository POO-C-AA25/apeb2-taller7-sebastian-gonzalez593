package Codigo.Problema2;

import java.util.ArrayList;

public class DVD extends Pelicula {
    private ArrayList<String> idiomas;

    public DVD(String titulo, String autor, int anio, double precioBase) {
        super(titulo, autor, anio, precioBase);
        this.idiomas = new ArrayList<>();
    }

    public void agregarIdioma(String idioma) {
        idiomas.add(idioma);
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    @Override
    public double calcularPrecioAlquiler() {
        return precioBase * 1.10; // 10% más caro
    }

    @Override
    public String toString() {
        return super.toString() + ", Idiomas: " + idiomas + ", Precio alquiler: $" + calcularPrecioAlquiler();
    }
}
