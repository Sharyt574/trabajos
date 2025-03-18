import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del operario
        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = scanner.nextDouble();
        System.out.print("Ingrese los años de antigüedad del operario: ");
        int antiguedad = scanner.nextInt();

        // Verificar las condiciones y calcular el sueldo correspondiente
        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldo = sueldo + (sueldo * 0.20); // Aumento del 20%
                System.out.println("Se otorga un aumento del 20%.");
            } else {
                sueldo = sueldo + (sueldo * 0.05); // Aumento del 5%
                System.out.println("Se otorga un aumento del 5%.");
            }
            System.out.println("El sueldo a pagar es: " + sueldo);
        } else {
            // Mostrar el sueldo sin cambios
            System.out.println("El sueldo es: " + sueldo);
        }
    }
}

