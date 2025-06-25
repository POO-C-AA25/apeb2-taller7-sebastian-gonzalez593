public class EntradaReducida extends Entrada {
    public EntradaReducida(int id, Zona zona, String comprador) {
        super(id, zona, comprador, zona.getPrecioNormal() * 0.85); // 15% de descuento
    }
}
