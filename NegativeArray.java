public class NegativeArray {
    public static int countNegativeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num < 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, -6, 4, 8, 1, -9};
        int result = countNegativeNumbers(arr);
        System.out.println("Result: " + result); // Output: 2
    }
}
