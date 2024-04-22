import java.util.Scanner;

/* 
<p>Comparación de strings</p>
*/

public class compareicion {
    public static void main(String[] args) {
        //escribe aquí tu código
        String str1, srt2;
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.nextLine();
        srt2 = scanner.nextLine();
        if (str1.equals(srt2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            //escribe aquí tu código
            System.out.println("Las cadenas son diferentes");
        }
    }
}