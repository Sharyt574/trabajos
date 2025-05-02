package unidad2;

import java.util.Random;

public class vectornum1 {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10]; // Definir el vector
        Random rand = new Random(); // Generador de números aleatorios

        // Inicializar el vector con valores aleatorios entre 1 y 10
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = rand.nextInt(10) + 1;
        }

        // Mostrar los valores con su cuadrado y cubo
        System.out.println("Número | Cuadrado | Cubo");
        System.out.println("------------------------");
        for (int num : vector_numeros) {
            System.out.printf("%6d | %8d | %4d%n", num, num * num, num * num * num);
        }
    }

    
}
