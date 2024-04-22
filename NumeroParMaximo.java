import java.util.Scanner;
    //Este programa permite ingresar varios múmeros por teclado, confirmar si es par y mostrar el mayor.

public class NumeroParMaximo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numParMaximo = Integer.MIN_VALUE;

        while (teclado.hasNextInt()) {
            int numero = teclado.nextInt();
            if (numero % 2 == 0 && numero > numParMaximo) {
                numParMaximo = numero;
            }
        }
        System.out.println(numParMaximo);
    }
}
