import java.time.LocalDate;

public class AnoActual {
    public static void main(String[] args) {
        LocalDate ano = LocalDate.now();
        System.out.println("Estamos en el año: " + ano);
        int valorEntero = 2147483647;
        System.out.println("el valor ingresado en CodeGym es:  " + valorEntero);
        double num1 = 10, num2 = 5, num3 = 2, num4 = 3;
        double div1 = num1 / num3;
        double div2 = num2 / num4;
        double div3 = num4 / num1;
        System.out.println(div1 + ", " + div2 + ", " + div3);
    }
}
