import java.util.Scanner;

public class CadenasConScanner {
    public static void main(String[] args) {
        String text = "10 20 40 80";
        System.out.println(text);

        //Creación clase Scanner con base en variable text es decir "10 20 30 40"
        Scanner console = new Scanner(text);

        //En la proxima linea la variable a contendrá el valor de 10, teniendo en cuenta el Scanner(text)
        int a = console.nextInt();
        System.out.println(a);

        // En la proxima fila b toma el valor 20 según la variable (text)
        int b = console.nextInt();
        System.out.println(b);
        int c = console.nextInt();
        System.out.println(c);
    }
}
