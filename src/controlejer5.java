import java.util.Scanner;

public class controlejer5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.println("Ingresa un número para generar su tabla de multiplicar:");
        int numero = scanner.nextInt();

        // Generar la tabla de multiplicar utilizando un ciclo for
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

