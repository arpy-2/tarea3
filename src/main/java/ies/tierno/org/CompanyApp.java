package ies.tierno.org;

import ies.tierno.org.Empresa.Models.Departamento;
import ies.tierno.org.Empresa.Models.Empleado;
import ies.tierno.org.Empresa.Models.Empresa;
import ies.tierno.org.Empresa.Readers.EmpresaReader;

import java.util.Scanner;

public class CompanyApp {

    public void run() {
        Scanner sc = new Scanner(System.in);

        // Crear empresa
        Empresa empresa = EmpresaReader.readEmpresa(sc);

        // Añadir departamentos y empleados de ejemplo
        Departamento d1 = new Departamento("IT", 50000);
        d1.addEmpleado(new Empleado("123A", "Juan", "Pérez", "Programador"));
        d1.addEmpleado(new Empleado("456B", "Ana", "López", "Jefe de proyecto"));
        empresa.addDepartamento(d1);

        Departamento d2 = new Departamento("Marketing", 30000);
        d2.addEmpleado(new Empleado("789C", "Luis", "Martín", "Analista"));
        empresa.addDepartamento(d2);

        // Menú
        int opcion;
        do {
            System.out.println("1. Mostrar datos de un departamento");
            System.out.println("2. Mostrar empleados de un departamento");
            System.out.println("3. Mostrar datos de un empleado en un departamento");
            System.out.println("4. Salir");
            System.out.print("Elige opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Introduce nombre del departamento: ");
                    String depName = sc.nextLine();
                    Departamento dep = empresa.getDepartamentos().stream()
                            .filter(d -> d.getNombre().equalsIgnoreCase(depName))
                            .findFirst().orElse(null);
                    if (dep == null) {
                        System.out.println("No se encuentra el departamento");
                    } else {
                        System.out.println(dep);
                    }
                    break;

                case 2:
                    System.out.print("Introduce nombre del departamento: ");
                    depName = sc.nextLine();
                    dep = empresa.getDepartamentos().stream()
                            .filter(d -> d.getNombre().equalsIgnoreCase(depName))
                            .findFirst().orElse(null);
                    if (dep == null) {
                        System.out.println("No se encuentra el departamento");
                    } else {
                        dep.getEmpleados().forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Introduce nombre del departamento: ");
                    depName = sc.nextLine();
                    dep = empresa.getDepartamentos().stream()
                            .filter(d -> d.getNombre().equalsIgnoreCase(depName))
                            .findFirst().orElse(null);
                    if (dep == null) {
                        System.out.println("No existe el departamento");
                    } else {
                        System.out.print("Introduce NIF del empleado: ");
                        String nif = sc.nextLine();
                        Empleado emp = dep.getEmpleados().stream()
                                .filter(e -> e.getNif().equalsIgnoreCase(nif))
                                .findFirst().orElse(null);
                        if (emp == null) {
                            System.out.println("No se encuentra el empleado en el departamento");
                        } else {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        sc.close();
    }

    public static void main(String[] args) {
        new CompanyApp().run();
    }
}

