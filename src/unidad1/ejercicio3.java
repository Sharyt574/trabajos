package unidad1;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número por teclado
        System.out.print("Ingrese un número positivo de uno o dos dígitos (1..99): ");
        int numero = scanner.nextInt();

        // Verificar si el número es válido y mostrar el mensaje correspondiente
        if (numero >= 1 && numero <= 99) {
            if (numero < 10) {
                System.out.println("El número tiene un dígito.");
            } else {
                System.out.println("El número tiene dos dígitos.");
            }
        } else {
            System.out.println("El número ingresado no está en el rango válido (1..99).");
        }
    }
}

