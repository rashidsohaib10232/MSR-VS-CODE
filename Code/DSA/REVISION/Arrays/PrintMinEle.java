package REVISION.Arrays;

public class PrintMinEle {
    public static void main(String[] args) {
        int[] arr = {-3,4,1,4,0,9,-1};

        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
}
