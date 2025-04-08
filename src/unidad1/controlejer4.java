package unidad1;
import java.util.Scanner;

public class controlejer4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.println("Ingresa un número para calcular su factorial:");
        int numero = scanner.nextInt();

        // Inicializar el resultado del factorial
        long factorial = 1;
        int i = 1;

        // Calcular el factorial utilizando un ciclo while
        while (i <= numero) {
            factorial *= i;
            i++;
        }

        // Imprimir el resultado del factorial
        System.out.println("El factorial de " + numero + " es " + factorial);

        scanner.close();
    }
}

