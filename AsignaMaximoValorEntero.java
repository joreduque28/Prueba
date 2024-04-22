
import java.util.Scanner;

public class AsignaMaximoValorEntero {
    public static void main(String[] args) {
        //escribe aquí tu código

        Scanner teclado = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        while (teclado.hasNextInt()) {
            int x = teclado.nextInt();

            if (x < min ) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
