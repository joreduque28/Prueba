import java.util.Scanner;
public class MuestraScanner {
    public static void main(String[] args)
    {
        String str = "1200 20 40 60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(a + b + c + d);
    }
}
