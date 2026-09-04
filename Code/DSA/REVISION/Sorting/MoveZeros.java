package REVISION.Sorting;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {3,3,0,1,3,0,4,-9,0,0,24,2,42,90,0,34,0};
        int pos =arr.length-1;
        // non-zero ele
        // for(int i =0; i<arr.length; i++){
        //     if(arr[i] !=0){
        //         arr[pos] = arr[i];
        //         pos++;
        //     }
        // }

        for(int i= arr.length-1; i>=0; i--){
            if(arr[i] != 0){
                arr[pos] = arr[i];
                pos--;  
            }
        }

        

        
        
        // while(pos<arr.length){
        //     arr[pos] =0;
        //     pos++;
        // }

        while (pos>=0) {
            arr[pos] =0;
            pos--;
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
