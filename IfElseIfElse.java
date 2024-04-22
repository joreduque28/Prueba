import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el Número que quieras:  ");
        numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("EL número ingresado es Positivo:  " + numero);
        } else if (numero < 0) {
            System.out.println("EL número ingresado es Negativo:  " + numero);
        } else {
            System.out.println("EL número ingresado es Cero:  " + numero);
        }
    }
}
