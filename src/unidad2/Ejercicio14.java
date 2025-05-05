package unidad2;

import java.util.Scanner;

public class Ejercicio14 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numArticulos = 5;
        int numSucursales = 4;

        double[] precios = new double[numArticulos]; // Vector de precios
        int[][] cantidades = new int[numSucursales][numArticulos]; // Matriz de ventas por sucursal

        // Ingreso de precios de los artículos
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        // Ingreso de cantidades vendidas por sucursal
        System.out.println("\nIngrese las cantidades vendidas en cada sucursal:");
        for (int i = 0; i < numSucursales; i++) {
            System.out.println("Sucursal " + (i + 1) + ":");
            for (int j = 0; j < numArticulos; j++) {
                System.out.print("Cantidad del artículo " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }

        // 1. Cantidades totales de cada artículo
        int[] totalArticulos = new int[numArticulos];
        for (int j = 0; j < numArticulos; j++) {
            for (int i = 0; i < numSucursales; i++) {
                totalArticulos[j] += cantidades[i][j];
            }
        }

        System.out.println("\nCantidad total de cada artículo:");
        for (int j = 0; j < numArticulos; j++) {
            System.out.println("Artículo " + (j + 1) + ": " + totalArticulos[j] + " unidades");
        }

        // 2. Cantidad de artículos vendidos en la sucursal 2
        int totalSucursal2 = 0;
        for (int j = 0; j < numArticulos; j++) {
            totalSucursal2 += cantidades[1][j]; // Sucursal 2 (índice 1)
        }
        System.out.println("\nCantidad total de artículos vendidos en la sucursal 2: " + totalSucursal2);

        // 3. Cantidad del artículo 3 en la sucursal 1
        System.out.println("\nCantidad del artículo 3 en la sucursal 1: " + cantidades[0][2]);

        // 4. Recaudación total de cada sucursal
        double[] totalSucursal = new double[numSucursales];
        for (int i = 0; i < numSucursales; i++) {
            for (int j = 0; j < numArticulos; j++) {
                totalSucursal[i] += cantidades[i][j] * precios[j];
            }
        }

        System.out.println("\nRecaudación total de cada sucursal:");
        for (int i = 0; i < numSucursales; i++) {
            System.out.printf("Sucursal %d: %.2f%n", (i + 1), totalSucursal[i]);
        }

        // 5. Recaudación total de la empresa
        double totalEmpresa = 0;
        for (int i = 0; i < numSucursales; i++) {
            totalEmpresa += totalSucursal[i];
        }
        System.out.printf("\nRecaudación total de la empresa: %.2f%n", totalEmpresa);

        // 6. Sucursal de mayor recaudación
        int sucursalMayor = 0;
        for (int i = 1; i < numSucursales; i++) {
            if (totalSucursal[i] > totalSucursal[sucursalMayor]) {
                sucursalMayor = i;
            }
        }
        System.out.println("\nSucursal de mayor recaudación: Sucursal " + (sucursalMayor + 1));

        scanner.close();
    }

}
