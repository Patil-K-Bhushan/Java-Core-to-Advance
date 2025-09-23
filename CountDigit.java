// Method 2
//Strivers Know Basic Maths Problem 1
import java.util.*;

class count{
    public int countDigit(int n){
        // Initialize a variable 'cnt' to
        // store the count of digits.
        int cnt = (int) (Math.log10(n) + 1);

        // The expression (int)(Math.log10(n) + 1)
        // calculates the number of digits in 'n'
        // and casts it to an integer.

        // Adding 1 to the result accounts
        // for the case when 'n' is a power of 10,
        // ensuring that the count is correct.

        // Finally, the result is cast
        // to an integer to ensure it is rounded
        // down to the nearest whole number.

        // Return the count of digits in 'n'.
        return cnt;
    }
}


class CountDigit{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        n = sc.nextInt();

        count c = new count();
        int digits = c.countDigit(n);
        System.out.println("The digits in number "+n+" are "+digits);

    }
}
