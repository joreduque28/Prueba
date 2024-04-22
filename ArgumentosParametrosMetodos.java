class ArgumentosParametrosMetodos
{
    public static void printLines(String text, int count)
    {
        for (int i = 0; i < count; i++)
            System.out.print(text + ",");
    }

    public static void main(String[] args)
    {
        String str = "Hi";
        int n = 10;
        printLines(str, n);
    }
}