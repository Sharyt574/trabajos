package unidad1;
import java.util.Scanner;

public class listaarrays {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los 5 números
        double[] numeros = new double[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa 5 números:");

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular la suma de los números
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }

        // Calcular el promedio
        double promedio = suma / numeros.length;

        // Mostrar el resultado
        System.out.println("El promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}