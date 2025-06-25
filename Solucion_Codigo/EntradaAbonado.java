public class EntradaAbonado extends Entrada {
    public EntradaAbonado(int id, Zona zona, String comprador) {
        super(id, zona, comprador, zona.getPrecioAbonado());
    }
}
