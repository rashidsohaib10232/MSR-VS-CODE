package REVISION.Arrays;

public class PrintMaxEle {
    public static void main(String[] args) {
        int[] arr = {-3,4,1,4,0,9,-1};
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
