// Method 1
import java.util.*;

class count{
    public int countDigit(int n){
        int count = 0;
        while(n!=0){
           n/= 10;
           ++count;
        }
        return count;
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
