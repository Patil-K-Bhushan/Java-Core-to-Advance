import java.util.Scanner;

class PrintName {
    static void Name(int i,int n,String name){
        if(i>n) return;
        System.out.println(name);
        Name(i+1,n,name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter how many times you want to print your name: ");
        int n=sc.nextInt();
        System.out.println("Please Enter your name: ");
        String name = sc.next();
        Name(1,n,name);

        sc.close();
    }
}
