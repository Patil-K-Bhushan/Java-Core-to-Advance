// Program 04 - Weocome User
import java.util.Scanner;

class P04_WelcomingUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your name");
        String name = sc.nextLine();

        System.out.println("Welcome " + name);
        
        sc.close();
    }
}
