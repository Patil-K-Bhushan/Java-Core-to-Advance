public class SecondLargestArray {
    public static String secondLargest(int[] arr) {
        if (arr.length < 2) return "Array should have at least two numbers";
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? "No second largest found" : String.valueOf(second);
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 5, 2, 7, 9};
        System.out.println(secondLargest(arr));
    }

}
