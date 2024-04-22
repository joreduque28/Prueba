import java.util.Scanner;

public class Nuevo {
    public static void main (String[] args){
        // En la linea siguiente creo una variable tipo scanner llamada teclado
        // donde podré ingresar los datos desde el teclado valga la redundancia

        Scanner teclado = new Scanner(System.in);

        // En la proxima linea muestro por pantalla "Por Favor ingrese el nombre del Ratón"

        System.out.print("Por favor ingrese el nombre del Ratón: ");

        // En la proxima linea la variable nombreDelPersonaje guardará el valor ingresado por
        // Teclado

        String nombreDelPersonaje = teclado.nextLine();
        System.out.print("Por favor ingrese el nombre del Agujero: ");
        String nomAgujero = teclado.nextLine();

        // En la proxima linea creo una varibla tipo String llamada cuento, donde guardo
        // toda la información de una historia y el mismo Ide me lo separa por lineas

        String cuento = ("Había una vez un pequeño ratón llamado " + nombreDelPersonaje + ", que vivía en un agujero acogedor llamado " + nomAgujero + " en la esquina de una vieja biblioteca. " + nombreDelPersonaje +
 " era un ratón peculiar, ya que no le interesaban los quesos ni los granos; su verdadera pasión era la lectura. \n" +
                "\n" +
                "Cada noche, después de que la biblioteca cerraba y los humanos se iban a sus hogares, " + nombreDelPersonaje +
 " salía de su escondite y se aventuraba entre las estanterías. Le encantaba explorar los títulos, oler las páginas y sumergirse en las historias de los libros. Su favorito era un viejo cuento sobre un ratón aventurero que descubría un mundo lleno de posibilidades.\n" +
                "\n" +
                "Un día, mientras hojeaba un libro de cuentos, " + nombreDelPersonaje +
 " notó algo extraño. Una pequeña puerta se abrió en una esquina del estante, revelando un pasadizo secreto. Con curiosidad, decidió adentrarse en el misterioso túnel.\n" +
                "\n" +
                "Al final del pasillo, " + nombreDelPersonaje +
 " se encontró en una sala mágica llena de personajes de cuentos que cobraban vida. Había hadas, dragones, caballeros y hasta un genio. Todos estaban encantados de conocer a un ratón tan especial.\n" +
                "\n" +
                "" + nombreDelPersonaje +

 " se unió a ellos en sus fantásticas aventuras, viviendo emocionantes historias que superaban sus más salvajes sueños. Descubrió que la magia de los cuentos no solo existía en las páginas de los libros, sino también en la vida real.\n" +
                "\n" +
                "Desde ese día, " + nombreDelPersonaje +

 " y sus nuevos amigos vivieron felices, creando y compartiendo historias inolvidables en la biblioteca encantada. Y así, el pequeño ratón descubrió que, a veces, los lugares más asombrosos y las mejores aventuras están justo al final de un pequeño pasadizo secreto. Y colorín colorado, este cuento ha terminado.");
        System.out.print(cuento);
    }
}
