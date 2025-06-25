package Codigo.Problema1;

public class Figura {
    private String descripcion;

    public Figura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String d) {
        this.descripcion = d;
    }

    public String toString() {
        return descripcion;
    }
}