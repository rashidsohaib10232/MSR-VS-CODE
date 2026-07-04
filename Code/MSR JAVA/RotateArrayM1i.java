public class RotateArrayM1i {
    // Utility method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, -8, 0, 2, 0, 1, 1, 96};
        int d = 3; // rotate by 3 positions
        int n = arr.length;

        // Step 1: reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: reverse remaining elements
        reverse(arr, d, n - 1);

        // Step 3: reverse whole array
        reverse(arr, 0, n - 1);

        // Print rotated array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}