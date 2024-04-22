import java.util.Scanner;

public class ComparacionCadenasIngresadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la 1ra cadena a comparar: ");
        String a = teclado.nextLine();

        System.out.println();

        System.out.println("Ingresa la 2da cadena a comparar: ");
        String b = teclado.nextLine();
        String result = a.equals(b) ? "Las 2 cadenas ingresadas son Iguales 🍀🍀🍀" : "Las 2 cadenas ingresadas son Diferentes ❌❌❌";
        System.out.println(result);
    }
}
