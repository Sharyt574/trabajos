package unidad2;

import java.util.Scanner;

public class Ejercicio13 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numConductores = 3; // Puedes modificar la cantidad de conductores
        String[] nombres = new String[numConductores]; // Vector para nombres
        int[][] kms = new int[numConductores][7]; // Matriz para kms por día
        int[] total_kms = new int[numConductores]; // Vector para el total de kms

        // Ingreso de datos
        System.out.println("Ingrese los nombres y kilómetros recorridos de cada conductor:");
        for (int i = 0; i < numConductores; i++) {
            System.out.print("Nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese los kilómetros recorridos en cada día de la semana:");
            for (int j = 0; j < 7; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
                total_kms[i] += kms[i][j]; // Sumar al total de kilómetros
            }
            scanner.nextLine(); // Limpiar el buffer
        }

        // Mostrar resultados
        System.out.println("\nLista de conductores y kilómetros recorridos:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombres[i] + " ha recorrido un total de " + total_kms[i] + " km.");
        }

        scanner.close();
    }

}
