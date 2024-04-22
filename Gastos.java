import java.util.Scanner;

public class Gastos {
    public static void main(String[] args) {
        /*Este programa calculara el valor a gastar de un salario recibido en
        porcentajes de la siguiente manera: 70% Maximo de gastos de subsistencia
        20% Maximo de deudas, 10% Minimo al ahorro.*/

        //creación de variables

        //Variable salario solicitada e introducida por teclado

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa Tú nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el valor de tú salario Mensual: ");
        float salario = teclado.nextFloat();

        float gasSubsistencia = (salario * 0.7f);
        float deudas = (salario * 0.2f);
        float ahorro = salario * 0.1f;

        // Mostrar en pantalla valores del salario, porcentaje a basico agastar
        // valor maximo a endeudarse y valor minimo de ahorro.

        System.out.println( nombre + " Tú asignación mensual es: " + salario);
        System.out.println("Tú Valor basico a gastar mensualmente es: " + gasSubsistencia);
        System.out.println("Tú Maximo valor a endeudarte es: " + deudas);
        System.out.println("Tú Valor minimo para ahorrar es: " + ahorro);

    }
}