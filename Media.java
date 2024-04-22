import java.util.Scanner;

/*
Lectura de números
*/

public class Media {

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el 1er número para calclular la Media Aritmetica: " );
        int a = scanner.nextInt();
        System.out.println("Ingresa el 2do número para calclular la Media Aritmetica: " );
        int b = scanner.nextInt();
        System.out.println("Ingresa el 3er número para calclular la Media Aritmetica: " );
        int c = scanner.nextInt();
        int mediaAritmetica = ( a + b + c )/ 3;
        System.out.println("EL valor de la Media Aritmetica es: " + mediaAritmetica);
    }
}
