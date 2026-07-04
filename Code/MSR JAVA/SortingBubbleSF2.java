import java.util.*;
public class SortingBubbleSF2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }

        //bubble sort
        

        //output

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
       // System.out.println();

    
}
}
