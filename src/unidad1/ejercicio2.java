package unidad1;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar las tres notas del alumno
        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();
        
        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;
        
        // Verificar si el promedio es mayor o igual a 7
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else {
            System.out.println("No promocionado");
        }
    }
}
