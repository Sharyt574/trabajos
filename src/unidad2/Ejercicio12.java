package unidad2;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[][] marco = new int[5][15]; // Crear la matriz 5x15

        // Rellenar la matriz con 1 en los bordes y 0 en el interior
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1; // Bordes con 1
                } else {
                    marco[i][j] = 0; // Interior con 0
                }
            }
        }

        // Mostrar la matriz en pantalla
        System.out.println("Matriz 5x15 con marco de 1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println(); // Salto de línea por fila
        }
    }

}
