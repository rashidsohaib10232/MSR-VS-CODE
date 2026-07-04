public class ReverseArray{
    public static void main(String[] args) {
        int [] arr = {5,23,-34,23,0,34,21};
        int n = arr.length;
        int i =0; 
        int j = n-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;  
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    
}
