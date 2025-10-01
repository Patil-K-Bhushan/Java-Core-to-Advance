import java.util.Scanner;

class PrintNRecursion {
    static void func(int i, int n){

        // Base Condition.
        if(i>n) return;
        System.out.println(i);

        // Function call to print i till i increments to n.
        func(i+1,n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int n = sc.nextInt();
        func(1,n);
    }
}
