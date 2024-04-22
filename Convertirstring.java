import java.util.Scanner;

public class Convertirstring {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa te dirá el numero de letras incluyendo los sspacios que tiene tu nombre;");
        System.out.println("Puedes ingresar tu nombre completo con los respectivos espacios : ");
        String nombre = teclado.nextLine();
        String nombreMayuscula = nombre.toUpperCase();
        String nombreMiniscula = nombre.toLowerCase();
        int conteoNombre = nombre.length();
        System.out.println("Tu nombre tiene esta cantidad de letras incluyendo espacios: " + conteoNombre);
        System.out.println("Este fue el nombre escrito, te aparecerá en minusculas y mayusculas: " + nombreMiniscula + " " + nombreMayuscula);
    }
}
