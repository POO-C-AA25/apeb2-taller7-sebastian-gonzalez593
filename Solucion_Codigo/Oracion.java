package Codigo.Problema1;

import java.util.ArrayList;

public class Oracion {
    private ArrayList<Palabra> palabras;

    public Oracion() {
        this.palabras = new ArrayList<>();
    }

    public void agregarPalabra(Palabra p) {
        palabras.add(p);
    }

    public ArrayList<Palabra> getPalabras() {
        return palabras;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Palabra p : palabras) {
            sb.append(p).append(" ");
        }
        return sb.toString().trim();
    }
}