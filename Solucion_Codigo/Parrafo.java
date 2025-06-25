package Codigo.Problema1;
import java.util.ArrayList;

public class Parrafo {
    private ArrayList<Oracion> oraciones;

    public Parrafo() {
        this.oraciones = new ArrayList<>();
    }

    public void agregarOracion(Oracion o) {
        oraciones.add(o);
    }

    public ArrayList<Oracion> getOraciones() {
        return oraciones;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Oracion o : oraciones) {
            sb.append("      ").append(o).append("\n");
        }
        return sb.toString();
    }
}
