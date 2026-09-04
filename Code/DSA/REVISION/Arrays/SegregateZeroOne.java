package REVISION.Arrays;

public class SegregateZeroOne {
    public static void main(String[] args) {
        int [] arr = {1, 0, 0, 1, 0, 1, 1};
        int n = arr.length;
        int i =0;
        int j = n-1;

        while (i<j) {
            if(arr[i]==0){
                i++;
            }

            else if (arr[j]==1){
                j--;
            }

            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
