package REVISION.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        // 2 pointer technique

        int[] arr = {-3,4,1,4,0,9,-1,7,8};
        System.out.println("Original Array");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        
        int n = arr.length;
        int i = 0, j = n-1;
        while (i<j) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;   
            i++;
            j--;
        }
        System.out.println("Reversed Array");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
