package unidad2;

import java.util.Scanner;

public class Ejercicio15 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matriz de equipos (15 partidos, 2 equipos por partido)
        String[][] equipos = new String[15][2];

        // Matriz de resultados (15 partidos, 2 columnas para goles de cada equipo)
        int[][] resultados = new int[15][2];

        // Ingresar los equipos
        System.out.println("Ingrese los equipos de los 15 partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Partido " + (i + 1) + " - Equipo 1: ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("Partido " + (i + 1) + " - Equipo 2: ");
            equipos[i][1] = scanner.nextLine();
        }

        // Ingresar los resultados de cada partido
        System.out.println("\nIngrese los resultados de los 15 partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();
        }

        // Mostrar los resultados de la quiniela
        System.out.println("\nResultados de la quiniela:");
        for (int i = 0; i < 15; i++) {
            System.out.println(equipos[i][0] + " " + resultados[i][0] + " - " + resultados[i][1] + " " + equipos[i][1]);
        }

        scanner.close();
    }

}
