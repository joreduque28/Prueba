public class ArreglosComienzo {
    public static void main(String[] args) {
        int[] arreglo = new int[100];
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;
        arreglo[5] = 60;
        arreglo[6] = 70;
        arreglo[7] = 80;
        arreglo[8] = 90;
        arreglo[9] = 100;
        arreglo[10] = 110;

        for (int i = 0; i < 11; i++) {
            System.out.println("Este es el valor del arreglo según el subindice   " + i + " " + arreglo[i]);
        }
    }
}
