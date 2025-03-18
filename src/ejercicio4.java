import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el sueldo de la persona
        System.out.print("Ingrese el sueldo de la persona: ");
        double sueldo = scanner.nextDouble();

        // Verificar si el sueldo supera los 3000 dólares
        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos.");
        } else {
            System.out.println("No está obligado a abonar impuestos.");
        }
    }
}

