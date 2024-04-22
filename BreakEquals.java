import java.util.Scanner;
//Este programa muestra las palabras ingresadas, pero una vez ingresada la palabra basta, sale del bucle while

public class BreakEquals {
        public static void main(String[] args) {
            //escribe aquí tu código
            Scanner teclado = new Scanner(System.in);
            while (true) {
                String palabra = teclado.nextLine();
                //System.out.println(palabra);
                if (palabra.equals("basta")) {
                    break;
                }
                System.out.println(palabra);
            }

        }
}
