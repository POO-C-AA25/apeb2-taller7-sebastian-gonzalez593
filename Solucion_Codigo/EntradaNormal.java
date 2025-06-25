public class EntradaNormal extends Entrada {
    public EntradaNormal(int id, Zona zona, String comprador) {
        super(id, zona, comprador, zona.getPrecioNormal());
    }
}
