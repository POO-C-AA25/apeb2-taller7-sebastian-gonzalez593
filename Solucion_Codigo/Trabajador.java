package Codigo.Problema4;

public class Trabajador {
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected String dni;
    protected Jefe jefe;

    public Trabajador(String nombre, String apellidos, String direccion, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public double calcularSueldo() {
        return 0;
    }

    public String toString() {
        return nombre + " " + apellidos + " - DNI: " + dni;
    }
}

