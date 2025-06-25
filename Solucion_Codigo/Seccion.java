package Codigo.Problema1;
import java.util.ArrayList;

public class Seccion {
    private String titulo;
    private ArrayList<Parrafo> parrafos;
    private ArrayList<Figura> figuras;

    public Seccion(String titulo) {
        this.titulo = titulo;
        this.parrafos = new ArrayList<>();
        this.figuras = new ArrayList<>();
    }

    public void agregarParrafo(Parrafo p) {
        parrafos.add(p);
    }

    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public ArrayList<Parrafo> getParrafos() {
        return parrafos;
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("  Sección: " + titulo + "\n");
        for (Parrafo p : parrafos) {
            sb.append("    Párrafo:\n").append(p).append("\n");
        }
        for (Figura f : figuras) {
            sb.append("    Figura: ").append(f).append("\n");
        }
        return sb.toString();
    }
}
