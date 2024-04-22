public class MultiplicacionVariable {
    public static void main(String[] args) {
        int V = 1000;
        double total = V * V;
        System.out.println(" ");
        System.out.println("Muestra el valor total: " + total);
        System.out.println(5 * 10);
        int var = (int) (2.5);
        System.out.println(var);
        double a = 10.5d;
        int nueva = (int) (var * a);
        System.out.println(nueva);
        int X = 5, Y = 2;
        double Z = X * 1.0 / Y; //Esta instrucción convierte la respuesta en coma flotante al multiplicar por 1.0
        System.out.println(Z);
        double mira = X / Y * 1.0;
        System.out.println(mira);
        Z = (int) Math.round(Z); //esta instrucción redondea el valor de Z en 3.0
        System.out.println(Z);

    }
}
