public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {2, 4, 4, 4, 6, 8, 10, 10, 12, 14, 18, 18, 18, 20};
        int tar = 10;
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = (hi + lo)/2;
            if(arr[mid]<tar){
                lo = mid+1;}
            else if (arr[mid]== tar){
                System.out.println(tar + " Found at index no. " + mid);
                return;

            }
            else{
                lo = mid-1;
            }
        //
            
        }
        System.out.println("NOT FOUND " + tar);
    }
    
}
