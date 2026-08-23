package REVISION.Arrays;

public class SearchInArr {
    public static void main(String[] args) {
        int[] arr = {-3,4,1,4,0,9,-1,7,8};

        int tar = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i]==tar){
                System.out.println(tar);
                System.out.println(i);
            }
        }
    }
}
