import java.util.Scanner;
public class MayuMinus {

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        String conMayus = b.toUpperCase();
        String sinMayus = a.toLowerCase();
        System.out.println(c);
        System.out.println(conMayus);
        System.out.println(sinMayus);
        System.out.println(c  + " " + b + " " + a);
    }
}

