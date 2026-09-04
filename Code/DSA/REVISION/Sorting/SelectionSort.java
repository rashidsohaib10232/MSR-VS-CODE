package REVISION.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {43,23,1,90,0,2};
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            int mid = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[mid]){
                    mid=j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mid];
            arr[mid]= temp;
        }

        for(int ele : arr){
            System.out.print(ele+",");
        }
    }
}
