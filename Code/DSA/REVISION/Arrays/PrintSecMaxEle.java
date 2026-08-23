package REVISION.Arrays;
public class PrintSecMaxEle {
    public static void main(String[] args) {
        int[] arr = {-3,4,1,4,0,9,-1,7,8};
        

        // max ele
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        // sec max

        int secMax = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i] != max && arr[i] >secMax){
                secMax = arr[i];
            }
        }

        // // third max 

        // int thirdMax = arr[0];
        // for(int i =0; i<arr.length; i++){
        //     if(arr[i] != max && arr[i] != secMax && arr[i]>thirdMax){
        //         thirdMax = arr[i];
        //     }
        // }


        System.out.println("Max ele : " + max);
        System.out.println("Second Max ele : " + secMax);
       //System.out.println("Third Max ele : " + thirdMax);


    }
}
