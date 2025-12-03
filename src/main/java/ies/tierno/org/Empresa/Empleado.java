package ies.tierno.org.Empresa;

public class Empleado {
    private String nif;
    private String nombre;
    private String apellidos;
    private String puesto;

    public Empleado(String nif, String nombre, String apellidos, String puesto) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    @Override
    public String toString() {
        return "Empleado [NIF=" + nif + ", Nombre=" + nombre + " " + apellidos + ", Puesto=" + puesto + "]";
    }
}
