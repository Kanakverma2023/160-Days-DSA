public class ReverseArray {

    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        // Swap elements from both ends moving towards center
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        reverseArray(arr);

        // Print 
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
