import java.util.Scanner;

public class MuestraELSegundoNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int primero = Integer.MAX_VALUE;
        int segundo = Integer.MAX_VALUE;

        while (teclado.hasNextInt()) {
            int numero = teclado.nextInt();

            if (numero < primero) {
                segundo = primero;
                primero = numero;
            } else if (numero > primero && numero < segundo) {
                segundo = numero;
            }
        }
        System.out.println(segundo);
    }
}
