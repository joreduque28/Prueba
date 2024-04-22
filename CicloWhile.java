import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(console.hasNextInt())
        {
            int x = console.nextInt();
        }
    }
}
