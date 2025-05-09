package unidad2;

import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vector = new String[5]; // Vector original
        String[] vectorInverso = new String[5]; // Vector invertido

        // Leer datos del usuario
        System.out.println("Ingrese 5 palabras:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            vector[i] = scanner.nextLine();
        }

        // Copiar elementos en orden inverso
        for (int i = 0; i < vector.length; i++) {
            vectorInverso[i] = vector[vector.length - 1 - i];
        }

        // Mostrar el vector invertido
        System.out.println("\nVector en orden inverso:");
        for (String palabra : vectorInverso) {
            System.out.println(palabra);
        }

        scanner.close();
    }

    
}
