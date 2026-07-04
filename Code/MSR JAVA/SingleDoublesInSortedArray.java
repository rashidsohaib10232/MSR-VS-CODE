class SingleDoublesInSortedArray{
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;
        int lo =0, hi = n-1;
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] !=arr[mid+1]){
                System.out.println(arr[mid]);
            }
            int f = mid, s = mid;
            if(arr[mid-1] == arr[mid]){  //for grouping mid one
                f = mid-1;}
            else{
                s=mid+1;
            }

            int leftCount = f-lo;              //for counting odd and even 
            int rightCount = hi-s;

            if(leftCount%2==0){
                lo = s+1;                 //right 
            }           

            else{
                hi= f-1;
            }
            
        }
    }
}