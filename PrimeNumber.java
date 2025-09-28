//Optimal Approach

import java.util.*;

class PrimeNumber {
    static boolean checkPrime(int n){
        int count=0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                count += 1;
            }
            if(n / i != i){
                count = count + 1;
            }
        }
        if(count == 2){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int num = sc.nextInt();

        if (checkPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();

    }
}
