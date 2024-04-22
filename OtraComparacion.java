public class OtraComparacion {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "HELLO";
        String s3 = s1.toUpperCase();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }
}
