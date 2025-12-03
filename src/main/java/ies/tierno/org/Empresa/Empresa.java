package ies.tierno.org.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String cif;
    private List<Departamento> departamentos;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento d) {
        departamentos.add(d);
    }

    @Override
    public String toString() {
        return "Empresa [Nombre=" + nombre + ", CIF=" + cif + ", Departamentos=" + departamentos.size() + "]";
    }
}
