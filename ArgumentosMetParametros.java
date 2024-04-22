import java.util.Arrays;

class ArgumentosMetParametros
{
    public static void printArraySum(int[] data)
    {
        int sum = 0;
        for (int i = 0; i < data.length; i++)
            sum = sum + data[i];
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30};
        System.out.println(months.length);
        System.out.println(Arrays.toString(months));
        int[] array = Arrays.copyOf(months, 4);
        System.out.println(Arrays.toString(array));
        printArraySum(months);
    }
}