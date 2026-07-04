public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {10,-8,2,12,10,0,6};

        for(int i =0; i<arr.length-1; i++){
            int smallest =i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){  //for min first if(arr[smallest]<arr[j]){
                    smallest =j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + ",");
        }
       
    }
    
}
