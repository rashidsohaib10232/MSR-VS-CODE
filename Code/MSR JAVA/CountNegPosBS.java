public class CountNegPosBS {
    public static void main(String[] args) {
        int arr[] = {-5,-3,-2,-1,-1,0,0,3,4,6,7,8,9,10,11};
        int n = arr.length;
        int lo = 0, hi = n-1;
        int neg = 0;
        int pos = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] >0){
                hi = mid-1;
                
            }
            else{
                lo = mid+1;
            }
        }
        neg = lo;
            
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] <0){
                lo = mid+1;
                
            }
            else{
                hi = mid-1;
                
            }
        
        


        }
        pos = n - lo;

        System.out.println(pos + " "+neg);
            

        
    }
    
}
