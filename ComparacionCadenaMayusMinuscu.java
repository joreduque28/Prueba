import java.io.InputStreamReader;

public class ComparacionCadenaMayusMinuscu {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "HELLO";
        String s3 = s1.toUpperCase();


        for (int i = 0; i < 5 ; i++) {
            if (i < 4) {
                System.out.println("Hola José esta es la vez No.:  " + i);
                //i++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Leo te quiero");
        }

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
