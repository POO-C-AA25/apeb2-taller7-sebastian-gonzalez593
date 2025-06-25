package Codigo.Problema3;

public class Movil {
    private String numero;
    private String nombre;

    public Movil(String numero) {
        this.numero = numero;
    }

    public Movil(String numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre != null ? nombre : "Sin nombre";
    }

    @Override
    public String toString() {
        return getNombre() + " (" + numero + ")";
    }
}

