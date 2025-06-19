public class MoveZeroesToEnd {

    public static void moveZeroes(int[] arr) {
        int count = 0; // Position to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
     //fil 0 for empty place
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

         //result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
