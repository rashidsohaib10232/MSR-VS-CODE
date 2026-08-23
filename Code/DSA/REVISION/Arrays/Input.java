package REVISION.Arrays;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //output

        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        } 


    }
}
