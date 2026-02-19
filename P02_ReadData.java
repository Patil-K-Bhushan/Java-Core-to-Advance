import java.util.Scanner;

class P02_ReadData{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println("Integer: "+i);

        float f = sc.nextFloat();
        System.out.println("Float: "+f);

        String str = sc.next();
        System.out.println("String: "+str);

        String line = sc.nextLine();
        System.out.println("Line: "+ line);
    }
}