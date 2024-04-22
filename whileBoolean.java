import java.util.Scanner;

public class whileBoolean {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit)
        {
            String s = console.nextLine();
            isExit = s.equals("Leonor");
        }
    }
}
