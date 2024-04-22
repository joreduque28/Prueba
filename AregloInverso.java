import java.util.Scanner;

public class AregloInverso {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
