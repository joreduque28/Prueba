import java.util.Scanner;

public class VerificarIfnidado {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int age = scanner.nextInt();
                if (age < 18)
                    if (age >= 6)
                        System.out.println("Es hora de ir a la escuela, mi niño");
                    else
                        System.out.println("Tu clase en la universidad empieza pronto");
    }
}
