//OPTIMAL APPROACH
//Strives A2Z Sheet

import java.util.*;

class PrintDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a number: ");
        int n = sc.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        System.out.print("Divisors of " + n + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }

        sc.close();
    }
}
