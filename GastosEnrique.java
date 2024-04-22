import java.util.Scanner;

public class GastosEnrique {
    public static void main(String[] args) {
        //declaración Variables
        float pagoEnfermera = 1300000;
        float pagoAuxilar = 260000;
        float pagoComidaaseo = 200000;
        float totalGeneral;
        float pagoTransporte;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("  ***  Este Programa Calcula los gastos mensuales de Enrique Duque  ***");
        System.out.println(" ");
        System.out.println("Ingrese el valor gastado en transportes, medicina y otros:  ");
        pagoTransporte = scanner.nextFloat();
        System.out.println(" ");
        System.out.println("EL Gasto total mensual de Enrique Duque es:  " + (pagoComidaaseo + pagoAuxilar + pagoEnfermera + pagoTransporte));
    }
}
