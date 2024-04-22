import java.util.Scanner;

public class EvaluacionEdad {
    public static void main(String[] args) {
                String militaryCommissar = ", has sido reclutado para el servicio militar";
                //escribe aquí tu código
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el Nombre:  ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la Edad:  ");
                int edad = scanner.nextInt();
                if (edad >= 18 && edad <= 28) {
                    System.out.println(nombre + " " + militaryCommissar );
                }
    }
}
