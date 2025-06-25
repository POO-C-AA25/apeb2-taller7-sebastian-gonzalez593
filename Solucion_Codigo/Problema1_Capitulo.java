package Codigo.Problema1;

public class Problema1_Capitulo {
     public static void main(String[] args) {
        Capitulo capitulo = new Capitulo("Introducción a la Programación");

        Seccion seccion = new Seccion("Conceptos Básicos");

        Parrafo parrafo = new Parrafo();
        Oracion oracion1 = new Oracion();
        oracion1.agregarPalabra(new Palabra("Hola"));
        oracion1.agregarPalabra(new Palabra("mundo."));

        Oracion oracion2 = new Oracion();
        oracion2.agregarPalabra(new Palabra("Esto"));
        oracion2.agregarPalabra(new Palabra("es"));
        oracion2.agregarPalabra(new Palabra("una"));
        oracion2.agregarPalabra(new Palabra("prueba."));

        parrafo.agregarOracion(oracion1);
        parrafo.agregarOracion(oracion2);
        seccion.agregarParrafo(parrafo);

        Figura figura = new Figura("Diagrama de clases UML");
        seccion.agregarFigura(figura);

        capitulo.agregarSeccion(seccion);

        System.out.println(capitulo);
    }
}
