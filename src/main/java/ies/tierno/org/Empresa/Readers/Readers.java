package ies.tierno.org.Empresa.Readers;

import java.util.Scanner;

public class Readers {

    public static Readers readEmpresa(Scanner sc) {
        System.out.print("Introduce el nombre de la empresa: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el CIF de la empresa: ");
        String cif = sc.nextLine();
        return new Readers(nombre, cif);
    }
}

public class DepartamentoReader {
    public static Departamento readDepartamento(Scanner sc) {
        System.out.print("Introduce el nombre del departamento: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el presupuesto: ");
        double presupuesto = Double.parseDouble(sc.nextLine());
        return new Departamento(nombre, presupuesto);
    }
}

public class EmpleadoReader {
    public static Empleado readEmpleado(Scanner sc) {
        System.out.print("Introduce el NIF del empleado: ");
        String nif = sc.nextLine();
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce los apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Introduce el puesto: ");
        String puesto = sc.nextLine();
        return new Empleado(nif, nombre, apellidos, puesto);
    }
}
