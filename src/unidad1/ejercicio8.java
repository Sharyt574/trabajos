package unidad1;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad total de preguntas y las contestadas correctamente
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();
        System.out.print("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int correctas = scanner.nextInt();

        // Calcular el porcentaje de respuestas correctas
        if (totalPreguntas > 0) { // Validar que el total de preguntas no sea 0
            double porcentaje = ((double) correctas / totalPreguntas) * 100;

            // Determinar el nivel basado en el porcentaje
            if (porcentaje >= 90) {
                System.out.println("Nivel máximo");
            } else if (porcentaje >= 75) {
                System.out.println("Nivel medio");
            } else if (porcentaje >= 50) {
                System.out.println("Nivel regular");
            } else {
                System.out.println("Fuera de nivel");
            }
        } else {
            System.out.println("Error: El total de preguntas debe ser mayor a 0.");
        }
    }
}

