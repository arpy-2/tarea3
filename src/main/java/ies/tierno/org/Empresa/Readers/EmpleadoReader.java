package ies.tierno.org.Empresa.Readers;

import java.util.Scanner;
import ies.tierno.org.Empresa.Models.Empleado;

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
