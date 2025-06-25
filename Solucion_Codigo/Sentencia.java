package Codigo.Problema1;
import java.util.ArrayList;

class Sentencia {
    private ArrayList<Palabra> palabras;

    public Sentencia() {
        palabras = new ArrayList<>();
    }

    public void agregarPalabra(Palabra p) {
        palabras.add(p);
    }

    public ArrayList<Palabra> getPalabras() {
        return palabras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Palabra p : palabras) {
            sb.append(p.getTexto()).append(" ");
        }
        return sb.toString().trim();
    }
}
