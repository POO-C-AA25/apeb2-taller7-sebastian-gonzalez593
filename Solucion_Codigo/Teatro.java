import java.util.ArrayList;

public class Teatro {
    private ArrayList<Zona> zonas;
    private ArrayList<Entrada> entradas;
    private int idActual;

    public Teatro() {
        zonas = new ArrayList<>();
        entradas = new ArrayList<>();
        idActual = 1;

        // Zonas predefinidas
        zonas.add(new Zona("Principal", 200, 25.0, 17.5));
        zonas.add(new Zona("PalcoB", 40, 70.0, 40.0));
        zonas.add(new Zona("Central", 400, 20.0, 14.0));
        zonas.add(new Zona("Lateral", 100, 15.5, 10.0));
    }

    public Entrada venderEntrada(String nombreZona, String tipo, String comprador) {
        Zona zona = buscarZona(nombreZona);
        if (zona == null) {
            System.out.println("Zona no encontrada.");
            return null;
        }

        if (!zona.hayLugar()) {
            System.out.println("Zona llena.");
            return null;
        }

        Entrada entrada = null;
        switch (tipo.toLowerCase()) {
            case "normal":
                entrada = new EntradaNormal(idActual, zona, comprador);
                break;
            case "reducida":
                entrada = new EntradaReducida(idActual, zona, comprador);
                break;
            case "abonado":
                entrada = new EntradaAbonado(idActual, zona, comprador);
                break;
            default:
                System.out.println("Tipo de entrada inválido.");
                return null;
        }

        zona.incrementarEntradasVendidas();
        entradas.add(entrada);
        idActual++;
        System.out.println("Entrada vendida. ID: " + entrada.getId() + ", Precio: $" + entrada.getPrecio());
        return entrada;
    }

    public Entrada consultarEntrada(int id) {
        for (Entrada e : entradas) {
            if (e.getId() == id) {
                return e;
            }
        }
        System.out.println("Entrada no encontrada.");
        return null;
    }

    public Zona buscarZona(String nombreZona) {
        for (Zona z : zonas) {
            if (z.getNombre().equalsIgnoreCase(nombreZona)) {
                return z;
            }
        }
        return null;
    }
}
