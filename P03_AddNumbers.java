// Program 3 - Add Two numbers and display it

import java.util.Scanner;

class P03_AddNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

        System.out.println("Sum of the numbers is "+ sum);
        sc.close();
    }
}
