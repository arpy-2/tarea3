package ies.tierno.org.Empresa.Readers;

import java.util.Scanner;
import ies.tierno.org.Empresa.Models.Empresa; // importa tu modelo

public class EmpresaReader {
    public static Empresa readEmpresa(Scanner sc) {
        System.out.print("Introduce el nombre de la empresa: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el CIF de la empresa: ");
        String cif = sc.nextLine();

        // devolvemos un objeto Empresa, no EmpresaReader
        return new Empresa(nombre, cif);
    }
}
