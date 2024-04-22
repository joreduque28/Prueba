import java.util.Scanner;

public class ValidarTemperatura {
    public static void main(String[] args) {
        int temperatura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la temperatura actual:  ");
        temperatura = scanner.nextInt();
        if (temperatura > 20) {
            System.out.println("Ponte una Camisa 👔");
        }else {
            if (temperatura > 10 && temperatura <= 20) {
                System.out.println("Ponte un Sueter 👘 ");
            }else {
                if (temperatura > 0 && temperatura <= 10) {
                    System.out.println("Ponte un Impermeable 🥼 ");
                }else {
                    if (temperatura < 0 ) {
                        System.out.println("Ponte un Abrigo 🧥 ");
                    }
                }
            }

        }
    }
}
