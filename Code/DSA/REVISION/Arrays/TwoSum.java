package REVISION.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {-3,4,1,4,0,9,-1,7,8};

        int tar = 8;

        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==tar){
                    System.out.println(i +" "+j);
                    System.out.println(arr[i]+arr[j]);
                }
            }
        }
    }
}
