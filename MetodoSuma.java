import java.util.Scanner;

class MetodoSuma
{
    public static void main(String[] args)
    {
        suma2Numeros();
        //System.out.println(resultado);
    }
    public static void suma2Numeros()
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.print("Dios te ayuda el resultado es: " + resultado);
        //System.out.println("Siempre, no se te olvide.");
    }
}
