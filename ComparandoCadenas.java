public class ComparandoCadenas {
    public static void main(String[] args) {
        String text = "Hi";
        String message = text;

        // Imprimir el valor de las variabes text y message
        System.out.println("Valor de la variable text: "+ text + " " + "Valor de la variable message: "+ message);

        String s1 = text.toUpperCase();

        // Imprimir el valor de s2 para comparar
        System.out.println(s1);
        String s2 = text.toUpperCase();

        // Imprimir el valor de s2 para comparar
        System.out.println(s2);

        System.out.println(text == message);
        System.out.println(text == s1);
        System.out.println(text.equals(s1));

        // Usando el metodo equals puedo comparar las cadenas sin tener que evaluar la direcciones donde se encuentran ubicados
        // compararemos utilizando el doble igual igual (==) con las dos variables y nos damos cuenta que el valor es diferente
        // Por un lado true y por el otro false
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
