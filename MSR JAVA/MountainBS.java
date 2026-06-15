public class MountainBS {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,5,8,7,6,0,-2,-4,-6};
        int n = arr.length;
        int lo=0, hi = n-1;
        for(int i =0; i<n-1; i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                System.out.println(i);
                System.out.println(arr[i]);
            }
        }
    }
    
}
