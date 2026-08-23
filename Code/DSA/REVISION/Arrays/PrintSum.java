package REVISION.Arrays;

public class PrintSum {
    public static void main(String[] args) {
        int[] arr = {3,4,1,4,0,9,-1};
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
