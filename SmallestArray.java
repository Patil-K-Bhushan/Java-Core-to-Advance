public class SmallestArray {
    public static int findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {2, -6, 4, 8, 1, -9};
        int result = findSmallest(arr);
        System.out.println("Result: " + result); // Output: -9
    }
}
