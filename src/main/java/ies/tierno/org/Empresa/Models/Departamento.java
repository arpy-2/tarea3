package ies.tierno.org.Empresa.Models;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private double presupuesto;
    private List<Empleado> empleados;

    public Departamento(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }

    @Override
    public String toString() {
        return "Departamento [Nombre=" + nombre + ", Presupuesto=" + presupuesto + ", Empleados=" + empleados.size() + "]";
    }
}
