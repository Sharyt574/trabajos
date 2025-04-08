package unidad1;
import java.util.Scanner;

public class ejercicio9 {
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

        // Mostrar el mensaje según el promedio
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
    }
}

