import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayoresOIgualesA7 = 0; // Contador para notas >= 7
        int menoresA7 = 0; // Contador para notas < 7

        // Solicitar 10 notas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = scanner.nextDouble();

            // Evaluar si la nota es >= 7 o < 7
            if (nota >= 7) {
                mayoresOIgualesA7++;
            } else {
                menoresA7++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de notas mayores o iguales a 7: " + mayoresOIgualesA7);
        System.out.println("Cantidad de notas menores a 7: " + menoresA7);
    }
}

