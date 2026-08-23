package REVISION.Arrays;

public class MultOddAddEven {
    public static void main(String[] args) {
        int[] arr = {-3,4,1,4,0,9,-1,7,8};
        int[] newarr = new int [arr.length];

        for(int i =0; i<arr.length; i++){
            if(arr[i]%2==0){
                newarr[i] = arr[i]+10;
            } else {
                newarr[i] = arr[i]*2;
            }
        }

        for(int ele : newarr){
            System.out.print(ele+" ");
        }
        
    }
}
