package unidad2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10]; // Vector de 10 elementos
        int cantidadIngresada = 0; // Contador de elementos ingresados

        System.out.println("Ingrese números enteros (negativo para detener):");

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Si el número es negativo, detener la entrada
            }

            vector[cantidadIngresada] = numero; // Almacenar número
            cantidadIngresada++; // Incrementar contador
        }

        // Mostrar el vector con los elementos ingresados
        System.out.println("\nElementos ingresados:");
        for (int i = 0; i < cantidadIngresada; i++) {
            System.out.print(vector[i] + " ");
        }

        scanner.close();
    }

}
