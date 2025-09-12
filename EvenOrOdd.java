public class EvenOrOdd {
    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        checkEvenOrOdd(18);
        checkEvenOrOdd(5);
    }
}
