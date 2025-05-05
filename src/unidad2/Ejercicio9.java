package unidad2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = 5;
        int[] tempMin = new int[dias];
        int[] tempMax = new int[dias];

        // Ingreso de temperaturas
        System.out.println("Ingrese las temperaturas mínimas y máximas de 5 días:");
        for (int i = 0; i < dias; i++) {
            System.out.print("Día " + (i + 1) + " - Mínima: ");
            tempMin[i] = scanner.nextInt();
            System.out.print("Día " + (i + 1) + " - Máxima: ");
            tempMax[i] = scanner.nextInt();
        }

        // Mostrar temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < dias; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2.0;
            System.out.println("Día " + (i + 1) + ": " + media + "°C");
        }

        // Encontrar los días con menor temperatura mínima
        int tempMinimaGlobal = tempMin[0];
        for (int i = 1; i < dias; i++) {
            if (tempMin[i] < tempMinimaGlobal) {
                tempMinimaGlobal = tempMin[i];
            }
        }
        System.out.println("\nDías con menor temperatura mínima:");
        for (int i = 0; i < dias; i++) {
            if (tempMin[i] == tempMinimaGlobal) {
                System.out.println("Día " + (i + 1) + " con " + tempMin[i] + "°C");
            }
        }

        // Buscar días con temperatura máxima igual a la ingresada por el usuario
        System.out.print("\nIngrese una temperatura máxima para buscar: ");
        int tempBuscada = scanner.nextInt();
        boolean encontrado = false;
        System.out.println("Días con temperatura máxima de " + tempBuscada + "°C:");
        for (int i = 0; i < dias; i++) {
            if (tempMax[i] == tempBuscada) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay ningún día con esa temperatura máxima.");
        }

        scanner.close();
    }

}
