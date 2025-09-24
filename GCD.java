//GCD(Greatest Common Divisor of Two Numbers)
//BruteForce Approach
import java.util.Scanner;

class findGCD{
    static int findGCD(int n1, int n2){
        int gcd = 1;
        for(int i=1; i<=Math.min(n1,n2); i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}

class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter two Numbers: ");
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        findGCD gcd = new findGCD();
        int divisor = gcd.findGCD(N1,N2);

        System.out.println("GCD of number "+N1+" & "+N2+" is "+divisor);
    }
}
