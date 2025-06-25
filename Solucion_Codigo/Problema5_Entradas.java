public class Problema5_Entradas {
      public static void main(String[] args) {
        Teatro teatro = new Teatro();

        teatro.venderEntrada("Principal", "normal", "Carlos Rojas");
        teatro.venderEntrada("Central", "reducida", "Ana Pérez");
        teatro.venderEntrada("Lateral", "abonado", "Luis Gómez");
        teatro.venderEntrada("PalcoB", "normal", "Sofía Torres");

        System.out.println(teatro.consultarEntrada(1));
        System.out.println(teatro.consultarEntrada(3));
        teatro.consultarEntrada(10); // No existe
    }
}
