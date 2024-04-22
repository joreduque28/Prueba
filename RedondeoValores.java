import java.util.Scanner;

public class RedondeoValores {
    public static void main(String[] args) {

        //La función Math.pow() proporciona la potencia de una base y un exponente
        double resultado = Math.pow(5, 5);
        System.out.println("");
        System.out.println("");
        System.out.println(resultado); // Imprimirá 8.0

        // Creación de varibles

        double a, b, potencia;

        //Ingresar por teclado 2 números el primero la base y el segundo el exponente
        //Darán como resultado la potencia.

        System.out.println("Este programa te proporcionará conocer la potencia, ingresando la base y el exponenete.");
        System.out.print(" ");
        System.out.println(" ");
        System.out.println("Ingresa el valor de la Base:  ");
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        System.out.println("Ingresa el valor del Exponente:  ");
        b = teclado.nextDouble();
        potencia = Math.pow(a, b);
        System.out.println("EL valor de la potencia requerida es:  " + potencia);

        //Para redondear un decima a entero hacia el entero superior
        int redondeoArriba = (int) Math.round(potencia);
        System.out.println("Este es el valor usando Math.round() Redondea hacia el entero superior despues de 5, si es menor hacia el entero inferior:  " + redondeoArriba);

        //Redondea un número entero hacia arriba
        int redoarri = (int) Math.ceil(potencia);
        System.out.print(" ");
        System.out.println(" ");
        System.out.println("Math.ceil() Siempre redondea el número hacia arriba:  " + redoarri);

        // Redondea un número entero hacia abajo
        int redoinf = (int) Math.floor(potencia);
        System.out.print(" ");
        System.out.println(" ");
        System.out.println("Math.Floor() Siempre redondea el número hacia abajo:  " + redoinf);

        // (int) =  Convierte un float o double a entero, hacia abajo por ejemplo:
        System.out.print(" ");
        System.out.println(" ");
        System.out.println("Este es el valor de potencia: " + potencia);
        System.out.print(" ");
        System.out.println(" ");
        int X = (int) potencia;
        System.out.println("Este es el valor usando (int), volviendo el valor decimal a entero: " + X);

    }
}
