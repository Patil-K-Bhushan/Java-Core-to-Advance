//Strivers A2Z Series Pattern

class Pattern1{
    static void Pattern1() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern2{
    static void Pattern2(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern3{
    static void Pattern3(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

class Pattern4{
    static void Pattern4(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}

class Pattern5 {
     static void Pattern5(){
         int n=5;
         for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
         }
     }
}

class Pattern6{
    static void Pattern6(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
}

class Pattern7{
    static void Pattern7(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            for(int l=1; l<=n-i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Pattern8{
    static void Pattern8(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Pattern9{
    static void Pattern9(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            for(int l=1; l<=n-i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Pattern10{
    static void Pattern10(){
        int n=5;
        for(int i=0; i<=2*n-1; i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern11{
    static void Pattern11(){
        int n=5,num;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                num = 0;
            }else{
                num = 1;
            }
            for(int j=1; j<=i; j++) {
                System.out.print(num);
                num = 1 - num;
            }
            System.out.println();
        }
    }
}

class Pattern12{
    static void Pattern12(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*n-(2*i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

class Pattern13{
    static void Pattern13(){
        int n=5,num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num=num+1;
            }
            System.out.println();
        }
    }
}

class Pattern14{
    static void Pattern14(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(char c='A'; c<'A'+i; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

class Pattern15{
    static void Pattern15(){
        int n=5;
        for(int i=0; i<n; i++){
            for(char c='A'; c<='A'+(n-i-1); c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}




public class Patterns {
    public static void main(String[] args) {
        Pattern1 p1 = new Pattern1();
        p1.Pattern1();
        System.out.println();

        Pattern2 p2 = new Pattern2();
        p2.Pattern2();
        System.out.println();

        Pattern3 p3 = new Pattern3();
        p3.Pattern3();
        System.out.println();

        Pattern4 p4 = new Pattern4();
        p4.Pattern4();
        System.out.println();

        Pattern5 p5 = new Pattern5();
        p5.Pattern5();
        System.out.println();

        Pattern6 p6 = new Pattern6();
        p6.Pattern6();
        System.out.println();

        Pattern7 p7 = new Pattern7();
        p7.Pattern7();
        System.out.println();

        Pattern8 p8 = new Pattern8();
        p8.Pattern8();
        System.out.println();

        Pattern9 p9 = new Pattern9();
        p9.Pattern9();
        System.out.println();

        Pattern10 p10 = new Pattern10();
        p10.Pattern10();
        System.out.println();

        Pattern11 p11 = new Pattern11();
        p11.Pattern11();
        System.out.println();

        Pattern12 p12 = new Pattern12();
        p12.Pattern12();
        System.out.println();

        Pattern13 p13 = new Pattern13();
        p13.Pattern13();
        System.out.println();

        Pattern14 p14 = new Pattern14();
        p14.Pattern14();
        System.out.println();

        Pattern15 p15 = new Pattern15();
        p15.Pattern15();
        System.out.println();
    }
}
