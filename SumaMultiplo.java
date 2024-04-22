public class SumaMultiplo {
    public static void main(String[] args) {
        //escribe aquí tu código
        int i = 0;
        int suma = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            suma = suma + i;
            i++;
        }
        System.out.println(suma);
    }
}
