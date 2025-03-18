import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número entero por teclado
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si es positivo, negativo o nulo (cero)
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es nulo (cero).");
        }
    }
}

