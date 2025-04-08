package unidad1;
  import java.util.Scanner;
public class controlejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.println("Ingresa el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número:");
        int numero3 = scanner.nextInt();

        int mayor;

        // Comparar los números utilizando estructuras if-else
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        // Imprimir el número mayor
        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}

