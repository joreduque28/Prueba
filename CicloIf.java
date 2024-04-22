import java.util.Scanner;

/*
Temperatura cálida o fría
*/
public class CicloIf {
    public static void main(String[] args) {
        String cold = "Hace frío afuera";
        String warm = "Hace calor afuera";
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la Temperatura Exterior:  ");
        int tempExterior = scanner.nextInt();
        if (tempExterior < 0) {

            System.out.println(cold);
        }else {
            System.out.println(warm);
        }
    }
}
