public class DeclaracionContinue {
    public static void main(String[] args) {
        //escribe aquí tu código
        int i = 1;
        while (i <= 40) {
            if ((i % 7) == 0)
                continue;
            System.out.println(i);
            i++;
        }
        int j = 1;
        while (j < 20)
        {
            j++;
            if ( (j % 7) == 0)
                continue;
            System.out.println(j);
        }
    }
}