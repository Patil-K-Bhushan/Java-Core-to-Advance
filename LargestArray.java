public class LargestArray {
    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {2, -6, 4, 8, 1, -9};
        int result = findLargest(arr);
        System.out.println("Result: " + result); // Output: 8
    }
}
