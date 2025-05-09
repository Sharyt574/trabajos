package unidad2;

import java.util.Scanner;

public class Ejercicio7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de los vectores
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        // Ingresar valores para vector1
        System.out.println("Ingrese 5 valores para vector1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        // Ingresar valores para vector2
        System.out.println("Ingrese 5 valores para vector2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        // Calcular la suma de los vectores
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // Mostrar el resultado
        System.out.println("\nVector resultante (vector3 = vector1 + vector2):");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector3[i]);
        }

        scanner.close();
    }

}
