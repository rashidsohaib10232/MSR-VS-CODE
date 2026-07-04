public class FirstOccurBS {
    public static void main(String[] args) {
        int arr[] = {2, 4, 4, 4, 6, 8, 10, 10, 12, 14, 18, 18, 18, 20};
        int first = -1;
        int n = arr.length;
        int tar = 10;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == tar){
                first = mid;
                hi = mid - 1; 
            
            }
            else if (arr[mid]<tar){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        if (first !=-1){
            System.out.println(tar + " at index no. :  "+ first );
        }
        else{
            System.out.println(tar + " not found ");
        }
    }
    
}
