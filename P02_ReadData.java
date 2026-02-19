// PROGRAM 2 - Reading from KeyBoard
import java.util.Scanner;

class P02_ReadData{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking Integer Input
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.println("Integer: "+i);

        // Taking Float Input
        System.out.print("Enter a Float value: ");
        float f = sc.nextFloat();
        System.out.println("Float: "+f);

        // Taking String Input
        System.out.print("Enter a String: ");
        String str = sc.next();
        System.out.println("String: "+str);

        // Taking Line Input
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        System.out.println("Line: "+ line);
    
        sc.close();
    }
}