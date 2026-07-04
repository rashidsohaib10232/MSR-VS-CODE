import java.util.*;
public class SortingBubbler2 {

    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter " + arr.length + " elements:");
        for(int i = 0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }


        //bubble sort


        for(int i = 1; i<arr.length-1 ; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }


        System.out.println("Sorted array:");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }   

    
}
