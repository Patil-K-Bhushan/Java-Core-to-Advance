import java.util.Scanner;

class Solution{
    public boolean isPalindrome(int n){
        if (n < 0) return false;
        int xCopy = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev == xCopy;
    }
}

class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution sln = new Solution();
        boolean b = sln.isPalindrome(num);
        if(b == true){
            System.out.println("The number is Palindrome number");
        } else{
            System.out.println("The number is not a Palindrome number");
        }

    }
}
