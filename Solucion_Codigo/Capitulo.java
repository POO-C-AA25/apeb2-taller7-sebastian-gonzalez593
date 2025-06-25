package Codigo.Problema1;
import java.util.ArrayList;

public class Capitulo {
    private String titulo;
    private ArrayList<Seccion> secciones;

    public Capitulo(String titulo) {
        this.titulo = titulo;
        this.secciones = new ArrayList<>();
    }

    public void agregarSeccion(Seccion s) {
        secciones.add(s);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public ArrayList<Seccion> getSecciones() {
        return secciones;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Capítulo: " + titulo + "\n");
        for (Seccion s : secciones) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }
}
