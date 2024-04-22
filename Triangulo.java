import java.util.Scanner;

/* 
Triángulo
*/

public class Triangulo {
    private static final String TRIANGLE_EXISTS = "Es un triángulo";
    private static final String TRIANGLE_DOES_NOT_EXIST = "No es un triángulo";

    public static void main(String[] args) {
        //escribe aquí tu código
        int lad1, lad2, lad3;
        Scanner scanner = new Scanner(System.in);
        lad1 = scanner.nextInt();
        lad2 = scanner.nextInt();
        lad3 = scanner.nextInt();
        if (lad1 < (lad2 + lad3) && lad2 < (lad1 + lad3) && lad3 < (lad1 + lad2)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }
    }
}
