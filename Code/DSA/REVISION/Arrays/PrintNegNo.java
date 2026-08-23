package REVISION.Arrays;

public class PrintNegNo {
    public static void main(String[] args) {
        int[] arr = {-3,4,1,4,0,-9,-1};

        for(int i =0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}
