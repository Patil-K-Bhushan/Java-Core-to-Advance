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

class linkedHashSet{
    static void StoreUniqueElement(){
        LinkedHashSet<Integer> LHS = new LinkedHashSet<>();
        int[] a = {0,0,0,0,0,1,1,1,1,2,2,2,2,3,3,3,3,6,10,7,9,};

        for(int i=0; i<a.length; i++){
            LHS.add(a[i]);
        }
        System.out.println(LHS);
    }
}

class hashMap{
    static void KeyPair(){
        HashMap<Integer,Integer> HM = new HashMap<>();
        int[] a = {0,0,0,0,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,5,5,5};

        for(int i=0; i<a.length; i++){
            if(HM.containsKey(a[i])){
                int temp = HM.get(a[i]);
                HM.replace(a[i],temp+1);
            } else{
                HM.put(a[i],1);
            }
        }
        System.out.println(HM);
    }
}

 class linkedHashMap{
    static void Sort(){
        LinkedHashMap<Integer,String> LHM = new LinkedHashMap<>();

        LHM.put(15,"Paneer");
        LHM.put(10,"Sushi");
        LHM.put(25,"Paratha");
        LHM.put(30,"Biryani");

        System.out.println(LHM);
    }
 }

 class treeHashMap{
    static void THM(){
        TreeMap<Integer,String> TM = new TreeMap<>();

        TM.put(25,"PavBhaji");
        TM.put(10,"Kaju Curry");
        TM.put(16,"MeduWada");
        TM.put(15,"Idli");

        System.out.println(TM);
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

        linkedHashSet LHS = new linkedHashSet();
        LHS.StoreUniqueElement();
        System.out.println();

        hashMap HM = new hashMap();
        HM.KeyPair();
        System.out.println();

        linkedHashMap LHM = new linkedHashMap();
        LHM.Sort();
        System.out.println();

        treeHashMap THM = new treeHashMap();
        THM.THM();
        System.out.println();
    }
}
