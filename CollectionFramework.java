import java.util.*;

class arrayList{
    static void arrayList(){
        int ch;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        do{
            System.out.println("1.Add in ArrayList\n2.Display ArrayList\n3.Stop\n");
            ch = sc.nextInt();
            switch (ch){
                case 1: String temp = sc.next();
                    al.add(temp);
                    break;
                case 2: System.out.println(al);
                    break;
                case 3: System.out.println("Program has been stopped Successfully");
                    break;
                default:System.out.println("Please enter Valid input");
                    break;
            }
        }while(ch!=3);
    }
}

class hashSet{
    static void RemoveDuplicateNumber(){
        int[] a = {0,0,0,0,1,1,1,1,2,2,2,3,3};
        HashSet<Integer> HS = new HashSet<>();

        for(int i=0; i<a.length; i++){
            HS.add(a[i]);
        }
        System.out.println(HS);
    }
}


class CollectionFramework {
    public static void main(String[] args) {
        arrayList AL = new arrayList();
        AL.arrayList();
        System.out.println();

        hashSet HS = new hashSet();
        HS.RemoveDuplicateNumber();
        System.out.println();
    }
}
