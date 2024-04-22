public class Main {
    public static void main(String[] args){
        System.out.println("   ");
        System.out.println("Soy el mejor programador:  Me llamo José Gregorio Reyes Duque ");
        float a; float b; float suma, resta, multiplicacion; float division;
        a=50;
        b=23;
        suma = a+b;
        resta= a-b;
        multiplicacion=a*b;
        division=a/b;
        System.out.println("estos son los valores de a y b:  " + a + " " + " y "+ b );
        System.out.println("La suma de a más b es: " + suma);
        System.out.println("La resta de a menos b es: " + resta);
        System.out.println("La Multiplicación de a por b es: " + multiplicacion);
        System.out.println("La Divivsión de a entre b es: " + division);

        if (a == b) {
            System.out.println("a y b poseen el Mismo valor");
        }
            else {
            System.out.println("Gaby y Leo tienen edades diferentes 🤩!");
        }
            if (a > b) {
                System.out.println("Leo es Mayor que Gaby");
            }
            if (b > a) {
                System.out.println("Gaby es Mayor que Leo");
            }
    }
}
