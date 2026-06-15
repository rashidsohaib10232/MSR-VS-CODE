public class DesBS {
    public static void main(String[] args) {
        int[] arr = {30, 25, 25, 20, 15, 15, 10, 5};
        int n = arr.length;
        int tar = 10;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]> tar){
                lo = mid+1;
            }
            else if(arr[mid]<tar){
                hi = mid-1;
            }
            else{
                System.out.println("Element found at index: " + mid);
                return;
            }
                

        }
        System.out.println("Element not found ");

    }
}
