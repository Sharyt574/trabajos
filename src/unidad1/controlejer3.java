package unidad1;
import java.util.Scanner;

public class controlejer3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Presentar el menú al usuario
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir dos números");
        int opcion = scanner.nextInt();

        // Solicitar los dos números al usuario
        System.out.println("Ingresa el primer número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo número:");
        double numero2 = scanner.nextDouble();

        // Realizar la operación seleccionada utilizando una estructura switch
        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado de la división: " + (numero1 / numero2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 4.");
                break;
        }

        scanner.close();
    }
}
