import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("*** Este Programa Identifica si una persona es mayor o menor de Edad ***");
        System.out.print(" ");
        System.out.println("Por favor ingresa tú Edad:  ");
        int edad = scanner.nextInt();
        String resultado = (edad >= 18) ? "Persona mayor de Edad" : "Eres menor de Edad, Favor venir con un tutor o acudiente";

        System.out.println(resultado);
    }
}
