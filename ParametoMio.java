public class ParametoMio {
    public static void main(String[] args) {
        sumar(2, "Dios me salvo", 40, 50);
    }
    public static void sumar(int valor, String texto, int a, int b) {
        int suma = a + b;
        for (int x = 10; x > valor; x--) {
            System.out.println(texto + " " + suma);
            suma++;
        }
    }
}
