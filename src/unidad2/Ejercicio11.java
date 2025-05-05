package unidad2;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5]; // Crear la matriz 5x5

        // Cargar la matriz con 1 en la diagonal y 0 en el resto
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1; // Elementos de la diagonal principal
                } else {
                    diagonal[i][j] = 0; // Elementos fuera de la diagonal
                }
            }
        }

        // Mostrar el contenido de la matriz
        System.out.println("Matriz 5x5 con la diagonal en 1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println(); // Salto de línea para cada fila
        }
    }

}
