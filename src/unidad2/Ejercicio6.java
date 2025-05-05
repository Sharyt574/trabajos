package unidad2;

import java.util.Scanner;

public class Ejercicio6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vectores con los nombres de los meses y sus días correspondientes
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                           "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        int[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Solicitar número de mes al usuario
        System.out.print("Ingrese un número de mes (1-12): ");
        int numeroMes = scanner.nextInt();

        // Validar que el número esté dentro del rango
        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("Mes: " + meses[numeroMes - 1]);
            System.out.println("Días: " + dias[numeroMes - 1]);
        } else {
            System.out.println("Número de mes inválido. Debe ser entre 1 y 12.");
        }

        scanner.close();
    }

}
