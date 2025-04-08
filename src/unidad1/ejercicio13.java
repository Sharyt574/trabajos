package unidad1;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de empleados
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        int entre100y300 = 0; // Contador para sueldos entre $100 y $300
        int masDe300 = 0;     // Contador para sueldos mayores a $300
        double sumaSueldos = 0; // Total de sueldos pagados

        // Leer los sueldos de cada empleado
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = scanner.nextDouble();

            // Validar que el sueldo esté entre $100 y $500
            if (sueldo >= 100 && sueldo <= 500) {
                sumaSueldos += sueldo; // Sumar al total de sueldos

                if (sueldo <= 300) {
                    entre100y300++;
                } else {
                    masDe300++;
                }
            } else {
                System.out.println("Error: el sueldo debe estar entre $100 y $500.");
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de empleados con sueldos entre $100 y $300: " + entre100y300);
        System.out.println("Cantidad de empleados con sueldos mayores a $300: " + masDe300);
        System.out.println("El total que gasta la empresa en sueldos es: $" + sumaSueldos);
    }
}

