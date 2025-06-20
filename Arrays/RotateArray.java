import java.util.Arrays;

public class RotateArrayLeft {

    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
  
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;

        rotateArr(arr, d);
        System.out.println("Rotated Arr: " + Arrays.toString(arr));
    }
}
