public class Buleano {
    public static void main(String[] args) {
        int age = 35;
        boolean isYoung = (age < 18);
        boolean isOld = (age > 65);
        if (!isYoung || !isOld) {
            System.out.println("You can work");
        }
    }
}