package unidad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();

        // Ingreso de datos
        System.out.println("Ingrese el nombre y la edad de cada alumno ('*' para finalizar):");

        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            if (nombre.equals("*")) {
                break; // Terminar la entrada de datos
            }

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            nombres.add(nombre);
            edades.add(edad);
        }

        // Mostrar alumnos mayores de edad
        System.out.println("\nAlumnos mayores de edad (18+ años):");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        // Encontrar los alumnos más mayores
        if (!edades.isEmpty()) {
            int edadMaxima = edades.stream().max(Integer::compare).orElse(0);
            System.out.println("\nAlumno(s) con mayor edad:");
            for (int i = 0; i < edades.size(); i++) {
                if (edades.get(i) == edadMaxima) {
                    System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                }
            }
        }

        scanner.close();
    }

}
