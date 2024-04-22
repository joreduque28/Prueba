import java.util.Objects;
import java.util.Scanner;

public class CadenasComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Ese programa permite comparar 2 palabras o cadenas de texto ingresadas ***");
        System.out.println("Ingresa una palabra o una cadena de caracteres: ");
        String text = scanner.nextLine();
        System.out.println("Ingresa palabra o una cadena de caracteres a comparar: ");
        String message = scanner.nextLine();;
        //The addresses are equal
        //System.out.println(text == message);
        if (Objects.equals(text, message)) {
            System.out.println("Las dos palabras son iguales  " + text + " = " + message);
        }
        else {
            System.out.println("Las Palabras ingresadas son diferentes  " + (text.toLowerCase()) + " ≠ " + message.toUpperCase());
        }
    }
}
