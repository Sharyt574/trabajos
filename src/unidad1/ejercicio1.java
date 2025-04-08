package unidad1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la carga de dos números desde el teclado
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Verificar cuál número es mayor y realizar las operaciones correspondientes
        if (numero1 > numero2) {
            double suma = numero1 + numero2;
            double diferencia = numero1 - numero2;
            System.out.println("La suma de los números es: " + suma);
            System.out.println("La diferencia de los números es: " + diferencia);
        } else {
            double producto = numero1 * numero2;
            System.out.println("El producto de los números es: " + producto);
            if (numero2 != 0) { // Comprobar que no se divide por cero
                double division = numero1 / numero2;
                System.out.println("La división del primero respecto al segundo es: " + division);
            } else {
                System.out.println("No es posible realizar la división, el segundo número es cero.");
            }
        }
    }
}
