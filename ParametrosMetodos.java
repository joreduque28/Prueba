class ParametrosMetodos
{
    public static void printLines(String text, int count)
    {
        for (int i = 0; i < count; i++)
            System.out.println(text);
    }

    public static void main(String[] args)
    {
        printLines("Hi", 10);
        printLines("Bye", 20);
    }
}
