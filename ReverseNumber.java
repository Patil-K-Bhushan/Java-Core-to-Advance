import java.util.Scanner;

class Reverse{
    static int Reverse(int n){
        long rev = 0;
        n = Math.abs(n);
        while (n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }
        if (rev > Integer.MAX_VALUE) return 0;
        return n < 0 ? (int)-rev : (int)rev;
    }
}

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int number = sc.nextInt();

        Reverse rev = new Reverse();
        int reversed = rev.Reverse(number);
        System.out.println("The reversed number is: "+reversed);
    }
}
