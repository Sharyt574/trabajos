package unidad1;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número entero positivo
        System.out.print("Ingrese un número entero positivo (máximo 3 cifras): ");
        int numero = scanner.nextInt();

        // Verificar que el número sea positivo y calcular sus cifras
        if (numero > 0 && numero <= 999) {
            if (numero < 10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (numero < 100) {
                System.out.println("El número tiene 2 cifras.");
            } else {
                System.out.println("El número tiene 3 cifras.");
            }
        } else {
            System.out.println("Error: el número ingresado no es válido. Debe ser un número positivo de hasta 3 cifras.");
        }
    }
}

