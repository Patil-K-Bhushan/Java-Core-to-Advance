//LeetCode 27.Remove Element from an array

import java.util.*;

class Element{
    static int remove(int num[], int val) {
        int x = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[x] = num[i];
                x += 1;
            }
        }
        return x;
    }
}


class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of an array");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Please fill an array: ");
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Please enter value to be Removed: ");
        int val = sc.nextInt();

        Element rm = new Element();
        int returnedValue = rm.remove(num,val);
        System.out.println(returnedValue);
    }
}
