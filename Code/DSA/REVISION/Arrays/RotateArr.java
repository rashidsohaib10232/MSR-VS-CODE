package REVISION.Arrays;

public class RotateArr {
    public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 5, 6, 7};
         int d = 3;

         RotateArr(arr,d);

         for(int num:arr){
            System.out.println(num+" ");
         }
    }

    static void RotateArr(int[] arr, int d){
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr, 0, n-1);
    }

    static void reverse(int[] arr, int i, int j){
        while (i<j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
    }
}
