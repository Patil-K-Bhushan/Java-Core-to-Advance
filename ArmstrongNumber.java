import java.util.*;

class isArmstrong{
    static boolean isArmstrong(int n){
       int m = String.valueOf(n).length();
       int sum = 0;
       int num = n;

       while(n>0){
           int digit = n%10;
           sum +=Math.pow(digit,m);
           n /= 10;
       }
       return sum == num? true : false;
    }
}

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int n = sc.nextInt();

        isArmstrong am = new isArmstrong();
        boolean val = am.isArmstrong(n);
        if(val == true){
            System.out.println("The number "+n+" is an Armstrong Number");
        } else{
            System.out.println("The number "+n+" is not an Armstrong Number");
        }
    }
}
