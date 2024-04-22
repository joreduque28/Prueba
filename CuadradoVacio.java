public class CuadradoVacio {
    public static void main(String[] args) {
        // este ejercicio esta en el teorico 5, la idea es que imprima la letra A
        // de la siguiente manera:
        /*  AAAAA
            AAAAA
            AAAAA
            AAAAA
         */

                int n = 0;
                while (n < 4) {
                    int m = 0;
                    while (m < 5) {
                        System.out.print("A");
                        m++;
                    }
                    System.out.println();
                    n++;
                }
                // modificarlo para que no imprima la A del medio en cada ciclo

                int k = 0;
                while (k < 4) {
                    int m = 0;
                    while (m < 5) {

                        if (m != 2) {
                            System.out.print("A");
                        } else {
                            System.out.print(" ");
                        }
                        m++;
                    }
                    System.out.println();
                    k++;
                }
    }

}
