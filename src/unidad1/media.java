package unidad1;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("ingrese un numero");
        int num2 = scanner.nextInt();
        System.out.println("ingrese un numero");
        int num3 = scanner.nextInt();
        int sum = (num1 + num2 + num3);
        float promedio = sum / 3 ;

        System.out.println("la media es : " + promedio);

    }

}
