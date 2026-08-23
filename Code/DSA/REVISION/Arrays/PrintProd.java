package REVISION.Arrays;

public class PrintProd {
    public static void main(String[] args) {
        int[] arr = {-3,4,1,4,-9,-1};
        int prod = 1;

        for(int i =0 ; i<arr.length; i++){
            prod*= arr[i];
        }
        System.out.println(prod);
    }
}
