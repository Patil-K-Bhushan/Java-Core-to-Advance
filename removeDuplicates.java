//Leetcode Problem 26 Remaining

import java.util.*;

class Remove{
    static int Remove(int[] nums){
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[x]) {
                x++;
                nums[x] = nums[i];
            }
        }
        return x + 1;
    }
}


class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter numbers in an array: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Please Enter the Number");
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        Remove rm = new Remove();
        System.out.println(rm.Remove(num));
    }
}
