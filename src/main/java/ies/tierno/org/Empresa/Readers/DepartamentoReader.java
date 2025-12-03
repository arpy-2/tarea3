package ies.tierno.org.Empresa.Readers;

import java.util.Scanner;
import ies.tierno.org.Empresa.Models.Departamento;

public class DepartamentoReader {
    public static Departamento readDepartamento(Scanner sc) {
        System.out.print("Introduce el nombre del departamento: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el presupuesto: ");
        double presupuesto = Double.parseDouble(sc.nextLine());

        return new Departamento(nombre, presupuesto);
    }
}
