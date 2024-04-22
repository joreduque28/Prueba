import java.util.Scanner;

public class TresNumeros {
    public static void main(String[] args) {
                //escribe aquí tu código
                int num1, num2, num3;
                Scanner scanner = new Scanner(System.in);
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                num3 = scanner.nextInt();
                if (num1 == num2 && num2 == num3){
                    System.out.println(num1 + "," + num2 + "," + num3);
                }else if (num1 == num2) {
                    System.out.println(num1 + "," + num2);
                }else if (num2 == num3) {
                    System.out.println(num2 + "," + num3);
                }else if (num1 == num3) {
                    System.out.println(num1 + "," + num3);
                } else {
                }
    }
}
