public class BubbeSort {
    public static void main(String[] args) {
       // int [] arr = {2,1,0,-2,-4,-2,5};
        int []arr = {-4,-2,-2,0,1,2,5};
        
        int n = arr.length;
        for(int i =0; i <n-1; i++){
            boolean isSorted = true;
            for(int j =0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    isSorted = false;
                }
            }
            if(isSorted==true) break;
        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + ",");
        }
    }
    
}
