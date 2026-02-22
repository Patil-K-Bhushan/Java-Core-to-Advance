// Program 06 - Variables and Literals

class P06_VariablesAndLiterals{
    public static void main(String[] args) {

        // Variables
        int a; // Variable Declaration
        int b = 123; // Variable Initialization
        float f = 123.5f; // 123.5f Here f shows floating value
        char c = 'A';

        /*
            Rules for Variable Names
                1. Case Sensitive
                2. Contains Alphabets, Numbers, _ or $
                3. Start with Alphabet, _ or $
                4. Should not be a keyword
                5. Should not be a class name, if class is also in use
                6. No limit on length of name
                7. Follow Camel Cases
        */ 

        // Literals
        int value = 25; // Here 25 is a Literal

        /*
            Literal Types
              1. byte, short, int -> int literals
              2. long -> L or l are literals
              3. float -> F or f are literals
              4. double -> d or D are literals
              5. char -> stored in ''
              6. String -> stored in " "
              7. boolean -> true / false
         */

        /*
          Literals in different number system
            for decimal -> int i = 10; -> output - 10
            for binary -> int a = 0b1010; -> output - 10
            for octal -> int b = 012 -> output - 10
            for hexadecimal -> int c = 0xA; -> output - 10
        */
    }
}