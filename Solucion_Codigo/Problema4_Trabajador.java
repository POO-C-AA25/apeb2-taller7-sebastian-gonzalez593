package Codigo.Problema4;

public class Problema4_Trabajador {
     public static void main(String[] args) {
        Jefe jefe = new Jefe("Carlos", "Lopez", "Quito", "1102938475", 1500);

        FijoMensual fm = new FijoMensual("Ana", "Martínez", "Loja", "1728394050", 800);
        fm.setJefe(jefe);

        Comisionista com = new Comisionista("Luis", "Zambrano", "Cuenca", "1928374650", 0.10);
        com.registrarVentas(5000);
        com.setJefe(jefe);

        PorHoras ph = new PorHoras("Diana", "Pérez", "Ambato", "1839472650", 10, 15);
        ph.registrarHoras(45);
        ph.setJefe(jefe);

        System.out.printf("%s - Sueldo: $%.2f\n", fm.toString(), fm.calcularSueldo());
        System.out.printf("%s - Sueldo: $%.2f\n", com.toString(), com.calcularSueldo());
        System.out.printf("%s - Sueldo: $%.2f\n", ph.toString(), ph.calcularSueldo());
        System.out.printf("%s - Sueldo: $%.2f\n", jefe.toString(), jefe.calcularSueldo());
    }
}
