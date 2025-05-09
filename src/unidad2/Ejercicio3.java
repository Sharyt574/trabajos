package unidad2;

import java.util.Scanner;

public class Ejercicio3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0, max = 0, min = 10;

        // Leer las notas
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Introduce la nota " + (i + 1) + " (entre 0 y 10): ");
                notas[i] = scanner.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);
            suma += notas[i];
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
        }

        // Mostrar las notas
        System.out.println("Notas introducidas:");
        for (double nota : notas) {
            System.out.println(nota);
        }

        // Mostrar resultados
        System.out.println("Nota media: " + (suma / notas.length));
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

        scanner.close();
    }

}
