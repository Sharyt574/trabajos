import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //solicitar los dos numeros
        System.out.println("ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("imgrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        //verificar si los numeros son diferentes
        if (num1 != num2) {
            //determina y mostra el mayor de los dos 
            if (num1 > num2) {
                System.out.println("el mayor es :" + num1);
            } else{
                System.out.println("el mayor es :" + num2);
            }
            
        } else{
            System.out.println("los numeros ingresados osn iguales.Ingrese numeros distintos");
        }
    }
}
