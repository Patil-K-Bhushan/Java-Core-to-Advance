public class PrintEvenArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 2, 7, 6, 9};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
