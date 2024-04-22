public class CuadradoB {
    public static void main(String[] args) {
                //escribe aquí tu código
                int i = 0;
                while (i <= 10) {
                    int j = 0;
                    while (j <= 20) {
                        if (i == 0 || i == 10) {
                            System.out.print("B");
                        } else if (j == 0 || j == 20) {
                            System.out.print("B");
                        } else {
                            System.out.print(" ");
                        }
                        j++;
                    }
                    i++;
                    System.out.println();

                }
    }
}
