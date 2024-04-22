import java.util.Scanner;

public class IvaPrecio {
    public static void main(String[] args) {

        //Este programa permite ingresr un valor del producto y realizar
        // el descuento del 19%
        // Nota: Si quisieramos saber el valor de la compra del producto seria poner el
        // signo mas(+) en la formula del valor TotalPagar
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor del producto: $");
        float iva = 19;
        float precio = teclado.nextFloat();
        float IvaDescontar = precio * iva / 100;
        float TotalPagar = precio - IvaDescontar;
        System.out.println("El precio a pagar es: $" + TotalPagar);
    }
}
