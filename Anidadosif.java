public class Anidadosif {
    public static void main(String[] args) {
        int temperature = -1;
        if (temperature > 20) {
            System.out.println("ponte una camisa");
        }
        else // Aquí la temperatura es menor (o igual a) 20 grados
        {
            if (temperature > 10) {
                System.out.println("ponte un suéter ");
            }else // Aquí la temperatura es menor (o igual a) 10 grados
            {
                if (temperature > 0) {
                    System.out.println("ponte un impermeable");
                }else // Aquí la temperatura es menor que 0 grados
                    System.out.println("ponte un abrigo");
            }
        }
    }
}
