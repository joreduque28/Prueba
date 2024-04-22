import java.util.Scanner;

public class IngresarDatos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese dos información necesaria de el.

        System.out.println("Ingrese sus Nombres y Apellidos: ");
        String Nombre = scanner.nextLine();
        System.out.println("Bienvenido(a) a su Eps Saludable");
        System.out.println("Por favor Ingrese el Tipo de Usuario P = Preferencial y N = Normal");
        String Usuario = scanner.next();
        System.out.println("Ingrese su Número de Identificación: ");
        int Cedula = scanner.nextInt();

        //System.out.println("Usted ingresó un caracter diferente a P y N  vuelva a realizar la operación" );
        System.out.println("Tú número de Identificación es: " + Cedula );
        System.out.println("Y Tú Nombre completo es: " + Nombre );
        if (Usuario.equalsIgnoreCase("P")) {
            System.out.println("Eres un Usuario Preferencial😁😁😁");
        } else if (Usuario.equalsIgnoreCase("N")) {
            System.out.println("Eres un Usuario Normal");
        }
        else {
            System.out.println("Vuelve a realizar la operación, la letra ingresada no corresponde.");
            }
        }
    }

