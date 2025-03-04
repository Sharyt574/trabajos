public class controlejer2 {
    public static void main(String[] args) {
        int contadorpares = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                contadorpares ++;
            }
        }
        System.out.println("hay" + contadorpares  +"numeros pares entre 1 y 100 es:" + contadorpares);
    }
}
