package unidad2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] vector = new int[10]; // Declarar el vector de tamaño 10
        Random rand = new Random(); // Generador de números aleatorios

        // Inicializar el vector con valores aleatorios entre 1 y 100
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100) + 1;
        }

        // Mostrar el vector antes de ordenar
        System.out.println("Vector original:");
        System.out.println(Arrays.toString(vector));

        // Ordenar el vector de menor a mayor
        Arrays.sort(vector);

        // Mostrar el vector ordenado
        System.out.println("Vector ordenado:");
        System.out.println(Arrays.toString(vector));
    }

    
}
