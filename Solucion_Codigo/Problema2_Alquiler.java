package Codigo.Problema2;

public class Problema2_Alquiler {
    public static void main(String[] args) {
        DVD dvd1 = new DVD("Matrix", "Wachowski", 1999, 3.00);
        dvd1.agregarIdioma("Inglés");
        dvd1.agregarIdioma("Español");

        VHS vhs1 = new VHS("Jurassic Park", "Spielberg", 1993, 2.50, "Cinta magnética estándar");

        System.out.println("Película en DVD:\n" + dvd1 + "\n");
        System.out.println("Película en VHS:\n" + vhs1);
    }
}
