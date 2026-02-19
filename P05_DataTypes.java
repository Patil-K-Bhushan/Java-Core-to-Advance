// Program 05 - All Primitve Data Types with Range
import java.util.Scanner;

class P05_DataTypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Integers Values- Byte, Short, Int, Long

        // Byte
        System.out.println("Enter a byte data type which is of Range: -128 to 127");
        byte b = sc.nextByte();
        System.out.println("This is Byte Data Type: "+ b);

        // Short
        System.out.println("Enter a short data type which is of Range: -32768 to 32767");
        short s = sc.nextShort();
        System.out.println("This is short: "+ s);

        // Int
        System.out.println("Enter a int data type which is of Range: -2147483648 to 2147483647");
        int i = sc.nextInt();
        System.out.println("This is short: "+ i);

        // Long
        System.out.println("Enter a long data type which is of Range: -9223372036854775808 to 9223372036854775807");
        long l = sc.nextLong();
        System.out.println("This is long: "+ l);


        // Floating (Decimal) Values- Float, Double

        // Float
        System.out.println("Enter a float data type which is of Range: ±1.4E-45 to ±3.4E+38");
        float f = sc.nextFloat();
        System.out.println("This is float: "+ f);

        //Double
        System.out.println("Enter a double data type which is of Range: -4.9E-324 to 4.9E-324");
        double d = sc.nextFloat();
        System.out.println("This is double: "+ d);

        
        // Character Values - Char, String (Contains Unicode)
        
        // Char
        System.out.println("Enter a char data type which is of Range: 0 to 65535");
        char c = sc.next().charAt(0);
        System.out.println("This is char: "+ c);
        
        // String
        System.out.println("Enter a String data type which does not have any specific range");
        String str = sc.next();
        System.out.println("This is String: "+ str);


        // Boolean Values - bool

        //bool
        System.out.println("Bool data type contains True of False as a value");

        sc.close();
    }
}
